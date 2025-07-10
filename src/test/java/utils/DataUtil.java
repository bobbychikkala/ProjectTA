package utils;

import org.testng.annotations.DataProvider;

public class DataUtil {

	private String excelPath = "./src/test/resources/testData.xlsx";
	@DataProvider(name ="cities")
	public String[][] getDataForMMT(){
		return ExcelReader.dataProvider(excelPath, "MMT");
	}
	
	
	@DataProvider(name="inningNo")
	public  String[][]dataSetCricket(){	
		return  ExcelReader.dataProvider(excelPath, "Cricbuzz");
	}
	
	@DataProvider(name="selectBrowser")
	public String [][] dataBrowsers(){
		return ExcelReader.dataProvider(excelPath, "SetUp");
	}
}
