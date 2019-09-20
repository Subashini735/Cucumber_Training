package scenario_outline;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(monochrome=true,plugin = {"pretty","junit:reports2.xml"})
@RunWith(Cucumber.class)

public class Runner1 {

}
