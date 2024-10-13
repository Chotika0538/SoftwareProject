/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import StoreToHeaven.*;
import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Souvenirdao {
    private Workbook wb;
    private Sheet sheet;
    private final String FILE_NAME = "StoreStock.xlsx";
    private FileInputStream fileInput;
    private FileOutputStream fos;
    private ArrayList<List<String>> SouvenirList ;
    private ArrayList<Souvenir> svnList;
    private ArrayList<SouvenirDetail> sd;
    private String[] nameCol = {"ชื่อ", "รายละเอียด", "pathรูปภาพ", "ราคา"};
    private Component[] cmp;
    String name , incence_size, detail, path, price;
    
    public Souvenirdao(){
        svnList = new ArrayList<>();
        SouvenirList = new ArrayList<>();
    } 
    
    /*Read Excel file*/
    public void read() {
        wb = null;
        try {
            fileInput = new FileInputStream(new File(FILE_NAME));
            wb = new XSSFWorkbook(fileInput);
            sheet = wb.getSheetAt(2);
        } catch (Exception err) {
            System.out.println("can't read file: " + err);
        }
    }
    /*Save data in Excel file*/
    public void save(AddSouvenir gift) {
        cmp = gift.getPic_detailJP().getComponents();// get SnackBoxDetail panel
        sd = new ArrayList<>();
        
        for (Component c : cmp){
            sd.add((SouvenirDetail) c);
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
            //Create column name
            if (firstRow == null) {       // this files valid?
                firstRow = sheet.createRow(0);          // create first row
                nameCol[0] = gift.getNameTF().getText();
                /*bring all data in Snacklist to create each col in valid sheet*/
                for(int j=0; j<nameCol.length; j++){
                    Cell cell = firstRow.createCell(j);//create cell in row 0
                    cell.setCellValue(nameCol[j]);
                }
            }
            else{
                nameCol[0] = gift.getNameTF().getText();
                Cell cell = sheet.getRow(0).getCell(0);
                cell.setCellValue(nameCol[0]);
            }
            //sd.size() = all component in scrollPane
            //add

            for (int a=0; a<sd.size(); a++){
                String souvenir = sd.get(a).getSouvenirPatternTF().getText();
                String price = sd.get(a).getPriceTF().getText();
                String path = sd.get(a).getFilePath();
                String detail = sd.get(a).getDetailTA().getText();
                
                String[] dataChecked = {souvenir, price, path, detail};
                
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
                //if the column in that row is empty
                if(!haveData){
                    try {
                        int lastRow = sheet.getLastRowNum();
                        Row newRow = sheet.createRow(lastRow+1);
                        //create new column in that row
                        newRow.createCell(0).setCellValue(souvenir);
                        newRow.createCell(1).setCellValue(detail);
                        newRow.createCell(2).setCellValue(path);
                        newRow.createCell(3).setCellValue(price);
                        
                    } 
                    catch (Exception e) {
                        e.printStackTrace();
                    }             
                }
                
            }
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
}
