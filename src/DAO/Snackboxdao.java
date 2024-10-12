/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import StoreToHeaven.AddSnackBox;
import StoreToHeaven.SnackBoxDetail;
import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Chotika
 */
public class Snackboxdao {
    
    private Workbook wb;
    private Sheet sheet;
    private final String FILE_NAME = "StoreStock.xlsx";
    private FileInputStream fileInput;
    private FileOutputStream fos;
    private ArrayList<List<String>> Snacklist = new ArrayList<>();
    private String[] nameCol = {"ชื่อ", "รายละเอียด", "pathรูปภาพ", "ราคา"};
    private ArrayList<SnackBoxDetail> sd;
    private Component[] cmp;
    
    /*Read Excel file*/
    public void read() {
        wb = null;
        try {
            fileInput = new FileInputStream(new File(FILE_NAME));
            wb = new XSSFWorkbook(fileInput);
            sheet = wb.getSheetAt(7); // เปลี่ยนไปที่ชีตแรก Snackbox is written at sheet index 7
        } catch (Exception err) {
            System.out.println("can't read file: " + err);
        }
    }
   
    /*Save data in Excel file*/
    public void save(AddSnackBox boxset) {
        cmp = boxset.getPic_detailJP().getComponents();// get SnackBoxDetail panel
        sd = new ArrayList<>();
        for (Component c : cmp){
            sd.add((SnackBoxDetail) c);
        }
    
        /*Excel*/    
        read();// read StroeStock.xlsx
        try { 
            // check that StoreStock.xlsx was found
            if (sheet == null) {
                System.out.println("Sheet not found");
                return;
            }
            Row firstRow = sheet.getRow(0);
            if (firstRow == null) {       // this files valid?
                firstRow = sheet.createRow(0);          // create first row
                nameCol[0] = boxset.getNameTF().getText();
                /*bring all data in Snacklist to create each col in valid sheet*/
                for(int j=0; j<nameCol.length; j++){
                    Cell cell = firstRow.createCell(j);//create cell in row 0
                    cell.setCellValue(nameCol[j]);
                }
            }
            else{
                nameCol[0] = boxset.getNameTF().getText();
                Cell cell = sheet.getRow(0).getCell(0);
                cell.setCellValue(nameCol[0]);
            }
            //sd.size() = all component in scrollPane
            //add

            for (int a=0; a<sd.size(); a++){
                String pattern = sd.get(a).getPatternTF().getText();
                String price = sd.get(a).getPriceTF().getText();
                String path = sd.get(a).getFilePath();
                String detail = sd.get(a).getDetailTA().getText();
                
                String[] dataChecked = {pattern, price, path, detail};
                
                boolean haveData = false ;
                
                
                for (Row row : sheet){
//                    Cell c = row.getCell(0);//pull the value in the first cell(.getCell(0)) of that row
//                    if(c.toString().equals(dataChecked[0])){
//                        haveData = true;
//                        break;
//                       }

                    if (row.getCell(0) != null) {
                        Cell c = row.getCell(0);
                        String cellValue = c.toString();
                        if(cellValue.equals(dataChecked[0])){
                            haveData = true;
                            break;
                        }
                    }
                    
                }
                //if the column in that row is empty
                if(!haveData){
                    try {
                        int lastRow = sheet.getLastRowNum();
                        Row newRow = sheet.createRow(lastRow+1);
                        //create new column in that row
                        newRow.createCell(0).setCellValue(pattern);
                        newRow.createCell(1).setCellValue(detail);
                        newRow.createCell(2).setCellValue(path);
                        newRow.createCell(3).setCellValue(price);
                        
                    } 
                    catch (Exception e) {
                        e.printStackTrace();
                    }             
                }
                
            }
            ////remove empty row
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
        } 
        catch (Exception e) {
            e.printStackTrace(); // แสดงข้อผิดพลาด show exception
        } 
        finally {
            // ปิด resource ที่เปิดไว้
            try {
                //(fos != null) means there's still has some data left in the stream(not empty), So you have to close it. 
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
    private static void copyRow(Sheet sheet, Row sourceRow, Row targetRow) {
        for (int cellIndex = sourceRow.getFirstCellNum(); cellIndex < sourceRow.getLastCellNum(); cellIndex++) {
            Cell sourceCell = sourceRow.getCell(cellIndex);
            Cell targetCell = targetRow.createCell(cellIndex);

            if (sourceCell != null) {
               targetCell.setCellValue(sourceCell.getStringCellValue());
               break; 
            }
        }
    }
}
