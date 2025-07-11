package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import base.BasePage;

public class HomePage extends BasePage{
	
	
	
	
	
	public HomePage(WebDriver driver){
		super(driver); 	 

	}
	
	@FindBy(xpath ="//div[normalize-space()='NEW CARS']")
	public WebElement clickNewCar ; 
	@FindBy(xpath="//div[normalize-space()='Find New Cars']")
	public WebElement newCarClick;
	public NewCarPage findNewCars() 
	{	
		new Actions(driver).moveToElement(clickNewCar).perform();
		newCarClick.click();
		
		return new NewCarPage(driver);
	} 

	@FindBy(xpath="(//input[@type='text'])[2]")
	public WebElement searchBox;
	public void searchCar( String value) 
	{
		
		searchBox.sendKeys(value);
		searchBox.sendKeys(Keys.ENTER);
	}
}     
