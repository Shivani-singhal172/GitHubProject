package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "GitHub//Feature",
		glue = {"GitHub//src//main//java"},
		dryRun = true
		
		)

public class TestRunner {

}
