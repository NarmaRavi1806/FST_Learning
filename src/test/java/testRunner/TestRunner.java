package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = ".\\IBM_Feature\\Login.feature",
        glue = "stepDef",
        monochrome = true,
        plugin = {"html: IBM_Report"}
        

)

public class TestRunner {

}

