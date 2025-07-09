package testCases;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import pages.BMWCars;
import pages.HomePage;
import pages.NewCarPage;

public class BMWFirstCar {

	
	@Test
	public void testFirstCar() {
		Map <String,Object>pref = new HashMap<String,Object>();
		pref.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", pref);

		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.carwale.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		HomePage homepage = new HomePage(driver);

		NewCarPage	newcar=	homepage.findNewCars();
		BMWCars	bmw =newcar.goBMW();
		System.out.println(bmw.getFirstCarTitle());
		driver.quit();
	}
}
