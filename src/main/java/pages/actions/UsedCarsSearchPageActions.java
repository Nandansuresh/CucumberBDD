package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.UsedCarsSearchPageLocators;
import utilities.SeleniumDriver;

public class UsedCarsSearchPageActions {
	
	UsedCarsSearchPageLocators usedCarsSearchPageLocators;
	Select select;
	
	public UsedCarsSearchPageActions() {
		this.usedCarsSearchPageLocators=new UsedCarsSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedCarsSearchPageLocators);
	}
	
	public void selectMake(String make) {
		select = new Select(usedCarsSearchPageLocators.selectMake);
		select.selectByVisibleText(make);
	}
	
	public void selectModel(String model) {
		select = new Select(usedCarsSearchPageLocators.selectModel);
		select.selectByVisibleText(model);
	}
	
	public void selectLocation(String location) {
		select = new Select(usedCarsSearchPageLocators.selectState);
		select.selectByVisibleText(location);
	}
	
	public void selectPrice(String price) {
		select = new Select(usedCarsSearchPageLocators.selectPrice);
		select.selectByVisibleText(price);
	}
	
	public void clickOnShowUsedCars() {
		usedCarsSearchPageLocators.clickUsedVehiclesbtn.click();
	}
	

}
