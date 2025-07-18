package testCases;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RemoteTest {

	
	
	
	@DataProvider(name="testData")
	public String[][] data(){
		return  new String [][] {
			{"chrome", "https://demoqa.com"},
			{"firefox", "https://demoqa.com"},
			{"edge", "https://demoqa.com"}
		};
	};
	
	@Test(dataProvider ="testData")
	public void browserTest(String browser, String url) throws MalformedURLException, URISyntaxException, InterruptedException{
		
		 WebDriver driver ;
		Capabilities cap = null ;
		
		if(browser.equals("chrome"))
		{
			cap = new ChromeOptions();
		}else if(browser.equals("firefox"))
		{
			cap = new FirefoxOptions();
		}
		else if(browser.equals("edge"))
		{
			cap = new EdgeOptions();
		}
		
		driver = new RemoteWebDriver(new URL("http://localhost:4444"),cap);
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(12000);
		driver.quit();
	}
}
