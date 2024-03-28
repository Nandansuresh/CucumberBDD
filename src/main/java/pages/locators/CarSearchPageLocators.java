package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarSearchPageLocators {
	
	
	@FindBy(how=How.LINK_TEXT,using="BMW")
	public WebElement makelink;
	
	@FindBy(how=How.XPATH,using="//h4[contains(text(),'Popular models')]/..//ul/li[1]")
	public WebElement modellink;
    
	@FindBy(how=How.XPATH,using="(//h3[contains(text(),'Location')])[1]")
	public WebElement location;
	
	@FindBy(how=How.LINK_TEXT,using="Central Coast")
	public WebElement locname;
	
	@FindBy(how=How.ID,using="priceFrom")
	public WebElement price;
}