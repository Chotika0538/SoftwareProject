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
//            //remove empty row
//            int lastRow = sheet.getLastRowNum();
//            int emptyRowPointer = -1;
//            //int rowIndex = 0;
//            for (int rowIndex = 0; rowIndex <= lastRow; rowIndex++){
//                Row row = sheet.getRow(rowIndex);
//                if (row == null) {  
//                        if (emptyRowPointer == -1) {  
//                            emptyRowPointer = rowIndex;
//                        }
//                }else if (emptyRowPointer != -1) {
//                    Row targetRow = sheet.createRow(emptyRowPointer);
//                    copyRow(sheet, row, targetRow);
//                    sheet.removeRow(row);  
//                    emptyRowPointer++;
//                }
//               
//            }
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
                   if (name != null && pattern != null && detail != null && path != null &&  price > 0l) {
                        fList.add(new Frame(name, pattern, detail, path, price));
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
}