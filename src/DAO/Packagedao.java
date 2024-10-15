package DAO;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  // สำหรับไฟล์ .xlsx
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.awt.Component;
import StoreToHeaven.*;
import java.io.IOException;

public class Packagedao {
    private Workbook wb;
    private Sheet sheet;
    private final String FILE_NAME = "StoreStock.xlsx";
    private FileInputStream fileInput;
    private FileOutputStream fos;
    private String[] nameCol = { "ชื่อแพ็คเกจ","รายละเอียด" ,"pathรูปภาพ",  "ราคา"};
    private ArrayList<PackageDetail> pd;
    private ArrayList<Package_Class> pkList;
    private Component[] cmp;
    String name , pattern, detail, path;
    double price;


    public Packagedao(){
        pkList = new ArrayList<>();
        pd = new ArrayList<>();
    }
    
    /*Save data in Excel file*/
    public void save(AddPackage pack) {
        cmp = pack.getPic_detailJP().getComponents();   // get WreathDetail panel
        
        pd = new ArrayList<>();
        for (Component c : cmp){
                pd.add((PackageDetail) c);
        }
    
        /*Excel*/    
        read();             // read StoreStock.xlsx
        try {           // check that StoreStock.xlsx was found
            if (sheet == null) {
                System.out.println("Sheet not found");
                return;
            }
            Row firstRow = sheet.getRow(0);
            if (firstRow == null) {       // this files valid?
                firstRow = sheet.createRow(0);          // create first row
                nameCol[0] = pack.getNameTF().getText();
                /*bring all data in wreathlist to create each col in valid sheet*/
                for(int j=0; j<nameCol.length; j++){
                    Cell cell = firstRow.createCell(j);
                    cell.setCellValue(nameCol[j]);
                }
            }
            for (int a=0; a<pd.size(); a++){          
                String pattern = pd.get(a).getPackagePatternTF().getText();
                String detail = pd.get(a).getDetailTA().getText();
                String path = pd.get(a).getFilePath();
                String price = pd.get(a).getPriceTF().getText();
                String[] dataChecked = {pattern,detail,path,price};

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
                    newRow.createCell(0).setCellValue(pattern);
                    newRow.createCell(1).setCellValue(detail);
                    newRow.createCell(2).setCellValue(path);
                    newRow.createCell(3).setCellValue(Double.parseDouble(price));
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
    /*get All Data from excel file*/
    public ArrayList<Package_Class> getAll(){        
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
                // รีเซ็ตค่าในแต่ละรอบ                
                for(Cell cell : row){
                    if (cell == null) {
                     continue;  // ข้าม cell ที่เป็น null
                    }                 
                   switch (cell.getColumnIndex()){
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
                //check if every variable has a value(not null)
                   if (name != null && pattern != null && detail != null && path != null && price > 0.0) {
                       Package_Class p = new Package_Class(name, pattern, detail, path, price);
                       if(!pkList.contains(p)){
                           pkList.add(p);
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
                if (wb != null) {
                    wb.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return pkList;
    }
    /*Read Excel file*/
    public void read() {
        wb = null;
        try {
            fileInput = new FileInputStream(new File(FILE_NAME));
            wb = new XSSFWorkbook(fileInput);
            sheet = wb.getSheetAt(8); // เปลี่ยนไปที่ชีตแรก
        } catch (Exception err) {
            System.out.println("can't read file: " + err);
        }
    }
//        private static void copyRow(Sheet sheet, Row sourceRow, Row targetRow) {
//        for (int cellIndex = sourceRow.getFirstCellNum(); cellIndex < sourceRow.getLastCellNum(); cellIndex++) {
//            Cell sourceCell = sourceRow.getCell(cellIndex);
//            Cell targetCell = targetRow.createCell(cellIndex);
//
//            if (sourceCell != null) {
//               targetCell.setCellValue(sourceCell.getStringCellValue());
//               break; 
//            }
//        }
    //}
}
