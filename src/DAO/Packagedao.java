package DAO;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  // สำหรับไฟล์ .xlsx
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import StoreToHeaven.AddPackage;
import StoreToHeaven.PackageDetail;
import java.awt.Component;
import StoreToHeaven.*;

public class Packagedao {
    private Workbook wb;
    private Sheet sheet;
    private final String FILE_NAME = "StoreStock.xlsx";
    private FileInputStream fileInput;
    private FileOutputStream fos;
    private ArrayList<List<String>> Packagelist = new ArrayList<>();
    private String[] nameCol = { "ชื่อแพ็คเกจ","รายละเอียด" ,"pathรูปภาพ",  "ราคา"};
    private ArrayList<PackageDetail> pg;
    private Component[] cmp;

    /*Save data in Excel file*/
    public void save(AddPackage pack) {
        cmp = pack.getPic_detailJP().getComponents();   // get WreathDetail panel
        pg = new ArrayList<>();
        for (Component c : cmp){
                pg.add((PackageDetail) c);
            
        }
    
        /*Excel*/    
        read();             // read StoreStock.xlsx
        try {           // check that StoreStock.xlsx was found
            if (sheet == null) {
                System.out.println("Sheet not found");
                return;
            }
            Row firstRow = sheet.getRow(0);
            if (firstRow == null) {       // this files valid?
                firstRow = sheet.createRow(0);          // create first row
                nameCol[0] = pack.getNameTF().getText();
                /*bring all data in wreathlist to create each col in valid sheet*/
                for(int j=0; j<nameCol.length; j++){
                    Cell cell = firstRow.createCell(j);
                    cell.setCellValue(nameCol[j]);
                }
            }
            for (int a=0; a<pg.size(); a++){
            String pattern = pg.get(a).getPatternTF().getText();
            String detail = pg.get(a).getDetailTA().getText();
            String path = pg.get(a).getFilePath();
            String[] price = pg.getPriceTF().getText().split(",");
            String[] dataChecked = {pattern,detail,path,String.join(",", price)};
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
                //newRow.createCell(3).setCellValue(wreath.getMaterialTF().getText());
                newRow.createCell(3).setCellValue(String.join(",", price));
                //newRow.createCell(5).setCellValue(wreath.getColorTF().getText());
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
            sheet = wb.getSheetAt(8); // เปลี่ยนไปที่ชีตแรก
        } catch (Exception err) {
            System.out.println("can't read file: " + err);
        }
    }
   public static void main(String[] args){
        //new Wreathdao().save();
    }
}
