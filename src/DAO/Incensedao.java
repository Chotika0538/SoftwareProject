/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import StoreToHeaven.*;
import java.io.BufferedInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  // Allows working with .xlsx files
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import StoreToHeaven.*;
//import StoreToHeaven.IncenseDetail;
import StoreToHeaven.*;
import java.awt.Component;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;


public class Incensedao {
    private Workbook wb;
    private Sheet sheet;
    private final String FILE_NAME = "StoreStock.xlsx";
    private FileInputStream fileInput;
    private FileOutputStream fos;
    private ArrayList<List<String>> incenselist = new ArrayList<>();
    private String[] nameCol = { "ชื่อ","รายละเอียด" ,"pathรูปภาพ", "ราคา"};
    private ArrayList<IncenseDetail> icd;
    private ArrayList<Incense> iList;
    private Component[] cmp;
    String name , pattern, detail, path;
    double price;   
    
    public Incensedao(){
        iList = new ArrayList<>();
        icd = new ArrayList<>();
        incenselist = new ArrayList<>();
    }
    /*Save data in Excel file*/
    public void save(AddIncense incense) {
        cmp = incense.getPic_detailJP().getComponents();    // get IncenseDetail panel
        icd = new ArrayList<>();
        for (Component c : cmp){
            icd.add((IncenseDetail) c);
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
                nameCol[0] = incense.getNameTF().getText();
                /*bring all data in wreathlist to create each col in valid sheet*/
                for(int j=0; j<nameCol.length; j++){
                    Cell cell = firstRow.createCell(j);
                    cell.setCellValue(nameCol[j]);
                }
            }
            for (int a=0; a<icd.size(); a++){
            String pattern = icd.get(a).getPatternTF().getText();
            String detail = icd.get(a).getDetailTA().getText();
            String path = icd.get(a).getFilePath();
            double price = Double.parseDouble(icd.get(a).getPriceTF().getText());
            String[] dataChecked = {pattern,detail,path,Double.toString(price)};
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
                newRow.createCell(3).setCellValue(price);
                //newRow.createCell(4).setCellValue(incense.getPriceTF().getText());
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
    
public ArrayList<Incense> getAll() {        
    iList = new ArrayList<>();
    read();
    try {
        if (sheet == null) {
            System.out.println("Sheet not found");
            return iList; // หรือทำการรีเทิร์นอย่างอื่นหากไม่มีชีต
        }

        for (Row row : sheet) {
            if (row.getRowNum() == 0) {
                name = row.getCell(0).getStringCellValue();
                continue;
            }
            String pattern = null, detail = null, path = null;
            double price = 0.0;

            for (Cell cell : row) {
                if (cell == null) {
                    continue; // ข้าม cell ที่เป็น null
                }
                switch (cell.getColumnIndex()) {
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
                        price = cell.getNumericCellValue();
                        break;
                }
            }

            // ตรวจสอบค่าที่ได้ก่อนเพิ่มลง oList
            if (name != null && pattern != null && detail != null && path != null && price > 0.0) {
                Incense newIncense = new Incense(name, pattern, detail, path, price);
                // ตรวจสอบไม่ให้มีการเพิ่มซ้ำ
                if (!iList.contains(newIncense)) {
                    iList.add(newIncense);
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
        return iList;
    }
    /*Read Excel file*/
    public void read() {
        wb = null;
        try {
            fileInput = new FileInputStream(new File(FILE_NAME));
            wb = new XSSFWorkbook(fileInput);
            sheet = wb.getSheetAt(5); // เปลี่ยนไปที่ชีต 5
        } catch (Exception err) {
            System.out.println("can't read file: " + err);
        }
    }
    
   
   /*delete column from excel*/
       public void deletePackageDetail(IncenseDetail in) {
        read(); // Ensure the sheet is read and populated
        String pattern = in.getPatternTF().getText();
        String detail = in.getDetailTA().getText();
        double price = Double.parseDouble(in.getPriceTF().getText());
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

