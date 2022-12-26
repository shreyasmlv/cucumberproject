package cucumberoptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/featurefiles", 
glue = "stepdefinitions",
monochrome=true
//dryRun=true


)

public class testrunner {

}
