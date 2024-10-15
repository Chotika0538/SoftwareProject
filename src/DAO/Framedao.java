package DAO;

import java.io.BufferedInputStream;
import StoreToHeaven.AddFrame;
import StoreToHeaven.Frame;
import StoreToHeaven.FrameDetail;
import StoreToHeaven.Wreath;
import StoreToHeaven.WreathDetail;
import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Framedao {
    private Workbook wb;
    private Sheet sheet;
    private final String FILE_NAME = "StoreStock.xlsx";
    private FileInputStream fileInput;
    private FileOutputStream fos;
    private ArrayList<List<String>> framelist ;
    private String[] nameCol = { "ชื่อ","รายละเอียด" ,"pathรูปภาพ", "ราคา"};
    private ArrayList<FrameDetail> fd;
    private ArrayList<Frame> fList;
    private Component[] cmp;
    String name , pattern, detail, path;
    double price;
    
    public Framedao(){
        fList = new ArrayList<>();
        fd = new ArrayList<>();
        framelist = new ArrayList<>();
    }
    
    public void save(AddFrame frame){
         cmp = frame.getPic_detailJP().getComponents();
         fd = new ArrayList<>();
          for (Component c : cmp){
            fd.add((FrameDetail) c);
        }
          read();
          try {           // check that StoreStock.xlsx was found
            if (sheet == null) {
                System.out.println("Sheet not found");
                return;
            }
            Row firstRow = sheet.getRow(0);
            if (firstRow == null) {       // this files valid?
                firstRow = sheet.createRow(0);          // create first row
                nameCol[0] = frame.getNameTF().getText();
                /*bring all data in framelist to create each col in valid sheet*/
                for(int j=0; j<nameCol.length; j++){
                    Cell cell = firstRow.createCell(j);
                    cell.setCellValue(nameCol[j]);
                }
            }
            for (int a=0; a<fd.size(); a++){
            String pattern = fd.get(a).getPatternTF().getText();
            String detail = fd.get(a).getDetailTA().getText();
            String path = fd.get(a).getFilePath();
            double price = Double.parseDouble(fd.get(a).getPriceTF().getText());
            String[] dataChecked = {pattern,detail,path,Double.toString(price)};
            boolean haveData = false ;
            
            for (Row row : sheet){
                if(row.getCell(0)!=null){
                    Cell c = row.getCell(0);
                if(c.toString().equals(dataChecked[0])){
                    haveData = true;
                    break;
                }
            }
                
         }
            if(!haveData){
               try {
                int lastRow = sheet.getLastRowNum();
                Row newRow = sheet.createRow(lastRow+1);
                newRow.createCell(0).setCellValue(pattern);
                newRow.createCell(1).setCellValue(detail);
                newRow.createCell(2).setCellValue(path);
                newRow.createCell(3).setCellValue(price);
                
                
                
               } catch (Exception e) {
                    e.printStackTrace();
               }             
           }
        }
            /*write data into StoreStock.xlsx*/
            fos = new FileOutputStream(new File(FILE_NAME));
            wb.write(fos);        
        } catch (Exception e) {
            e.printStackTrace(); // แสดงexception
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
    public ArrayList<Frame> getAll(){    
        
        String name=null, pattern = null, detail=null, path=null;
        price = 0;
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
//                           String[] s = cell.getStringCellValue().split("/");
//                           price = new Double[s.length];
//                           //int i = 0;
//                          for(int i=0; i<s.length; i++){
//                               //price[i] = new Double();
//                                if (s[i] != null && !s[i].isEmpty() && !s[i].equals("null")) {
//                                    price[i] = Double.parseDouble(s[i]);  // แปลงเป็น double
//                                } else {
//                                    price[i] = 0.0;  // กำหนดค่าเริ่มต้นเป็น 0.0 หากข้อมูลไม่ถูกต้อง
//                                }
//                            }
                           price = cell.getNumericCellValue();
                            break;
                   }
//                   if (name != null && pattern != null && detail != null && path != null &&  price > 0) {
//                        fList.add(new Frame(name, pattern, detail, path, price));
//                    }
                }
                // ตรวจสอบค่าที่ได้ก่อนเพิ่มลง oList
                if (name != null && pattern != null && detail != null && path != null && price > 0.0) {
                    Frame newFrame = new Frame(name, pattern, detail, path, price);
                    // ตรวจสอบไม่ให้มีการเพิ่มซ้ำ
                    if (!fList.contains(newFrame)) {
                        fList.add(newFrame);
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
        return fList;
    }
//    private static void copyRow(Sheet sheet, Row sourceRow, Row targetRow) {
//        for (int cellIndex = sourceRow.getFirstCellNum(); cellIndex < sourceRow.getLastCellNum(); cellIndex++) {
//            Cell sourceCell = sourceRow.getCell(cellIndex);
//            Cell targetCell = targetRow.createCell(cellIndex);
//
//            if (sourceCell != null) {
//               targetCell.setCellValue(sourceCell.getStringCellValue());
//               break;
//            }
//        }
//    }
    
    private void read() {
        wb = null;
        try {
            fileInput = new FileInputStream(new File(FILE_NAME));
            wb = new XSSFWorkbook(fileInput);
            sheet = wb.getSheetAt(3); // เปลี่ยนไปที่ชีต3
        } catch (Exception err) {
            System.out.println("can't read file: " + err);
        }
    }
    
   
   /*delete column from excel*/
       public void deletePackageDetail(FrameDetail frame) {
        read(); // Ensure the sheet is read and populated
        String pattern = frame.getPatternTF().getText();
        String detail = frame.getDetailTA().getText();
        double price = Double.parseDouble(frame.getPriceTF().getText());
        int rowIndexToDelete = -1; // Variable to store the index of the row to delete

        // ค้นหาบรรทัดที่ตรงกัน
        for (Row row : sheet) {
            if(row.getRowNum() == 0) continue; // ข้ามแถวที่ 0 (หัวตาราง)
            String rowPattern = row.getCell(0).getStringCellValue();
            String rowDetail = row.getCell(1).getStringCellValue();
            double rowPrice = row.getCell(3).getNumericCellValue();

            // เปรียบเทียบค่าที่ต้องการลบ
            if (rowPattern.equals(pattern) && rowDetail.equals(detail) && Math.abs(rowPrice - price) < 0.0001) {
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
                    previousRow.getCell(3).setCellValue(currRow.getCell(3).getNumericCellValue());
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