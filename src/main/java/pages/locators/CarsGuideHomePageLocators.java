package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {
	
	@FindBy(how=How.LINK_TEXT,using="buy + sell")
	public WebElement buyandselllink;
	
	@FindBy(how=How.LINK_TEXT,using="reviews")
	public WebElement reviewslink;
	
	@FindBy(how=How.LINK_TEXT,using="Buy a car")
	public WebElement carbuylink;
	
	@FindBy(how=How.LINK_TEXT,using="Used")
	public WebElement usedcarslink;
	
	@FindBy(how=How.LINK_TEXT,using="Sell my car")
	public WebElement sellmycarlink;

}
