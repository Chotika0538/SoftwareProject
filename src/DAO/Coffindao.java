package DAO;
import java.io.BufferedInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  // Allows working with .xlsx files
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import StoreToHaven.AddCoffin;
import StoreToHaven.CoffinDetail;
import StoreToHeaven.*;
import java.awt.Component;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;


public class Coffindao {
    private Workbook wb;
    private Sheet sheet;
    private final String FILE_NAME = "StoreStock.xlsx";
    private FileInputStream fileInput;
    private FileOutputStream fos;
    private ArrayList<List<String>> coffinlist = new ArrayList<>();
    private String[] nameCol = { "ชื่อ","ขนาด","รายละเอียด" ,"pathรูปภาพ", "ราคา"};
    private ArrayList<CoffinDetail> cfd;
    private Component[] cmp;
    private ArrayList<Coffin> cList;
    String name , size, pattern, detail, path;
    double price;  

    /*Save data in Excel file*/
    public void save(AddCoffin coffin) {
        cmp = coffin.getPic_detailJP().getComponents();    // get CoffinDetail panel
        cfd = new ArrayList<>();
        for (Component c : cmp){
            cfd.add((CoffinDetail) c);
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
                nameCol[0] = coffin.getNameTF().getText();
                /*bring all data in wreathlist to create each col in valid sheet*/
                for(int j=0; j<nameCol.length; j++){
                    Cell cell = firstRow.createCell(j);
                    cell.setCellValue(nameCol[j]);
                }
            }
            for (int a=0; a<cfd.size(); a++){
            String pattern = cfd.get(a).getPatternTF().getText();    
            String detail = cfd.get(a).getDetailTA().getText();
            String path = cfd.get(a).getFilePath();
            String size = coffin.getSizeTF().getText();
            //double price = Double.parseDouble(cfd.get(a).getPriceTF().getText());
            //String[] dataChecked = {pattern,detail,path,Double.toString(price)};
            double price = Double.parseDouble(cfd.get(a).getPriceTF().getText());
            String[] dataChecked = {pattern, detail, path, Double.toString(price)};

   
            boolean haveData = false ;
            for (Row row : sheet){
                Cell c = row.getCell(0);
                if(c.toString().equals(dataChecked[0])){
                    haveData = true;
                    break;
                }
            }
            if(!haveData){
               try {
                int lastRow = sheet.getLastRowNum();
                Row newRow = sheet.createRow(lastRow+1);
                newRow.createCell(0).setCellValue(pattern);
                newRow.createCell(1).setCellValue(size);
                newRow.createCell(2).setCellValue(detail);
                newRow.createCell(3).setCellValue(path);
                newRow.createCell(4).setCellValue(price);
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
    public ArrayList<Coffin> getAll() {        
    cList = new ArrayList<>();
    read();
    try {
        if (sheet == null) {
            System.out.println("Sheet not found");
            return cList; // หรือทำการรีเทิร์นอย่างอื่นหากไม่มีชีต
        }

        for (Row row : sheet) {
            if (row.getRowNum() == 0) {
                name = row.getCell(0).getStringCellValue();
                continue;
            }
            String pattern = null, size= null, detail = null, path = null;
            double price = 0.0;

            for (Cell cell : row) {
                if (cell == null) {
                    continue; // ข้าม cell ที่เป็น null
                }
                switch (cell.getColumnIndex()) {
                    case 0:
                        pattern = cell.getStringCellValue();
                        break;
                    case 1:
                        size = cell.getStringCellValue();
                        break;
                    case 2:
                        detail = cell.getStringCellValue();
                        break;
                    case 3:
                        path = cell.getStringCellValue();
                        break;
                    case 4:
                        price = cell.getNumericCellValue();
                        break;
                }
            }

            // ตรวจสอบค่าที่ได้ก่อนเพิ่มลง oList
            if (name != null && pattern != null && detail != null && path != null && price > 0.0) {
                Coffin newCoffin = new Coffin(name, pattern, size, detail, path, price);
                // ตรวจสอบไม่ให้มีการเพิ่มซ้ำ
                if (!cList.contains(newCoffin)) {
                    cList.add(newCoffin);
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
        return cList;
    }
    /*Read Excel file*/
    public void read() {
        wb = null;
        try {
            fileInput = new FileInputStream(new File(FILE_NAME));
            wb = new XSSFWorkbook(fileInput);
            sheet = wb.getSheetAt(0); // เปลี่ยนไปที่ชีต 0
        } catch (Exception err) {
            System.out.println("can't read file: " + err);
        }
    }
   
}
