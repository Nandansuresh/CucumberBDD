package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.UsedCarsSearchPageActions;

public class usedCarSearchStep {
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	UsedCarsSearchPageActions usedCarsSearchPageActions = new UsedCarsSearchPageActions();
	
	@And("I click on Used search car")
	public void i_click_on_used_search_car() {
		carsGuideHomePageActions.clickOnUsedCar();
	}

	@And("I select carbrand as {string} from AnyMake dropdown")
	public void i_select_carbrand_as_from_any_make_dropdown(String make) {
		usedCarsSearchPageActions.selectMake(make);
	}

	@And("I select carmodel as {string} from Select model dropdown")
	public void i_select_carmodel_as_from_select_model_dropdown(String model) {
		usedCarsSearchPageActions.selectModel(model);
	}

	@When("I select location as {string} from location dropdown")
	public void i_select_location_as_from_location_dropdown(String location) {
		usedCarsSearchPageActions.selectLocation(location);
	}

	@And("I Select price as {string} from price dropdown")
	public void i_select_price_as_from_price_dropdown(String price) {
		usedCarsSearchPageActions.selectPrice(price);
	}

	@And("I click on show used vehicles button")
	public void i_click_on_show_used_vehicles_button() {
		usedCarsSearchPageActions.clickOnShowUsedCars();
	}

}
