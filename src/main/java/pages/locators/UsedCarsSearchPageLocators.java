package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UsedCarsSearchPageLocators {
	
	
	@FindBy(how=How.ID,using="make")
    public WebElement selectMake;
	
	@FindBy(how=How.ID,using="model")
    public WebElement selectModel;
	
	@FindBy(how=How.ID,using="state")
    public WebElement selectState;
	
	@FindBy(how=How.ID,using="priceFrom")
    public WebElement selectPrice;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Show used vehicles')]")
	public WebElement clickUsedVehiclesbtn;
	
}
