package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.UsedCarsSearchPageLocators;
import utilities.SeleniumDriver;

public class UsedCarsSearchPageActions {
	
	UsedCarsSearchPageLocators usedCarsSearchPageLocators;
	
	public UsedCarsSearchPageActions() {
		this.usedCarsSearchPageLocators=new UsedCarsSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedCarsSearchPageLocators);
	}
	
	public void selectMake(String make) {	
		SeleniumDriver.DropdownSelect(usedCarsSearchPageLocators.selectMake, make);
	}
	
	public void selectModel(String model) {
		SeleniumDriver.DropdownSelect(usedCarsSearchPageLocators.selectModel, model);
	}
	
	public void selectLocation(String location) {
		SeleniumDriver.DropdownSelect(usedCarsSearchPageLocators.selectState, location);
	}
	
	public void selectPrice(String price) {
		SeleniumDriver.DropdownSelect(usedCarsSearchPageLocators.selectPrice, price);
	}
	
	public void clickOnShowUsedCars() {
		usedCarsSearchPageLocators.clickUsedVehiclesbtn.click();
	}
	

}
