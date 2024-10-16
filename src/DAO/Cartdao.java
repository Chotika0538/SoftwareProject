
package DAO;


import java.io.BufferedInputStream;
import StoreToHeaven.AddFrame;
import StoreToHeaven.Frame;
import StoreToHeaven.FrameDetail;
import StoreToHeaven.Wreath;
import StoreToHeaven.WreathDetail;
import ToHeaven.Picked_product;
import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Cartdao {
    private Workbook wb;
    private Sheet sheet;
    private final String FILE_NAME = "User.xlsx";
    private FileInputStream fileInput;
    private FileOutputStream fos;
    //private ArrayList<List<String>> framelist ;
    private String[] nameCol = { "ชนิดสินค้า","จำนวนชิ้น" , "ราคา"};
    //private ArrayList<FrameDetail> fd;
    private ArrayList<Picked_product> pickedproductList;
    //private Component[] cmp;
    String name , pattern, detail, path;
    double price;
    int quantity;
    
    public Cartdao(){
//        fList = new ArrayList<>();
//        fd = new ArrayList<>();
//        framelist = new ArrayList<>();
    }
    
    public void save(ArrayList<Picked_product> pk){
         //cmp = frame.getPic_detailJP().getComponents();
//         fd = new ArrayList<>();
//          for (Component c : cmp){
//            fd.add((FrameDetail) c);
//        }
          read();
          try {           // check that StoreStock.xlsx was found
            if (sheet == null) {
                System.out.println("Sheet not found");
                return;
            }
            Row firstRow = sheet.getRow(0);
            if (firstRow == null) {       // this files valid?
                firstRow = sheet.createRow(0);          // create first row
                //nameCol[0] = frame.getNameTF().getText();
                /*bring all data in framelist to create each col in valid sheet*/
                for(int j=0; j<nameCol.length; j++){
                    Cell cell = firstRow.createCell(j);
                    cell.setCellValue(nameCol[j]);
                }
            }
            for (int a=0; a<pk.size(); a++){
            String pattern = pk.get(a).getName();
            int quantity = pk.get(a).getQuantity();
            double price = pk.get(a).getPrice();
//            String[] dataChecked = {pattern,detail,path,Double.toString(price)};
//            boolean haveData = false ;
//            
//            for (Row row : sheet){
//                if(row.getCell(0)!=null){
//                    Cell c = row.getCell(0);
//                if(c.toString().equals(dataChecked[0])){
//                    haveData = true;
//                    break;
//                }
//            }
//                
//         }
            if(pattern != null && price>0 && quantity > 0){
               try {
                int lastRow = sheet.getLastRowNum();
                Row newRow = sheet.createRow(lastRow+1);
                newRow.createCell(0).setCellValue(pattern);
                newRow.createCell(1).setCellValue(quantity);
                newRow.createCell(2).setCellValue(price);
   
               } catch (Exception e) {
                    e.printStackTrace();
               }             
           }
        }
            /*write data into StoreStock.xlsx*/
            fos = new FileOutputStream(new File(FILE_NAME));
            wb.write(fos);        
        } catch (Exception e) {
            e.printStackTrace(); // แสดงexception
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
    public ArrayList<Picked_product> getAll(){    
        
        String  pattern = null, detail=null, path=null;
        price = 0.0 ;
        quantity = 0;
        read();
        try {
            if (sheet == null) {
                System.out.println("Sheet not found");
            }

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
                           pattern = cell.getStringCellValue();
                           break;
                       case 1:
                          quantity = (int)cell.getNumericCellValue();
                           break;
                       case 2:
                           price = cell.getNumericCellValue();
                           break;
//                       case 3:
//                           String[] s = cell.getStringCellValue().split("/");
//                           price = new Double[s.length];
//                           //int i = 0;
//                          for(int i=0; i<s.length; i++){
//                               //price[i] = new Double();
//                                if (s[i] != null && !s[i].isEmpty() && !s[i].equals("null")) {
//                                    price[i] = Double.parseDouble(s[i]);  // แปลงเป็น double
//                                } else {
//                                    price[i] = 0.0;  // กำหนดค่าเริ่มต้นเป็น 0.0 หากข้อมูลไม่ถูกต้อง
//                                }
//                            }
//                           price = cell.getNumericCellValue();
//                            break;
                   }
//                   if (name != null && pattern != null && detail != null && path != null &&  price > 0) {
//                        fList.add(new Frame(name, pattern, detail, path, price));
//                    }
                }
                // ตรวจสอบค่าที่ได้ก่อนเพิ่มลง oList
                if (pattern != null && quantity>0 && price > 0.0) {
                    Picked_product pickedproduct = new  Picked_product(name, price, quantity);
                    // ตรวจสอบไม่ให้มีการเพิ่มซ้ำ
                    if (!pickedproductList.contains(pickedproduct)) {
                        pickedproductList.add(pickedproduct);
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
        return pickedproductList;
    }
//    private static void copyRow(Sheet sheet, Row sourceRow, Row targetRow) {
//        for (int cellIndex = sourceRow.getFirstCellNum(); cellIndex < sourceRow.getLastCellNum(); cellIndex++) {
//            Cell sourceCell = sourceRow.getCell(cellIndex);
//            Cell targetCell = targetRow.createCell(cellIndex);
//
//            if (sourceCell != null) {
//               targetCell.setCellValue(sourceCell.getStringCellValue());
//               break;
//            }
//        }
//    }
    
    private void read() {
        wb = null;
        try {
            fileInput = new FileInputStream(new File(FILE_NAME));
            wb = new XSSFWorkbook(fileInput);
            sheet = wb.getSheetAt(2); // เปลี่ยนไปที่ชีต3
        } catch (Exception err) {
            System.out.println("can't read file: " + err);
        }
    
    }
}