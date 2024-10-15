package DAO;

import java.io.BufferedInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; // ใช้สำหรับไฟล์ .xlsx
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import StoreToHeaven.*;
import java.awt.Component;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Coffindao {
    private Workbook wb;
    private Sheet sheet;
    private final String FILE_NAME = "StoreStock.xlsx"; // อไฟล์เก็บข้อมูลสินค้า
    private FileInputStream fileInput;
    private FileOutputStream fos;
    private ArrayList<List<String>> coffinlist = new ArrayList<>();
    private String[] nameCol = { "ชื่อ", "รายละเอียด", "ขนาด 20 นิ้ว", "ขนาด 22 นิ้ว", "ขนาด 24 นิ้ว", "pathรูปภาพ"}; // คอลัมน์ใน Excel
    
    private ArrayList<CoffinDetail> cfd;
    private Component[] cmp;
    private ArrayList<Coffin> cList;
    String name, pattern, detail, path;

    /* ฟังก์ชันบันทึกข้อมูลในไฟล์ Excel */
    public void save(AddCoffin coffin) {
        // ดึงข้อมูลจากฟอร์ม AddCoffin 
        cmp = coffin.getPic_detailJP().getComponents(); 
        cfd = new ArrayList<>();
        for (Component c : cmp) {
            cfd.add((CoffinDetail) c);
        }

        // อ่านไฟล์ Excel
        read();
        try {
            if (sheet == null) {
                System.out.println("Sheet not found");
                return;
            }

            //ตรวจสอบแถวแรกของไฟล์ 
            Row firstRow = sheet.getRow(0);
            if (firstRow == null) { 
                firstRow = sheet.createRow(0); //สร้างแถวแรก
                for (int j = 0; j < nameCol.length; j++) {
                    Cell cell = firstRow.createCell(j);
                    cell.setCellValue(nameCol[j]); //กำหนดชื่อคอลัมน์
                }
            }

            //วนลูป CoffinDetail แต่ละรายการที่แอดมินกรอก
            for (int a = 0; a < cfd.size(); a++) {
                String pattern = cfd.get(a).getPatternTF1().getText(); 
                String detail = cfd.get(a).getDetailTA().getText(); //รายละเอียด
                String path = cfd.get(a).getFilePath(); //path รูปภาพ
                double size20 = 0, size22 = 0, size24 = 0; //ขนาดโลง 20, 22, 24 นิ้ว

                //ตรวจสอบและแปลงค่าราคาแต่ละขนาด (20, 22, 24 นิ้ว)
                try {
                    String size20Str = cfd.get(a).getPricesize20().getText().trim();
                    String size22Str = cfd.get(a).getPricesize22().getText().trim();
                    String size24Str = cfd.get(a).getPricesize24().getText().trim();

                    //ตรวจสอบว่ามีการกรอกข้อมูลในแต่ละขนาดหรือไม่
                    if (!size20Str.isEmpty()) {
                        size20 = Integer.parseInt(size20Str); //แปลงราคาเป็นจำนวนเต็ม
                    }
                    if (!size22Str.isEmpty()) {
                        size22 = Integer.parseInt(size22Str);
                    }
                    if (!size24Str.isEmpty()) {
                        size24 = Integer.parseInt(size24Str);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid size format: " + e.getMessage());
                    continue; 
                }
        
//                    String priceSize20 = cfd.get(a).getPricesize20().getText();
//                    String priceSize22 = cfd.get(a).getPricesize22().getText();
//                    String priceSize24 = cfd.get(a).getPricesize24().getText();
                    

                 //ตรวจสอบว่าข้อมูลซ้ำหรือไม่
                String[] dataChecked = { pattern, detail, path, String.valueOf(size20), String.valueOf(size22), String.valueOf(size24) };
//               String[] dataChecked = { pattern, detail, path, priceSize20, priceSize22, priceSize24 };
                boolean haveData = false;
                for (Row row : sheet) {
                    Cell c = row.getCell(0);
                    if (c != null && c.toString().equals(dataChecked[0])) { //ตรวจสอบว่ามีข้อมูลอยู่แล้วหรือไม่
                        haveData = true;
                        break;
                    }
                }

                //หากยังไม่มีข้อมูลใน Excel ให้เพิ่มแถวใหม่
                if (!haveData) {
                    try {
                        int lastRow = sheet.getLastRowNum();
                        Row newRow = sheet.createRow(lastRow + 1); //สร้างแถวใหม่สำหรับข้อมูล
                        newRow.createCell(0).setCellValue(pattern);
                        newRow.createCell(1).setCellValue(detail);
                        newRow.createCell(2).setCellValue(size20); // กำหนดราคาขนาด 20 นิ้ว
                        newRow.createCell(3).setCellValue(size22); // กำหนดราคาขนาด 22 นิ้ว
                        newRow.createCell(4).setCellValue(size24); // กำหนดราคาขนาด 24 นิ้ว
                        newRow.createCell(5).setCellValue(path);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            //บันทึกข้อมูลลงไฟล์ Excel
            fos = new FileOutputStream(new File(FILE_NAME));
            wb.write(fos);
        } catch (Exception e) {
            e.printStackTrace(); 
        } finally {
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

    /* ฟังก์ชันดึงข้อมูลสินค้าใน Excel ทั้งหมด */
    public ArrayList<Coffin> getAll() {
        cList = new ArrayList<>();
        read(); // อ่านข้อมูลจาก Excel
        try {
            if (sheet == null) {
                System.out.println("Sheet not found");
                return cList; 
            }

            //วนลูปเพื่อดึงข้อมูลแต่ละแถวใน Excel
            for (Row row : sheet) {
                if (row.getRowNum() == 0) {
                    name = row.getCell(0).getStringCellValue(); //ข้ามแถวแรกที่เป็นชื่อคอลัมน์
                    continue;
                }
                String pattern = null, detail = null, path = null;
                int size20 = 0, size22 = 0, size24 = 0;
                for (Cell cell : row) {
                    if (cell == null) {
                        continue; // ข้าม cell ที่เป็น null
                    }
                    switch (cell.getColumnIndex()) {
                        case 0:
                            pattern = cell.getStringCellValue(); //ดึงข้อมูลลายของโลง
                            break;
                        case 1:
                            detail = cell.getStringCellValue(); //ดึงรายละเอียดสินค้า
                            break;
                        case 2:
                            size20 = (int) cell.getNumericCellValue(); //ดึงราคาขนาด 20 นิ้ว
                            break;
                        case 3:
                            size22 = (int) cell.getNumericCellValue(); //ดึงราคาขนาด 22 นิ้ว
                            break;
                        case 4:
                            size24 = (int) cell.getNumericCellValue(); //ดึงราคาขนาด 24 นิ้ว
                            break;
                        case 5:
                            path = cell.getStringCellValue(); //ดึง path รูปภาพ
                            break;
                    }
                }

                //ตรวจสอบว่าข้อมูลสินค้าครบถ้วนหรือไม่ก่อนเพิ่มลงใน cList
                if (name != null && pattern != null && detail != null && size20 > 0 && size22 > 0 && size24 > 0  && path != null ) {
                    Coffin newCoffin = new Coffin(name, pattern, detail, size20, size22, size24, path);
                    // ตรวจสอบไม่ให้มีการเพิ่มซ้ำ
                    if (!cList.contains(newCoffin)) {
                        cList.add(newCoffin);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
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
        return cList;
    }

    /* ฟังก์ชันอ่านไฟล์ Excel */
    public void read() {
        wb = null;
        try {
            fileInput = new FileInputStream(new File(FILE_NAME));
            wb = new XSSFWorkbook(fileInput);
            sheet = wb.getSheetAt(0); // เปิดชีตแรก
        } catch (Exception err) {
            System.out.println("can't read file: " + err);
        }
    }
}


///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package DAO;
//import java.io.BufferedInputStream;
//import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;  // Allows working with .xlsx files
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import StoreToHaven.*;
//import StoreToHeaven.Candle;
//import StoreToHeaven.Coffin;
//import java.awt.Component;
//import java.io.FileOutputStream;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.*;
//
//public class Coffindao {
//    private Workbook wb;
//    private Sheet sheet;
//    private final String FILE_NAME = "StoreStock.xlsx"; // อไฟล์เก็บข้อมูลสินค้า
//    private FileInputStream fileInput;
//    private FileOutputStream fos;
//    private ArrayList<List<String>> coffinlist = new ArrayList<>();
//    private String[] nameCol = { "ชื่อ", "รายละเอียด", "ขนาด 20 นิ้ว", "ขนาด 22 นิ้ว", "ขนาด 24 นิ้ว", "pathรูปภาพ"}; // คอลัมน์ใน Excel
//    private ArrayList<CoffinDetail> cfd;
//    private Component[] cmp;
//    private ArrayList<Coffin> cList;
//    String name, pattern, detail, path;
//    private Object[] dataChecked;
//    
// public void save(AddCoffin coffin) {
//        cmp = coffin.getPic_detailJP().getComponents();    // get CoffinDetail panel
//        cfd = new ArrayList<>();
//        for (Component c : cmp){
//            cfd.add((CoffinDetail) c);
//        }
//    
//        /*Excel*/    
//        read(); // read StroeStock.xlsx
//        try {  // check that StoreStock.xlsx was found
//            if (sheet == null) {
//                System.out.println("Sheet not found");
//                return;
//            }
//            Row firstRow = sheet.getRow(0);
//            if (firstRow == null) {       // this files valid?
//                firstRow = sheet.createRow(0);          // create first row
//                nameCol[0] = coffin.getNameTF().getText();
//                /*bring all data in wreathlist to create each col in valid sheet*/
//                for(int j=0; j<nameCol.length; j++){
//                    Cell cell = firstRow.createCell(j);
//                    cell.setCellValue(nameCol[j]);
//                }
//            }
//              for (int a = 0; a < cfd.size(); a++) {
//                String pattern = cfd.get(a).getPatternTF1().getText(); 
//                String detail = cfd.get(a).getDetailTA().getText(); //รายละเอียด
//                String path = cfd.get(a).getFilePath(); //path รูปภาพ
//                double size20 = 0, size22 = 0, size24 = 0; //ขนาดโลง 20, 22, 24 นิ้ว
//   
//            boolean haveData = false ;
//            for (Row row : sheet){
//                Cell c = row.getCell(0);
//                if(c.toString().equals(dataChecked[0])){
//                    haveData = true;
//                    break;
//                }
//            }
//            if(!haveData){
//               try {
//                int lastRow = sheet.getLastRowNum();
//                Row newRow = sheet.createRow(lastRow+1);
//                 newRow.createCell(0).setCellValue(pattern);
//                 newRow.createCell(1).setCellValue(detail);
//                 newRow.createCell(2).setCellValue(size20); // กำหนดราคาขนาด 20 นิ้ว
//                 newRow.createCell(3).setCellValue(size22); // กำหนดราคาขนาด 22 นิ้ว
//                 newRow.createCell(4).setCellValue(size24); // กำหนดราคาขนาด 24 นิ้ว
//                 newRow.createCell(5).setCellValue(path);
//               } catch (Exception e) {
//                    e.printStackTrace();
//               }             
//           }
//        }
//            /*write data into StoreStock.xlsx*/
//            fos = new FileOutputStream(new File(FILE_NAME));
//            wb.write(fos);
//        } catch (Exception e) {
//            e.printStackTrace(); // แสดงข้อผิดพลาด
//        } finally {
//            // ปิด resource ที่เปิดไว้
//            try {
//                if (fos != null) {
//                    fos.close();
//                }
//                if (wb != null) {
//                    wb.close();
//                }
//                if (fileInput != null) {
//                    fileInput.close();
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    public ArrayList<Coffin> getAll() {        
//    cList = new ArrayList<>();
//    read();
//    try {
//        if (sheet == null) {
//            System.out.println("Sheet not found");
//            return cList; // หรือทำการรีเทิร์นอย่างอื่นหากไม่มีชีต
//        }
//
//        for (Row row : sheet) {
//            if (row.getRowNum() == 0) {
//                name = row.getCell(0).getStringCellValue();
//                continue;
//            }
//            String pattern = null, detail = null, path = null;
//            double size20 = 0, size22 = 0, size24 = 0;
//            for (Cell cell : row) {
//                if (cell == null) {
//                    continue; // ข้าม cell ที่เป็น null
//                }
//                switch (cell.getColumnIndex()) {
//                    case 0:
//                      pattern = cell.getStringCellValue(); //ดึงข้อมูลลายของโลง
//                      break;
//                    case 1:
//                      detail = cell.getStringCellValue(); //ดึงรายละเอียดสินค้า
//                      break;
//                    case 2:
//                      size20 = (int) cell.getNumericCellValue(); //ดึงราคาขนาด 20 นิ้ว
//                      break;
//                    case 3:
//                      size22 = (int) cell.getNumericCellValue(); //ดึงราคาขนาด 22 นิ้ว
//                      break;
//                     case 4:
//                      size24 = (int) cell.getNumericCellValue(); //ดึงราคาขนาด 24 นิ้ว
//                      break;
//                     case 5:
//                      path = cell.getStringCellValue(); //ดึง path รูปภาพ
//                      break;
//                }
//            }
//            //ตรวจสอบว่าข้อมูลสินค้าครบถ้วนหรือไม่ก่อนเพิ่มลงใน cList
//            if (name != null && pattern != null && detail != null && size20 > 0 && size22 > 0 && size24 > 0  && path != null ) {
//               Coffin newCoffin = new Coffin(name, pattern, detail, size20, size22, size24, path);
//               // ตรวจสอบไม่ให้มีการเพิ่มซ้ำ
//               if (!cList.contains(newCoffin)) {
//                      cList.add(newCoffin);
//               }
//            }
//        }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if (fileInput != null) {
//                    fileInput.close();
//                }
//                if (fos != null) {
//                    fos.close();
//                }
//                if (wb != null) {
//                    wb.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        return cList;
//    }
//    /*Read Excel file*/
//   public void read() {
//        wb = null;
//        try {
//            fileInput = new FileInputStream(new File(FILE_NAME));
//            wb = new XSSFWorkbook(fileInput);
//            sheet = wb.getSheetAt(0); // เปลี่ยนไปที่ชีต 5
//        } catch (Exception err) {
//            System.out.println("can't read file: " + err);
//        }
//    }
//  
//}
    
