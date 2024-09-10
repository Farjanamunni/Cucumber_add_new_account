package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features = "classpath:features",
		glue = "steps", // this referring to the package which holds all the step definitions classes
		tags = {"@DbLoginScenario1"},
		strict = true,
		monochrome = true,
		dryRun = false,
		plugin = {
		"pretty",
		"html:target/reports/cucumber.html",
		"json:target/reports/cucumber.json"
		
		}
		)
public class LoginRunner {

}
