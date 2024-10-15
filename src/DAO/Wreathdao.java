package DAO;
import java.io.BufferedInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  // Allows working with .xlsx files
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import StoreToHeaven.AddWreath;
import StoreToHeaven.Offering;
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
            String material = wreath.getMaterialTF().getText();
            String price = wreath.getPriceTF().getText();
            String color = wreath.getColorTF().getText();
            String[] dataChecked = {pattern,detail,path,String.join(",", material),String.join("/", price),String.join(",", color)};
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
                newRow.createCell(3).setCellValue(material);
                newRow.createCell(4).setCellValue(price);
                newRow.createCell(5).setCellValue(color);
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
            if(wb!=null){
                try{
                    wb.close();
                }catch(Exception err){
                    System.out.println(err);
                }
            }
            if(fos!=null){
                try{
                    fos.close();
                }catch(Exception err){
                    System.out.println(err);
                }
            }
             if(fileInput!=null){
                try{
                    fileInput.close();
                }catch(Exception err){
                    System.out.println(err);
                }
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
                           String[] s = cell.getStringCellValue().split("/");
                           price = new Double[s.length];
                          for(int i=0; i<s.length; i++){
                                if (s[i] != null && !s[i].isEmpty() && !s[i].equals("null")) {
                                    price[i] = Double.parseDouble(s[i]);  // แปลงเป็น double
                                } else {
                                    price[i] = 0.0;  // กำหนดค่าเริ่มต้นเป็น 0.0 หากข้อมูลไม่ถูกต้อง
                                }
                            }
                            break;      
                       case 5:
                           color = cell.getStringCellValue().split(",");
                           break;
                   }
//                   if (name != null && pattern != null && detail != null && path != null && material != null && color != null && price != null) {
//                        wList.add(new Wreath(name, pattern, detail, path, material, color, price));
//                    }

                }
                
                // ตรวจสอบค่าที่ได้ก่อนเพิ่มลง oList
                if (name != null && pattern != null && detail != null && path != null && material != null && color != null && price != null) {
                    Wreath newWreath = new Wreath(name, pattern, detail, path, material, color, price);
                    // ตรวจสอบไม่ให้มีการเพิ่มซ้ำ
                    if (!wList.contains(newWreath)) {
                        wList.add(newWreath);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(wb!=null){
                try{
                    wb.close();
                }catch(Exception err){
                    System.out.println(err);
                }
            }
             if(fileInput!=null){
                try{
                    fileInput.close();
                }catch(Exception err){
                    System.out.println(err);
                }
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
    
    
    
   
   /*delete column from excel*/
       public void deletePackageDetail(WreathDetail w) {
        read(); // Ensure the sheet is read and populated
        String pattern = w.getPatternTF().getText();
        String detail = w.getDetailTA().getText();
        double price = Double.parseDouble(w.getPriceTF().getText());
        int rowIndexToDelete = -1; // Variable to store the index of the row to delete

        // ค้นหาบรรทัดที่ตรงกัน
        for (Row row : sheet) {
            if(row.getRowNum() == 0) continue; // ข้ามแถวที่ 0 (หัวตาราง)
            String rowPattern = row.getCell(0).getStringCellValue();
            String rowDetail = row.getCell(1).getStringCellValue();
            String[] rPrice = row.getCell(4).getStringCellValue().split("/");
            double[] rowPrice = new double[rPrice.length];
            int i=0; 
            for(String s : rPrice){
                rowPrice[i] = Double.parseDouble(s);
                i++;
            }

            // เปรียบเทียบค่าที่ต้องการลบ
            if (rowPattern.equals(pattern) && rowDetail.equals(detail) ) {
                rowIndexToDelete = row.getRowNum(); // เก็บตำแหน่งของบรรทัดที่ต้องการลบ
                System.out.println("Row to delete: " + rowIndexToDelete);
                break; // ออกจากลูปเมื่อพบแถวที่ตรงกัน
            }
        }

        // ถ้ามีการพบแถวที่ต้องการลบ
        if (rowIndexToDelete != -1) {
            // เลื่อนข้อมูลขึ้น
            for (int i = rowIndexToDelete + 1; i <= sheet.getLastRowNum(); i++) {
                Row currRow = sheet.getRow(i);
                Row previousRow = sheet.getRow(i - 1);

                if (previousRow != null && currRow != null) {
                    // คัดลอกค่าจากแถวปัจจุบันไปยังแถวก่อนหน้า
                    previousRow.getCell(0).setCellValue(currRow.getCell(0).getStringCellValue());
                    previousRow.getCell(1).setCellValue(currRow.getCell(1).getStringCellValue());
                    previousRow.getCell(3).setCellValue(currRow.getCell(3).getStringCellValue());
                    previousRow.getCell(4).setCellValue(currRow.getCell(4).getStringCellValue());
                    previousRow.getCell(5).setCellValue(currRow.getCell(5).getStringCellValue());
                }
            }

            // ลบแถวที่ค้นพบ
            Row rowToDelete = sheet.getRow(rowIndexToDelete);
            if (rowToDelete != null) {
                sheet.removeRow(rowToDelete);
                System.out.println("Row " + rowIndexToDelete + " deleted.");
            }

            // หากต้องการให้ข้อมูลในแถวสุดท้ายหายไป
            int lastRowIndex = sheet.getLastRowNum();
            if (lastRowIndex >= rowIndexToDelete) {
                sheet.shiftRows(rowIndexToDelete + 1, lastRowIndex, -1); // เลื่อนข้อมูลขึ้น
            }

            // บันทึกการเปลี่ยนแปลง
            try (FileOutputStream fileOut = new FileOutputStream(FILE_NAME)) {
                wb.write(fileOut);
                wb.close();
                fileOut.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }    
   
   
}
