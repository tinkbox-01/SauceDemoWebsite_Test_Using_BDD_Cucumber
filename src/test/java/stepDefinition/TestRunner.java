package stepDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
		features = "src/main/resources/feature/SauceDemoBurgerMenu.feature", 
		dryRun=false,
		monochrome = false, 
		plugin = {"pretty", 
				  "html:target/cucumber.html"}
		)

public class TestRunner {

}
