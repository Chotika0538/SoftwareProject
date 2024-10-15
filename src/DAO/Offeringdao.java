package DAO;

import StoreToHeaven.AddOffering;
import StoreToHeaven.Offering;
import StoreToHeaven.OfferingDetail;
import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.IOUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Offeringdao {
    private Workbook wb;
    private Sheet sheet;
    private final String FILE_NAME = "StoreStock.xlsx";
    private FileInputStream fileInput;
    private FileInputStream picInput;
    private FileOutputStream fos;
    //private ArrayList<List<String>> offeringlist = new ArrayList<>();
    private String[] nameCol = { "ชื่อ","รายละเอียด" ,"pathรูปภาพ",  "ราคา"};
    private ArrayList<OfferingDetail> od;
    private ArrayList<Offering> oList;
    private Component[] cmp;
    String name , pattern, detail, path;
    double price;  

    /*Save data in Excel file*/
    public void save(AddOffering offering) {
        cmp = offering.getPic_detailJP().getComponents();    // get OfferingDetail panel
        od = new ArrayList<>();
        for (Component c : cmp){
            od.add((OfferingDetail) c);
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
                nameCol[0] = offering.getNameTF().getText();
                /*bring all data in offeringlist to create each col in valid sheet*/
                for(int j=0; j<nameCol.length; j++){
                    Cell cell = firstRow.createCell(j);
                    cell.setCellValue(nameCol[j]);
                }
            }
            for (int a=0; a<od.size(); a++){
            String pattern = od.get(a).getPatternTF().getText();
            String detail = od.get(a).getDetailTA().getText();
            String path = od.get(a).getFilePath();
            byte[] imageByte = IOUtils.toByteArray(new FileInputStream(path));
         
            double price = Double.parseDouble(od.get(a).getPriceTF().getText());
            String[] dataChecked = {pattern,detail,path,Double.toString(price)};
            boolean haveData = false ;
            for (Row row : sheet){
                Cell c = row.getCell(0);
                if(c != null && c.toString().equals(dataChecked[0])){
                    haveData = true;
                    break;
                }
            }
            if(!haveData){
               try {
                int lastRow = sheet.getLastRowNum();
                Row newRow = sheet.createRow(lastRow+1);
                newRow.createCell(0).setCellValue(pattern);
                newRow.createCell(1).setCellValue(detail);
                //newRow.createCell(2).setCellValue(path);
                newRow.createCell(3).setCellValue(price);
                 // ฝังภาพลงในเซลล์
                int pictureIdx = wb.addPicture(imageByte, Workbook.PICTURE_TYPE_JPEG);
                CreationHelper helper = wb.getCreationHelper();
                Drawing<?> drawing = sheet.createDrawingPatriarch();
                ClientAnchor anchor = helper.createClientAnchor();
                anchor.setCol1(2);  // คอลัมน์ที่ 3 (index 2)
                anchor.setRow1(lastRow + 1);  // แถวใหม่
                Picture pict = drawing.createPicture(anchor, pictureIdx);
                pict.resize();  // ปรับขนาดภาพให้พอดีกับเซลล์
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
            sheet = wb.getSheetAt(6); // เปลี่ยนไปที่ชีตแรก
        } catch (Exception err) {
            System.out.println("can't read file: " + err);
        }
    }
    
public ArrayList<Offering> getAll() {        
    oList = new ArrayList<>();
    read();
    try {
        if (sheet == null) {
            System.out.println("Sheet not found");
            return oList; // หรือทำการรีเทิร์นอย่างอื่นหากไม่มีชีต
        }

        for (Row row : sheet) {
            if (row.getRowNum() == 0) {
                name = row.getCell(0).getStringCellValue();
                continue;
            }
            String pattern = null, detail = null, path = null;
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

            // ตรวจสอบค่าที่ได้ก่อนเพิ่มลง oList
            if (name != null && pattern != null && detail != null && path != null && price > 0.0) {
                Offering newOffering = new Offering(name, pattern, detail, path, price);
                // ตรวจสอบไม่ให้มีการเพิ่มซ้ำ
                if (!oList.contains(newOffering)) {
                    oList.add(newOffering);
                }
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
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
    return oList;
}

//   public ArrayList<Offering> getAll() {        
//    oList = new ArrayList<>();
//    Set<String> patterns = new HashSet<>();  // ใช้ Set เพื่อเก็บ pattern ที่ไม่ซ้ำกัน
//    read(); // อ่านข้อมูลจากไฟล์ Excel
//    
//    try {
//        if (sheet == null) {
//            System.out.println("Sheet not found");
//            return oList;
//        }
//        
//        for (Row row : sheet) {
//            // ข้ามแถวแรกที่เป็น header
//            if (row.getRowNum() == 0) {
//                continue;
//            }
//
//            String tempPattern = null, tempDetail = null, tempPath = null;
//            double tempPrice = 0.00;
//
//            for (Cell cell : row) {
//                if (cell == null) {
//                    continue;  // ข้าม cell ที่เป็น null
//                }
//
//                // ใช้ switch เพื่ออ่านค่าตามคอลัมน์ต่าง ๆ
//                switch (cell.getColumnIndex()) {
//                    case 0:
//                        tempPattern = cell.getStringCellValue();
//                        break;
//                    case 1:
//                        tempDetail = cell.getStringCellValue();
//                        break;
//                    case 2:
//                        tempPath = cell.getStringCellValue();
//                        break;
//                    case 3:
//                        tempPrice = cell.getNumericCellValue();
//                        break;
//                }
//            }
//
//            // เช็คข้อมูลให้แน่ชัดก่อนเพิ่มลงในลิสต์ oList
//            if (tempPattern != null && tempDetail != null && tempPath != null && tempPrice != 0.00) {
//                // ตรวจสอบว่ามี pattern นี้ใน Set หรือไม่
//                if (!patterns.contains(tempPattern)) {
//                    patterns.add(tempPattern);  // เพิ่ม pattern ลงใน Set
//                    oList.add(new Offering(name, tempPattern, tempDetail, tempPath, tempPrice));  // เพิ่มลงใน oList
//                }
//            }
//        }
//    } catch (Exception e) {
//        e.printStackTrace();
//    } finally {
//        try {
//            if (fileInput != null) {
//                fileInput.close();
//            }
//            if (fos != null) {
//                fos.close();
//            }
//            if (wb != null) {
//                wb.close();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    return oList;
//}

  
   /*delete column from excel*/
       public void deletePackageDetail(OfferingDetail off) {
        read(); // Ensure the sheet is read and populated
        String pattern =  off.getPatternTF().getText();
        String detail = off.getDetailTA().getText();
        double price = Double.parseDouble(off.getPriceTF().getText());
        int rowIndexToDelete = -1; // Variable to store the index of the row to delete

        // ค้นหาบรรทัดที่ตรงกัน
        for (Row row : sheet) {
            if(row.getRowNum() == 0) continue; // ข้ามแถวที่ 0 (หัวตาราง)
            String rowPattern = row.getCell(0).getStringCellValue();
            String rowDetail = row.getCell(1).getStringCellValue();
            double rowPrice = row.getCell(3).getNumericCellValue();

            // เปรียบเทียบค่าที่ต้องการลบ
            if (rowPattern.equals(pattern) && rowDetail.equals(detail) && Math.abs(rowPrice - price) < 0.0001) {
                rowIndexToDelete = row.getRowNum(); // เก็บตำแหน่งของบรรทัดที่ต้องการลบ
                System.out.println("Row to delete: " + rowIndexToDelete);
                break; // ออกจากลูปเมื่อพบแถวที่ตรงกัน
            }
        }

        // ถ้ามีการพบแถวที่ต้องการลบ
        if (rowIndexToDelete != -1) {
            // เลื่อนข้อมูลขึ้น
            for (int i = rowIndexToDelete + 1; i <= sheet.getLastRowNum(); i++) {
                Row currRow = sheet.getRow(i);
                Row previousRow = sheet.getRow(i - 1);

                if (previousRow != null && currRow != null) {
                    // คัดลอกค่าจากแถวปัจจุบันไปยังแถวก่อนหน้า
                    previousRow.getCell(0).setCellValue(currRow.getCell(0).getStringCellValue());
                    previousRow.getCell(1).setCellValue(currRow.getCell(1).getStringCellValue());
                    previousRow.getCell(3).setCellValue(currRow.getCell(3).getNumericCellValue());
                }
            }

            // ลบแถวที่ค้นพบ
            Row rowToDelete = sheet.getRow(rowIndexToDelete);
            if (rowToDelete != null) {
                sheet.removeRow(rowToDelete);
                System.out.println("Row " + rowIndexToDelete + " deleted.");
            }

            // หากต้องการให้ข้อมูลในแถวสุดท้ายหายไป
            int lastRowIndex = sheet.getLastRowNum();
            if (lastRowIndex >= rowIndexToDelete) {
                sheet.shiftRows(rowIndexToDelete + 1, lastRowIndex, -1); // เลื่อนข้อมูลขึ้น
            }

            // บันทึกการเปลี่ยนแปลง
            try (FileOutputStream fileOut = new FileOutputStream(FILE_NAME)) {
                wb.write(fileOut);
                wb.close();
                fileOut.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

