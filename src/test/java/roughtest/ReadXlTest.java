package roughtest;

import java.util.Arrays;

import utils.ExcelReader;

public class ReadXlTest {

	public static void main(String[]args) {
		
		String path = "./src/test/resources/testData.xlsx"  ;
		System.out.println(ExcelReader.getCellValue(path, "Sheet1"));
	
		String [][] myArr = ExcelReader.getCellValue(path, "Sheet1");

System.out.println(Arrays.deepToString(myArr));

	for(int i=0;i<myArr.length;i++) {
		
		for(int j=0 ; j<myArr[i].length;j++) {
			System.out.print(myArr[i][j]+" ");
		}System.out.println();
	}
		
	}
}
