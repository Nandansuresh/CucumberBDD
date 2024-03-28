package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features="src/test/resources/features",
	tags= "@search-cars or @used-search-cars",
	glue= {"steps"},
	plugin= {"json:target/RunCuke/cucumber.json","pretty","html:target/RunCuke/cucumber-html-report.html",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	monochrome=true)
public class RunCuke extends AbstractTestNGCucumberTests{

}
