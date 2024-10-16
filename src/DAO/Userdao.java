package DAO;
import java.io.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  // Allows working with .xlsx files
import ToHeaven.*;
import java.awt.*;
import java.util.*;
import javax.swing.JOptionPane;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import StoreToHeaven.AddWreath;
//import StoreToHeaven.WreathDetail;
//import StoreToHeaven.Wreath;
//import java.awt.Component;
//import java.io.FileOutputStream;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.*;

public class Userdao {
    private FileInputStream fileInput;
    private FileOutputStream fos;
    private Workbook wb;
    private Sheet sheet ;
    //private String excelPath ;
    private final String FILE_NAME = "User.xlsx";
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
    
    /*Saved registered information into User.xlsx*/
    public void save(Register regist){
        read();
        try{
            int lastRow = sheet.getLastRowNum();
            Row newRow = sheet.createRow(lastRow+1);
            newRow.createCell(0).setCellValue(regist.getNameField().getText());
            newRow.createCell(1).setCellValue(regist.getSurnameField().getText());
            newRow.createCell(2).setCellValue(regist.getUserNamefield().getText());
            newRow.createCell(3).setCellValue(regist.getPasswordfield().getText());
            newRow.createCell(4).setCellValue(regist.getAddressField().getText());
            String phone = regist.getPhoneField().getText();
            if (phone.length() == 10) {
                phone = phone.substring(0, 3) + "-" + phone.substring(3, 6) + "-" + phone.substring(6);
            }
            newRow.createCell(5).setCellValue(phone);
            fos = new FileOutputStream(FILE_NAME);
            wb.write(fos);
            complete = true;            
            // have to re-programe When registerd. !!!!!!!!!!!
        }catch(Exception err){
            System.out.println(err);
        }finally{
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
    
    /*find some data of user registration*/
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
                if (rowUsername.getCellTypeEnum()== CellType.STRING && rowPassword.getCellTypeEnum()== CellType.STRING) {
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
