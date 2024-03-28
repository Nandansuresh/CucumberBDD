package steps;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsSearchPageActions;
import utilities.SeleniumDriver;

public class carSearchStep {
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarsSearchPageActions carsSearchPageActions = new CarsSearchPageActions();
	
	@Given("I am on the home page {string} of carsguide website")
	public void i_am_on_the_home_page_of_carsguide_website(String websiteURL) {
	    SeleniumDriver.openPage(websiteURL);
	}

	@When("I move to menu")
	public void i_move_to_menu(List<String> list) {
	 
		String menu = list.get(1);
		System.out.println(menu);
		carsGuideHomePageActions.movetoBuyandSellMenu();
	}

	@And("I click on Buy a Car")
	public void i_click_on_buy_a_car() {
		carsGuideHomePageActions.clickOnBuyACar();
	}

	@And("I select make as BMW")
	public void i_select_make_as() {
		carsSearchPageActions.clickCarMake();
	}

	@And("I select Model as X5")
	public void i_select_model_as() throws InterruptedException {
		Thread.sleep(3000);
		carsSearchPageActions.clickCarModel();
	}

	@And("I select location as Central Coast")
	public void i_select_location_as() throws InterruptedException {
		Thread.sleep(3000);
		carsSearchPageActions.clickCarLocation();
	}

	@And("I Select price as {string}")
	public void i_select_price_as(String price) throws InterruptedException {
		Thread.sleep(3000);
		carsSearchPageActions.selectPrice(price);
	}

	@Then("I should see list of searched cars contains {string}")
	public void i_should_see_list_of_searched_cars_contains(String string) {
	   
		System.out.println("Car list found");
	}

	@And("the page title should be {string}")
	public void the_page_title_should_be(String title) {
	 
		Assert.assertEquals(SeleniumDriver.getDriver().getTitle(), title);
	}

}
