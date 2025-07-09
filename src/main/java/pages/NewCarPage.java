package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class NewCarPage extends BasePage{
	

	
	public NewCarPage(WebDriver driver) {
		super(driver);
	}
	

	public void goToMaruti()
	{
		driver.findElement(By.xpath("//*[@title='Maruti Suzuki Cars']")).click();
	}
	public TataCars goToTaTa()
	{
		driver.findElement(By.xpath("//*[@title='Tata Cars']")).click();
		return new TataCars(driver);
	}
	
	public BMWCars goBMW()
	{
		driver.findElement(By.xpath("//*[@title='BMW Cars']")).click();
		return new BMWCars(driver);
	}
}
