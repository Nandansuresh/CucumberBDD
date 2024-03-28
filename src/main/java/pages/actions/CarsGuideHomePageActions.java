package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utilities.SeleniumDriver;

public class CarsGuideHomePageActions {
	
	CarsGuideHomePageLocators carsGuideHomePageLocators;
	
	public CarsGuideHomePageActions() {
		this.carsGuideHomePageLocators=new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
	}
    
	
	public void movetoBuyandSellMenu() {
		
		new Actions(SeleniumDriver.getDriver()).moveToElement(carsGuideHomePageLocators.buyandselllink).perform();
	}
	
	public void movetoReviewsMenu() {
		
		new Actions(SeleniumDriver.getDriver()).moveToElement(carsGuideHomePageLocators.reviewslink).perform();
	}
	
	public void clickOnBuyACar() {
		carsGuideHomePageLocators.carbuylink.click();
	}
	
	public void clickOnSellMyCar() {
		carsGuideHomePageLocators.sellmycarlink.click();
	}
	
    public void clickOnUsedCar() {
    	carsGuideHomePageLocators.usedcarslink.click();
	}
}
