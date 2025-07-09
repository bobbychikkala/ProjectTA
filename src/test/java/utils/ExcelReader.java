package utils;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    public static String[][] getCellValue(String filePath, String sheetName) {
    	
    	 String [][]value = null;
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);
            int rowCount = sheet.getPhysicalNumberOfRows();
            int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
            value = new String [rowCount-1][colCount-1];
            
            for(int r=1;r<rowCount;r++) {
            	
            	for(int c=1;c<colCount;c++) {
            		
            		value[r-1][c-1] =sheet.getRow(r).getCell(c).toString();
            	}
            }

           

        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }
}