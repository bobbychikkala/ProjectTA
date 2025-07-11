package testCases;


import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.BMWCars;
import pages.HomePage;
import pages.MahindraCars;
import pages.NewCarPage;
import pages.TataCars;
import pages.ToyotaCars;
import utils.DataUtil;

public class BMWFirstCar extends BaseTest {


	@Test(dataProviderClass=DataUtil.class,dataProvider ="selectBrowser")
	public void testFirstCar(String browser,String runMode, String carBrand , String carTitle) {

		if(runMode.equals("N")) {
			throw new SkipException("Skipping the test as the run mode is NO");
		}
		setUp(browser);
		driver.get("https://www.carwale.com/");


		HomePage homepage = new HomePage(driver);

		NewCarPage	newcar=	homepage.findNewCars();

		switch(carBrand){
		case "BMW":
			BMWCars bmw = newcar.goBMW();
			Assert.assertEquals(bmw.getTitleOnPage(), carTitle);	
			System.out.println(bmw.getTitleOnPage() + " "+carTitle);
			break;
		case "Tata":
			TataCars tata = newcar.goToTaTa();
			Assert.assertEquals(tata.getTitleOnPage(), carTitle);	
			System.out.println(tata.getTitleOnPage() + " "+carTitle);
			break;	
		case "Mahindra":
			MahindraCars mahindra = newcar.goToMahindra();
			Assert.assertEquals(mahindra.getTitleOnPage(), carTitle);	
			System.out.println(mahindra.getTitleOnPage() + " "+carTitle);
			break;
		case "Toyota":
			ToyotaCars toyoto = newcar.goToToyota();
			Assert.assertEquals(toyoto.getTitleOnPage(), carTitle);	
			System.out.println(toyoto.getTitleOnPage() + " "+carTitle);
			break;	
			
		}

	}
}
