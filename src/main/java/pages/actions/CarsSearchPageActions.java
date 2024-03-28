package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarSearchPageLocators;
import utilities.SeleniumDriver;

public class CarsSearchPageActions {
	
	CarSearchPageLocators carSearchPageLocators;
	
	public CarsSearchPageActions() {
		this.carSearchPageLocators=new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carSearchPageLocators);
	}
	
	public void clickCarMake() {
		carSearchPageLocators.makelink.click();
	}
	
	public void clickCarModel() {
		carSearchPageLocators.modellink.click();
	}
	
	public void clickCarLocation() {
		carSearchPageLocators.location.click();
		carSearchPageLocators.locname.click();
		carSearchPageLocators.location.click();
	}
	
	public void selectPrice(String price) {
		new Select(carSearchPageLocators.price).selectByValue(price);
	}

}
