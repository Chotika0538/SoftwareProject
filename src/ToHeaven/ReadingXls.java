/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ToHeaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 *
 * @author LENOVO
 */
public class ReadingXls {
    public static void main(String[] args) throws FileNotFoundException, IOException, InvalidFormatException{
        Workbook  wb = null;
        File f = new File("testExcel.xlsx");
        System.out.print(f.exists());
        FileInputStream fins = new FileInputStream(f);
        wb = WorkbookFactory.create(fins);
        Sheet sheet =  wb.getSheetAt(0);
        FormulaEvaluator formulaEval = wb.getCreationHelper().createFormulaEvaluator();
        for (Object row : sheet){
            for(Cell cell : (Row) row){
                switch(formulaEval.evaluateInCell(cell).getCellTypeEnum()){
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue()+"\t\t");
                        break;
                    case STRING:
                        System.out.print(cell.getStringCellValue()+"\t\t");
                        break;
                        
                }
            }
            System.out.println();
            
        }
          
    }
        
}
