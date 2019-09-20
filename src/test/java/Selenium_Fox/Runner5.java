package Selenium_Fox;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(monochrome=true,plugin = {"pretty","json:Report_Sel_Fox.json"})
@RunWith(Cucumber.class)

public class Runner5 {

}
