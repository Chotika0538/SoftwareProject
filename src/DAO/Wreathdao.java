/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.io.BufferedInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  // Allows working with .xlsx files
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import StoreToHeaven.AddWreath;
import StoreToHeaven.WreathDetail;
import java.io.FileOutputStream;
import java.util.ArrayList;


public class Wreathdao {
//    private Workbook wb;
//    private Sheet sheet ;
//    private String excelPath ;
//    private final String FILE_NAME = "Product.xlsx";
//    private FileInputStream fileInput;
//    private FileOutputStream fos;
    
//    public void save(){
//        read();
//        try {
//            Row firstRow = sheet.getRow(0);
//            if (firstRow == null){
//                firstRow = sheet.createRow(0); // สร้างแถวแรกถ้ายังไม่มี
//                Cell cell0 = firstRow.createCell(0);
//                cell0.setCellValue("username");
//                Cell cell1 = firstRow.createCell(1);
//                cell1.setCellValue("ผ้า");
//                
//            fos = new FileOutputStream(excelPath);
//            wb.write(fos);
//            fos.close();
//            wb.close();
//            }
//        } catch (Exception e) {
//        }
//    }
//    public void read(){
//        wb=null;
//         try{
//            excelPath = FILE_NAME;
//            fileInput = new FileInputStream(new File("./Product.xlsx"));
//            wb = new XSSFWorkbook(fileInput);
//            sheet = wb.getSheetAt(1);
//        }catch(Exception err){
//            System.out.print(err);
//        }
//    }
    private Workbook wb;
    private Sheet sheet;
    private final String FILE_NAME = "StoreStock.xlsx";
    private FileInputStream fileInput;
    private FileOutputStream fos;
    private ArrayList<String> wreathlist = new ArrayList<>();

    public void save(AddWreath wreath) {
        read();
        try {
            // ตรวจสอบว่าชีตมีอยู่จริง
            if (sheet == null) {
                System.out.println("Sheet not found");
                return;
            }
            
            Row firstRow = sheet.getRow(0);
            if (firstRow == null) {
                firstRow = sheet.createRow(0); // สร้างแถวแรกถ้ายังไม่มี
                Cell cell0 = firstRow.createCell(0);
                String pattern = wreath.getPatternTF().getText(); // รับค่า String จาก getPatternTF()
                if (pattern != null && !pattern.isEmpty()) {
                    String[] s = pattern.split(",") ; // ประกาศตัวแปร s
                    for (int i=0; i<s.length; i++){
                        wreathlist.add(s[i]);
                    }
                } else {
                    //s = new String[0]; // หากไม่มีค่าให้เป็น array ว่าง
                }
                cell0.setCellValue("username");
                for(int j=1; j<=wreathlist.size(); j++){
                    Cell cell = firstRow.createCell(j);
                    cell.setCellValue(wreathlist.get(j-1));
                }
//                Cell cell1 = firstRow.createCell(1);
//                cell1.setCellValue("ผ้า");
            } else {
                // หากแถวแรกมีอยู่แล้ว คุณสามารถเลือกที่จะเขียนต่อหรือเพิ่มเซลล์ใหม่ที่นี่
                System.out.println("have first row");
            }
            // เขียนข้อมูลลงไฟล์
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
    public static void main(String[] args){
        //new Wreathdao().save();
    }
}
