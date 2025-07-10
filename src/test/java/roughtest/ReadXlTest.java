package roughtest;



import utils.ExcelReader;

public class ReadXlTest {

	public static void main(String[]args) {
		
		String path = "./src/test/resources/testData.xlsx"  ;
		System.out.println(ExcelReader.dataProvider(path, "Sheet1"));
	

	}
}
