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
    private ArrayList<List<String>> wreathlist ;
    private String[] nameCol = { "ชื่อ","รายละเอียด" ,"pathรูปภาพ", "วัสดุ",  "ราคา","สี"};
    private ArrayList<WreathDetail> wd;
    private ArrayList<Wreath> wList;
    private Component[] cmp;
    String name , pattern, detail, path;
    String[] material   , color;
    Double[] price;    
    
    public Wreathdao(){
        wList = new ArrayList<>();
        wd = new ArrayList<>();
        wreathlist = new ArrayList<>();
    }

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
                Cell c = row.getCell(0);
                if (c != null && c.toString().equals(dataChecked[0])) {
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
    
    /*get All Data from excel file*/
    public ArrayList<Wreath> getAll(){        
        read();
        try {
            if (sheet == null) {
                System.out.println("Sheet not found");
            }
           // String name = 
            for(Row row : sheet){
                if(row.getRowNum()==0){
                    name = row.getCell(0).getStringCellValue();
                    continue;
                }
                for(Cell cell : row){
                    if (cell == null) {
                     continue;  // ข้าม cell ที่เป็น null
                    }                 
                   switch (cell.getColumnIndex()){
                       case 0:
                           pattern = cell.getStringCellValue();
                           break;
                       case 1:
                           detail = cell.getStringCellValue();
                           break;
                       case 2:
                           path = cell.getStringCellValue();
                           break;
                       case 3:
                           material = cell.getStringCellValue().split(",");
                           break;
                       case 4:
                           String[] s = cell.getStringCellValue().split(",");
                           price = new Double[s.length];
                           //int i = 0;
                          for(int i=0; i<s.length; i++){
                               //price[i] = new Double();
                                if (s[i] != null && !s[i].isEmpty() && !s[i].equals("null")) {
                                    price[i] = Double.parseDouble(s[i]);  // แปลงเป็น double
                                } else {
                                    price[i] = 0.0;  // กำหนดค่าเริ่มต้นเป็น 0.0 หากข้อมูลไม่ถูกต้อง
                                }
                                i++;
                            }
                            break;      
                       case 5:
                           color = cell.getStringCellValue().split(",");
                           break;
                   }
                   if (name != null && pattern != null && detail != null && path != null && material != null && color != null && price != null) {
                        wList.add(new Wreath(name, pattern, detail, path, material, color, price));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileInput != null) {
                    fileInput.close();
                }
                if (fos != null) {
                    fos.close();
                }
                if (wb != null) {
                    wb.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return wList;
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
