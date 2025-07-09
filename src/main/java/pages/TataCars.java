package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class TataCars extends BasePage{

	public TataCars(WebDriver driver) {
		super(driver);
	}
	int index = 1;
	public String getTitle() {
		return driver.getTitle();
	}
	@FindBy(xpath="//*[text()='Tata Safari EV']/../../div/span[1]")
	WebElement priceElemnet;
	public String getSafariEvPrice() {
		return priceElemnet.getText();
	}
	
	
	
}
