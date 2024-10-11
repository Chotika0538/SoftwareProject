package DAO;
import java.io.BufferedInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  // Allows working with .xlsx files
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import StoreToHeaven.AddWreath;
import StoreToHeaven.WreathDetail;
import StoreToHeaven.Wreath;
import java.awt.Component;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;


public class Wreathdao {
    private Workbook wb;
    private Sheet sheet;
    private final String FILE_NAME = "StoreStock.xlsx";
    private FileInputStream fileInput;
    private FileOutputStream fos;
    private ArrayList<List<String>> wreathlist = new ArrayList<>();
    private String[] nameCol = { "ชื่อ","รายละเอียด" ,"pathรูปภาพ", "วัสดุ",  "ราคา","สี"};
    private ArrayList<WreathDetail> wd;
    private Component[] cmp;

    /*Save data in Excel file*/
    public void save(AddWreath wreath) {
        cmp = wreath.getPic_detailJP().getComponents();    // get WreathDetail panel
        wd = new ArrayList<>();
        for (Component c : cmp){
            wd.add((WreathDetail) c);
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
                nameCol[0] = wreath.getNameTF().getText();
                /*bring all data in wreathlist to create each col in valid sheet*/
                for(int j=0; j<nameCol.length; j++){
                    Cell cell = firstRow.createCell(j);
                    cell.setCellValue(nameCol[j]);
                }
            }
            //wd.size() = all component in scrollPane
            //add
            for (int a=0; a<wd.size(); a++){
            String pattern = wd.get(a).getPatternTF().getText();
            String detail = wd.get(a).getDetailTA().getText();
            String path = wd.get(a).getFilePath();
            String[] material = wreath.getMaterialTF().getText().split(",");
            String[] price = wreath.getPriceTF().getText().split(",");
            String[] color = wreath.getColorTF().getText().split(",");
            String[] dataChecked = {pattern,detail,path,String.join(",", material),String.join(",", price),String.join(",", color)};
            boolean haveData = false ;
            for (Row row : sheet){
                Cell c = row.getCell(0);//pull the value in the first cell(.getCell(0)) of that row
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
                newRow.createCell(3).setCellValue(wreath.getMaterialTF().getText());
                newRow.createCell(4).setCellValue(wreath.getPriceTF().getText());
                newRow.createCell(5).setCellValue(wreath.getColorTF().getText());
               } catch (Exception e) {
                    e.printStackTrace();
               }             
           }
        }
            /*write data into StoreStock.xlsx*/
            fos = new FileOutputStream(new File(FILE_NAME));
            wb.write(fos);
        } catch (Exception e) {
            e.printStackTrace(); // แสดงข้อผิดพลาด
        } finally {
            // ปิด resource ที่เปิดไว้
            try {
                //(fos != null) means there's still has some data left in the stream(not empty), So you have to close it. 
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
            sheet = wb.getSheetAt(1); // เปลี่ยนไปที่ชีตแรก
        } catch (Exception err) {
            System.out.println("can't read file: " + err);
        }
    }
    
}
