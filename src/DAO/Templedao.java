
package DAO;

import java.io.BufferedInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  // Allows working with .xlsx files
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import StoreToHeaven.*;
import java.awt.Component;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Templedao {
    private Workbook wb;
    private Sheet sheet;
    private final String FILE_NAME = "StoreStock.xlsx";
    private FileInputStream fileInput;
    private FileOutputStream fos;
//    private ArrayList<List<String>> wreathlist ;
    private String[] nameCol = { "รายชื่อวัด","จังหวัด","ที่อยู่"};
    private ArrayList<TempleDetail> td;
    private ArrayList<Temple> tpList;
    private Component[] cmp;
    String name , province, adress;
    
    public Templedao(){
        tpList = new ArrayList<>();
    }
    /*Read Excel file*/
    public void read() {
        wb = null;
        try {
            fileInput = new FileInputStream(new File(FILE_NAME));
            wb = new XSSFWorkbook(fileInput);
            sheet = wb.getSheetAt(10); 
        } catch (Exception err) {
            System.out.println("can't read file: " + err);
        }
    }
    /*Save data in Excel file*/
    public void save(AddTemple temp) {
        cmp = temp.getPic_detailJP().getComponents();
        td = new ArrayList<>();
        
        for (Component c : cmp){
            td.add((TempleDetail) c);
        }
        /*Excel*/    
        read();            
        try { 
            if (sheet == null) {
                System.out.println("Sheet not found");
                return;
            }
            
            Row firstRow = sheet.getRow(0);
            if (firstRow == null) {       
                firstRow = sheet.createRow(0);          
//                nameCol[0] = wreath.getNameTF().getText();
                for(int j=0; j<nameCol.length; j++){
                    Cell cell = firstRow.createCell(j);
                    cell.setCellValue(nameCol[j]);
                }
            }
            
            for (int a=0; a<td.size(); a++){
                province = temp.getProvinceTF().getText();
                name = td.get(a).getTempleNameTF().getText();
                adress = td.get(a).getTempleAdressTA().getText();
                String[] dataChecked = { name, province, adress};
            
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
                        newRow.createCell(0).setCellValue(name);
                        newRow.createCell(1).setCellValue(province);
                        newRow.createCell(2).setCellValue(adress);
                    } 
                    catch (Exception e) {
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
            e.printStackTrace(); 
        } finally {
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
    public ArrayList<Temple> getAll(){  
        //String name = null , province = null, adress = null;
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
                            name = cell.getStringCellValue();
                            break;
                        case 1:
                            province = cell.getStringCellValue();
                            break;
                        case 2:
                            adress = cell.getStringCellValue();
                            break;
                       
                   }

                }
                if (name != null && province != null && adress != null) {
                    Temple tp = new Temple(name, adress, province);
                    // check if the variable has already exit in ArrayList
                    if (!tpList.contains(tp)) {
                        tpList.add(tp);
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
        return tpList;
    }
}
