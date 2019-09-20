package Selenium_Sample;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(monochrome=true,plugin = {"pretty","json:Report_Sel.json"})
@RunWith(Cucumber.class)

public class Runner4 {

}
