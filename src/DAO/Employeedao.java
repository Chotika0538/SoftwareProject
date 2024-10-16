package DAO;

import java.io.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  // Allows working with .xlsx files
import ToHeaven.*;
import java.awt.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Employeedao {
    private FileInputStream fileInput;
    private FileOutputStream fos;
    private Workbook wb;
    private Sheet sheet ;
    //private String excelPath ;
    private final String FILE_NAME = "Employee.xlsx";
    public static boolean complete = false;
    public static boolean checkLogin = false;
    
     /*Read Excel file*/
    public void read() {
        wb = null;
        try {
            fileInput = new FileInputStream(new File(FILE_NAME));
            wb = new XSSFWorkbook(fileInput);
            sheet = wb.getSheetAt(0); // เปลี่ยนไปที่ชีตแรก
        } catch (Exception err) {
            System.out.println("can't read file: " + err);
        }
    }
    
    /*find some data of admin registration*/
    public void findData(String userName, String password){
        read();
        try {
             if (sheet == null) {
                System.out.println("Sheet not found");
                return;
            }
            for(Row row : sheet ){
                if(row == null){
                    System.out.println("Row"+row.getRowNum()+"is valid.");
                    continue;
                }
            Cell rowUsername = row.getCell(2);  // ดึงข้อมูลคอลัมน์ username
            Cell rowPassword = row.getCell(3);  // ดึงข้อมูลคอลัมน์ password

            // ตรวจสอบว่าทั้ง username และ password ไม่ใช่ค่าว่าง
            if (rowUsername != null && rowPassword != null) {
                if (rowUsername.getCellTypeEnum() == CellType.STRING && rowPassword.getCellTypeEnum() == CellType.STRING) {
                    String excelUsername = rowUsername.getStringCellValue();
                    String excelPassword = rowPassword.getStringCellValue();

                    // ตรวจสอบว่าตรงกับข้อมูลที่ป้อนมาหรือไม่
                    if (excelUsername.equals(userName) && excelPassword.equals(password)) {
                        checkLogin = true;  // ตั้งค่าสถานะว่าเข้าสู่ระบบสำเร็จ
                    }
                }
             }
          }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
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
    }
}

