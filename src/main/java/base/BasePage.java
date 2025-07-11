package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	
	public WebDriver driver;
	public BasePage( WebDriver driver) {
		this.driver = driver;
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//*[@class=\"o-fb o-aR o-C\"])[1]/a")
	public WebElement firstCar;
	public String getFirstCarTitle() {
		
		return firstCar.getDomAttribute("title");
	}
	@FindBy(xpath="//header/h1")
	public WebElement getTitle;
	public String getTitleOnPage()
	{
		return getTitle.getText();	
	}
}
