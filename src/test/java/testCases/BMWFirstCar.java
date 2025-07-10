package testCases;


import org.testng.SkipException;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.BMWCars;
import pages.HomePage;
import pages.NewCarPage;
import utils.DataUtil;

public class BMWFirstCar extends BaseTest {

	
	@Test(dataProviderClass=DataUtil.class,dataProvider ="selectBrowser")
	public void testFirstCar(String browser,String runMode) {
		/*
		 * Map <String,Object>pref = new HashMap<String,Object>();
		 * pref.put("profile.default_content_setting_values.notifications", 2);
		 * ChromeOptions options = new ChromeOptions();
		 * options.setExperimentalOption("prefs", pref);
		 * 
		 * WebDriver driver =new ChromeDriver(options);
		 */
		
		if(runMode.equals("N")) {
			throw new SkipException("Skipping the test as the run mode is NO");
		}
		setUp(browser);
		driver.get("https://www.carwale.com/");
	
		
		HomePage homepage = new HomePage(driver);

		NewCarPage	newcar=	homepage.findNewCars();
		BMWCars	bmw =newcar.goBMW();
		System.out.println(bmw.getFirstCarTitle());
		
	}
}
