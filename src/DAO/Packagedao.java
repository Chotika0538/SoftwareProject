/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  // Allows working with .xlsx files
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import StoreToHeaven.*;
import java.awt.Component;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.*;
import StoreToHeaven.Package ;
import java.io.InputStream;
import org.apache.poi.util.IOUtils;
public class Packagedao {
    private Workbook wb;
    private Sheet sheet;
    private final String FILE_NAME = "StoreStock.xlsx";
    private FileInputStream fileInput;
    private FileOutputStream fos;
    private ArrayList<List<String>> candlelist = new ArrayList<>();
    private String[] nameCol = { "ชื่อ","รายละเอียด" ,"pathรูปภาพ", "ราคา"};
    private ArrayList<PackageDetail> pgd;
    private ArrayList<Package> pList;
    private Component[] cmp;
    String name , pattern, detail, path;
    double price;
    private ArrayList<PackageDetail> pgList;
    /*Save data in Excel file*/
    public void save(AddPackage pack) {
        cmp = pack.getPic_detailJP().getComponents();    // get CoffinDetail panel
        pgd = new ArrayList<>();
        
        for (Component c : cmp){
            pgd.add((PackageDetail) c);
        }
        System.out.println("pgd size : "+pgd.size());
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
                nameCol[0] = pack.getNameTF().getText();
                /*bring all data in wreathlist to create each col in valid sheet*/
                for(int j=0; j<nameCol.length; j++){
                    Cell cell = firstRow.createCell(j);
                    cell.setCellValue(nameCol[j]);
                 }
             }
             for (int a = 0; a < pgd.size(); a++) {
                String pattern = pgd.get(a).getPatternTF().getText();
                String detail = pgd.get(a).getDetailTA().getText();
                String path = pgd.get(a).getFilePath();
                System.out.println("PATH  : " + path);
                double price;

                try {
                    price = Double.parseDouble(pgd.get(a).getPriceTF().getText());
                } catch (NumberFormatException e) {
                    System.out.println("Error parsing price: " + e.getMessage());
                    continue; // Skip to the next iteration if price parsing fails
                }

                Row row = sheet.getRow(a + 1);
                if (row == null) {
                    row = sheet.createRow(a + 1);
                    row.createCell(0);row.createCell(1);row.createCell(2);row.createCell(3);
                }

                try {
                    row.getCell(0).setCellValue(pattern);
                    row.getCell(1).setCellValue(detail);
                    row.getCell(3).setCellValue(price);

                    if (path != null && !path.isEmpty()) {
                        try (InputStream inputStream = new FileInputStream(path)) {
                            byte[] imageBytes = IOUtils.toByteArray(inputStream);
                            int pictureIndex = wb.addPicture(imageBytes, Workbook.PICTURE_TYPE_PNG);
                            CreationHelper helper = wb.getCreationHelper();
                            Drawing<?> drawingNew = sheet.createDrawingPatriarch();
                            ClientAnchor anchor = helper.createClientAnchor();
                            anchor.setCol1(2); // Column index for the image
                            anchor.setRow1(row.getRowNum()); // Row index for the image
                            Picture picture = drawingNew.createPicture(anchor, pictureIndex);
                            picture.resize(); // Resize to fit cell
                            System.out.println("New image added to row: " + row.getRowNum() + " column: 2");
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }

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
    
    public ArrayList<Package> getAll() {        
    pList = new ArrayList<>();
    read();
    try {
        if (sheet == null) {
            System.out.println("Sheet not found");
            return pList; // หรือทำการรีเทิร์นอย่างอื่นหากไม่มีชีต
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
                Package newPackage = new Package(name, pattern, detail, path, price);
                // ตรวจสอบไม่ให้มีการเพิ่มซ้ำ
                if (!pList.contains(newPackage)) {
                    pList.add(newPackage);
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
        return pList;
    }
    /*Read Excel file*/
   public void read() {
        wb = null;
        try {
            fileInput = new FileInputStream(new File(FILE_NAME));
            wb = new XSSFWorkbook(fileInput);
            sheet = wb.getSheetAt(8); // เปลี่ยนไปที่ชีต 8
        } catch (Exception err) {
            System.out.println("can't read file: " + err);
        }
    }
    public void deletePackageDetail(PackageDetail pack) {
        read(); // Ensure the sheet is read and populated
        String pattern = pack.getPatternTF().getText();
        String detail = pack.getDetailTA().getText();
        double price = Double.parseDouble(pack.getPriceTF().getText());
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
                fileOut.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

