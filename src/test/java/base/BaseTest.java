package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	    protected WebDriver driver;

	    
	    public void setUp(String browser) {
	    	
	    	switch(browser) {
	    	
	    	case "chrome":
	    		driver = new ChromeDriver();
	    		break;
	    	case "Edge":
	    	case"edge":
	    		driver = new EdgeDriver();
	    		break;	
	    	case "firefox":
	    		driver = new FirefoxDriver();
	    		break;	   		
	    	}
	        
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        System.out.println("Browser launched and maximized.");
	    }

	    @AfterMethod
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	            System.out.println("Browser closed.");
	        }
	    }
	}



