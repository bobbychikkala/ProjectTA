package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
	public ToyotaCars goToToyota()
	{
		driver.findElement(By.xpath("//*[@title='Toyota']")).click();
		return new ToyotaCars(driver);
	}
	
	@FindBy(xpath="//a[@title='Mahindra']")
	WebElement toMahindraCar;
	public MahindraCars goToMahindra()
	{
		toMahindraCar.click();
		return new MahindraCars(driver);
	}
}
