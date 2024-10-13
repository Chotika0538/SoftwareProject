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
import StoreToHeaven.AddCandle;
import StoreToHeaven.CandleDetail;
import StoreToHeaven.Candle;
import java.awt.Component;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
/**
 *
 * @author Khao
 */
public class Candledao {
   private Workbook wb;
    private Sheet sheet;
    private final String FILE_NAME = "StoreStock.xlsx";
    private FileInputStream fileInput;
    private FileOutputStream fos;
    private ArrayList<List<String>> candlelist = new ArrayList<>();
    private String[] nameCol = { "ชื่อ","รายละเอียด" ,"pathรูปภาพ", "ราคา"};
    private ArrayList<CandleDetail> cnd;
    private Component[] cmp;

    /*Save data in Excel file*/
    public void save(AddCandle candle) {
        cmp = candle.getPic_detailJP().getComponents();    // get CoffinDetail panel
        cnd = new ArrayList<>();
        for (Component c : cmp){
            cnd.add((CandleDetail) c);
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
                nameCol[0] = candle.getNameTF().getText();
                /*bring all data in wreathlist to create each col in valid sheet*/
                for(int j=0; j<nameCol.length; j++){
                    Cell cell = firstRow.createCell(j);
                    cell.setCellValue(nameCol[j]);
                }
            }
            for (int a=0; a<cnd.size(); a++){
            String size = cnd.get(a).getSizeTF().getText();    
            String detail = cnd.get(a).getDetailTA().getText();
            String path = cnd.get(a).getFilePath();
            String price = cnd.get(a).getPriceTF().getText();
            String[] dataChecked = {size,detail,path,price};
   
            boolean haveData = false ;
            for (Row row : sheet){
                if (row.getCell(0) != null) {
                    Cell c = row.getCell(0);
                    String cellValue = c.toString();
                    if(cellValue.equals(dataChecked[0])){
                        haveData = true;
                        break;
                    }
                }
            }
            if(!haveData){
               try {
                int lastRow = sheet.getLastRowNum();
                Row newRow = sheet.createRow(lastRow+1);
                newRow.createCell(0).setCellValue(size);
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
    
    /*Read Excel file*/
    public void read() {
        wb = null;
        try {
            fileInput = new FileInputStream(new File(FILE_NAME));
            wb = new XSSFWorkbook(fileInput);
            sheet = wb.getSheetAt(4); // เปลี่ยนไปที่ชีต 4
        } catch (Exception err) {
            System.out.println("can't read file: " + err);
        }
    }
   
}
