package roughtest;

import java.util.Arrays;

import utils.ExcelReader;

public class ReadXlTest {

	public static void main(String[]args) {
		
		String path = "./src/test/resources/testData.xlsx"  ;
		System.out.println(ExcelReader.getCellValue(path, "Sheet1"));
	
		String [][] myArr = ExcelReader.getCellValue(path, "Sheet1");




	}
}
