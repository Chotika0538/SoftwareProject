/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import StoreToHeaven.AddSandalWood;
import StoreToHeaven.SandalWood;
import StoreToHeaven.SandalWoodDetail;
import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SandalWooddao {
        private Workbook wb;
    private Sheet sheet;
    private final String FILE_NAME = "StoreStock.xlsx";
    private FileInputStream fileInput;
    private FileOutputStream fos;
    private ArrayList<List<String>> sandalWoodlist = new ArrayList<>();
    private String[] nameCol = { "ชื่อ","รายละเอียด" ,"pathรูปภาพ", "วัสดุ",  "ราคา","สี"};
    private ArrayList<SandalWoodDetail> sd;
    private ArrayList<SandalWood> sddList;
    private Component[] cmp;

    /*Save data in Excel file*/
    public void save(AddSandalWood sandalWood) {
        cmp = sandalWood.getPic_detailJP().getComponents();    // get SandalWoodDetail panel
        sd = new ArrayList<>();
        for (Component c : cmp){
            sd.add((SandalWoodDetail) c);
        }
    
        /*Excel*/    
        read();             // read StroeStock.xlsx
        try {           // check that StoreStock.xlsx was found
            if (sheet == null) {
                System.out.println("Sheet not found");
                return;
            }
            Row firstRow = sheet.getRow(0);
            if (firstRow == null) {       // this files valid?
                firstRow = sheet.createRow(0);          // create first row
                nameCol[0] = sandalWood.getNameTF().getText();
                /*bring all data in sandalWoodlist to create each col in valid sheet*/
                for(int j=0; j<nameCol.length; j++){
                    Cell cell = firstRow.createCell(j);
                    cell.setCellValue(nameCol[j]);
                }
            }
            for (int a=0; a<sd.size(); a++){
            String pattern = sd.get(a).getPatternTF().getText();
            String detail = sd.get(a).getDetailTA().getText();
            String path = sd.get(a).getFilePath();
            String[] material = sandalWood.getMaterialTF().getText().split(",");
            String[] price = sandalWood.getPriceTF().getText().split(",");
            String[] color = sandalWood.getColorTF().getText().split(",");
            String[] dataChecked = {pattern,detail,path,String.join(",", material),String.join(",", price),String.join(",", color)};
            boolean haveData = false ;
            for (Row row : sheet){
                Cell c = row.getCell(0);
                if(c.toString().equals(dataChecked[0])){
                    haveData = true;
                    break;
                }
            }
            if(!haveData){
               try {
                int lastRow = sheet.getLastRowNum();
                Row newRow = sheet.createRow(lastRow+1);
                newRow.createCell(0).setCellValue(pattern);
                newRow.createCell(1).setCellValue(detail);
                newRow.createCell(2).setCellValue(path);
                newRow.createCell(3).setCellValue(sandalWood.getMaterialTF().getText());
                newRow.createCell(4).setCellValue(sandalWood.getPriceTF().getText());
                newRow.createCell(5).setCellValue(sandalWood.getColorTF().getText());
               } catch (Exception e) {
                    e.printStackTrace();
               }             
           }
        }
            /*write data into StoreStock.xlsx*/
            fos = new FileOutputStream(new File(FILE_NAME));
            wb.write(fos);
            wb.close();
            fos.close();
            fileInput.close();
        } catch (Exception e) {
            e.printStackTrace(); // แสดงข้อผิดพลาด
        } finally {
            // ปิด resource ที่เปิดไว้
            try {
                if (fos != null) {
                    fos.close();
                }
                if (wb != null) {
                    wb.close();
                }
                if (fileInput != null) {
                    fileInput.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    /*Read Excel file*/
    public void read() {
        wb = null;
        try {
            fileInput = new FileInputStream(new File(FILE_NAME));
            wb = new XSSFWorkbook(fileInput);
            sheet = wb.getSheetAt(9); // เปลี่ยนไปที่ชีตแรก
        } catch (Exception err) {
            System.out.println("can't read file: " + err);
        }
    }
   
}
