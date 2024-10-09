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
    private Workbook wb;
    private Sheet sheet;
    private final String FILE_NAME = "StoreStock.xlsx";
    private FileInputStream fileInput;
    private FileOutputStream fos;
    private ArrayList<String> wreathlist = new ArrayList<>();

    /*save data int                String pattern = wreath.getPatternTF().getText();          // get String value from getPatternTF()
                if (pattern != null && !pattern.isEmpty()) {           //String is not empty?
                    String[] s = pattern.split(",") ;    
                    for (int i=0; i<s.length; i++){
                        wreathlist.add(s[i]);     // put Pattern data into wreathlist
                    }o StoreStock.xlsx*/
    public void save(AddWreath wreath) {
        /*get all data to ArrayList*/
        String newData = wreath.getNameTF().getText() ;
        String pattern = wreath.getPatternTF().getText();          // get String value from getPatternTF()
        if (newData != null && !newData.isEmpty()&&pattern != null && !pattern.isEmpty()) {           //String is not empty?
           wreathlist.add(newData);
            String[] s = pattern.split(",") ;    
            for (int i=0; i<s.length; i++){
                wreathlist.add(s[i]);     // put Pattern data into wreathlist
            }
        } else {
                    //s = new String[0]; // หากไม่มีค่าให้เป็น array ว่าง
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
                
                /*bring all data in wreathlist to create each col in valid sheet*/
                for(int j=0; j<=wreathlist.size(); j++){
                    Cell cell = firstRow.createCell(j);
                    cell.setCellValue(wreathlist.get(j-1));
                }
            } else {
                // หากแถวแรกมีอยู่แล้ว คุณสามารถเลือกที่จะเขียนต่อหรือเพิ่มเซลล์ใหม่ที่นี่
                System.out.println("have first row");
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
