//package testproj;
//import org.apache.poi.ss.usermodel.*;
//import java.io.FileInputStream;
//import java.io.IOException;
//
//public class testExcel {
//
//     public static void main(String[] args) {
//        String filePath = "SoftWareUser.xlsx";  // Name of the Excel file you want to read
//
//        try (FileInputStream fis = new FileInputStream(filePath);
//             Workbook wb = WorkbookFactory.create(fis)) {
//
//            Sheet sheet = wb.getSheetAt(0); // Get the first sheet
//
//            for (Row row : sheet) { // Loop through each row in the sheet
//                for (Cell cell : row) { // Loop through each cell in the row
//                    switch (cell.getCellType()) { // Check the type of the cell
//                        case STRING:
//                            System.out.print(cell.getStringCellValue() + "\t");
//                            break;
//                        case NUMERIC:
//                            // Handle numeric formats (including dates)
//                            if (DateUtil.isCellDateFormatted(cell)) {
//                                System.out.print(cell.getDateCellValue() + "\t");
//                            } else {
//                                System.out.print(cell.getNumericCellValue() + "\t");
//                            }
//                            break;
//                        case BOOLEAN:
//                            System.out.print(cell.getBooleanCellValue() + "\t");
//                            break;
//                        default:
//                            System.out.print("Unknown type\t");
//                    }
//                }
//                System.out.println(); // New line after each row
//            }
//        } catch (IOException e) {
//            System.out.println("Error reading the Excel file: " + e.getMessage());
//        }
//    }
//}
