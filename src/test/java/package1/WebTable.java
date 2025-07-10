package package1;

import org.testng.annotations.Test;


import base.BaseTestForPackage1;
import utils.ExcelReader;

import org.testng.AssertJUnit;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;

public class WebTable extends BaseTestForPackage1 {
	static WebDriver driver = new ChromeDriver();
	static String innings;
	
	@DataProvider(name="inningNo")
	public  String[][]dataSet(){
		
		return  ExcelReader.dataProvider(super.excelPath, "Cricbuzz");
	}

	@Test(dataProvider ="inningNo",priority=1)
	public  void testCricketScore(String inning,String url) {
		driver.get(url);
		innings=inning;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String commonXpath ="//div[@id='"+innings+"']/div[1]";
		int batsmen = driver.findElements(By.xpath(commonXpath+"/div/div[1]/a")).size();
		int column = driver.findElements(By.xpath(commonXpath+"/div[3]/div")).size();
		
		

		for (int r=2 ; r<=batsmen+2;r++) {		
			for(int c=1;c<column;c++) {
				
				String data =driver.findElement(By.xpath(commonXpath+"/div["+r+"]/div["+c+"]")).getText();
				System.out.print(data);
				
				if(c<2) for(int e=0;e<30-data.length();e++)System.out.print(" ");
				
				else if(c==2) for(int d=0;d<45-data.length();d++)System.out.print(" ");
		
				else  for(int e=0;e<6-data.length();e++)System.out.print(" ");
				
			}
			System.out.println();
		}
		AssertJUnit.assertTrue(true);
		//driver.quit();
		System.out.println("===========================================================================================================");
	
	}
	
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
	
}
