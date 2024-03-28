package steps;

import io.cucumber.java.Before;
import utilities.SeleniumDriver;

public class BeforeAction {
	
	@Before
	public void setUp() {
		
		SeleniumDriver.setDriver();
	}

}
