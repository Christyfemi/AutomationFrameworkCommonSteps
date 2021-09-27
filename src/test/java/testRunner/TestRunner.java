package testRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features"},
        glue = {"steps"},
      //  plugin = {"pretty", "json:target/json-report/cucumber.json"},
        plugin = {"pretty", "html:Report1"},
        dryRun =false, //True any code that does not have Step def associated with them
        strict = true,//True means it is mandatory to have all the steps in the Feature file
       monochrome = true, // This is used for displaying result on the console
       tags = {"@P1"}
       // name = {"Logo"} // I.E Logo in the any scenario will be pick and run
)

public class TestRunner {
}
