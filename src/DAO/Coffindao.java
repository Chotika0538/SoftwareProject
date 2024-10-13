package DAO;

import java.io.BufferedInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; // Allows working with .xlsx files
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import StoreToHaven.AddCoffin;
import StoreToHaven.CoffinDetail;
import StoreToHeaven.*;
import java.awt.Component;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Coffindao {
    private Workbook wb;
    private Sheet sheet;
    private final String FILE_NAME = "StoreStock.xlsx";
    private FileInputStream fileInput;
    private FileOutputStream fos;
    private ArrayList<List<String>> coffinlist = new ArrayList<>();
    private String[] nameCol = { "ชื่อ", "รายละเอียด", "ขนาด 20 นิ้ว", "ขนาด 22 นิ้ว", "ขนาด 24 นิ้ว", "pathรูปภาพ"};
    private ArrayList<CoffinDetail> cfd;
    private Component[] cmp;
    private ArrayList<Coffin> cList;
    String name, pattern, detail, path;

    /* Save data in Excel file */
    public void save(AddCoffin coffin) {
        cmp = coffin.getPic_detailJP().getComponents(); // get CoffinDetail panel
        cfd = new ArrayList<>();
        for (Component c : cmp) {
            cfd.add((CoffinDetail) c);
        }

        // Excel
        read(); // read StoreStock.xlsx
        try { // check that StoreStock.xlsx was found
            if (sheet == null) {
                System.out.println("Sheet not found");
                return;
            }
            Row firstRow = sheet.getRow(0);
            if (firstRow == null) { // this files valid?
                firstRow = sheet.createRow(0); // create first row
                for (int j = 0; j < nameCol.length; j++) {
                    Cell cell = firstRow.createCell(j);
                    cell.setCellValue(nameCol[j]);
                }
            }

            for (int a = 0; a < cfd.size(); a++) {
                String pattern = cfd.get(a).getPatternTF1().getText();
                String detail = cfd.get(a).getDetailTA().getText();
                String path = cfd.get(a).getFilePath();
                int size20 = 0, size22 = 0, size24 = 0;

                // แปลงราคาขนาด 20, 22, 24 พร้อมตรวจสอบความถูกต้อง
                try {
                    String size20Str = cfd.get(a).getPricesize20().getText().trim();
                    String size22Str = cfd.get(a).getPricesize22().getText().trim();
                    String size24Str = cfd.get(a).getPricesize24().getText().trim();

                    // ตรวจสอบว่าค่าไม่เป็นค่าว่าง
                    if (!size20Str.isEmpty()) {
                        size20 = Integer.parseInt(size20Str);
                    }
                    if (!size22Str.isEmpty()) {
                        size22 = Integer.parseInt(size22Str);
                    }
                    if (!size24Str.isEmpty()) {
                        size24 = Integer.parseInt(size24Str);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid size format: " + e.getMessage());
                    continue; // ข้ามไปยังรายการถัดไป
                }

                String[] dataChecked = { pattern, detail, path, String.valueOf(size20), String.valueOf(size22), String.valueOf(size24) };

                boolean haveData = false;
                for (Row row : sheet) {
                    Cell c = row.getCell(0);
                    if (c.toString().equals(dataChecked[0])) {
                        haveData = true;
                        break;
                    }
                }
                if (!haveData) {
                    try {
                        int lastRow = sheet.getLastRowNum();
                        Row newRow = sheet.createRow(lastRow + 1);
                        newRow.createCell(0).setCellValue(pattern);
                        newRow.createCell(1).setCellValue(detail);
                        newRow.createCell(2).setCellValue(path);
                        newRow.createCell(3).setCellValue(size20);
                        newRow.createCell(4).setCellValue(size22);
                        newRow.createCell(5).setCellValue(size24);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            // Write data into StoreStock.xlsx
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
                String pattern = null, detail = null, path = null;
                int size20 = 0;
                int size22 = 0;
                int size24 = 0;
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
                            size20 = (int) cell.getNumericCellValue();
                            break;
                        case 4:
                            size22 = (int) cell.getNumericCellValue();
                            break;
                        case 5:
                            size24 = (int) cell.getNumericCellValue();
                            break;
                    }
                }

                // ตรวจสอบค่าที่ได้ก่อนเพิ่มลง cList
                if (name != null && pattern != null && detail != null && path != null && size20 > 0 && size22 > 0 && size24 > 0) {
                    Coffin newCoffin = new Coffin(name, pattern, detail, size20, size22, size24, path);
                    // ตรวจสอบไม่ให้มีการเพิ่มซ้ำ
                    if (!cList.contains(newCoffin)) {
                        cList.add(newCoffin);
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
        return cList;
    }

    /* Read Excel file */
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
