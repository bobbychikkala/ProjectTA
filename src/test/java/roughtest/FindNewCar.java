package roughtest;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import pages.HomePage;
import pages.NewCarPage;
import pages.TataCars;

public class FindNewCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		TataCars tataCars =	newcar.goToTaTa();
		System.out.println(tataCars.getTitle());
		System.out.println(tataCars.getFirstCarTitle());
		//Assert.assertEquals(tataCars.getFirstCarTitle(),"Tata Nexon");
		
	}

}
