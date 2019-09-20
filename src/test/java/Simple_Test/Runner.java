package Simple_Test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(monochrome=true,plugin = {"pretty","junit:reports.xml"},tags= {"@sanity,@smoke"})
@RunWith(Cucumber.class)

public class Runner {

}
