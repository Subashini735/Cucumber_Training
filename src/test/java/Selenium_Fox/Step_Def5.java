package Selenium_Fox;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Step_Def5 {
	
	WebDriver driver;
	
	@Given("Open the browser")
	public void open_the_browser() {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\a08019dirp_c2x.08.05\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe" );
		driver = new FirefoxDriver();
	   
	}

	@And("Enter the url")
	public void enter_the_url() {
		
		driver.get("https://www.google.com/");
	  
	}

	@When("Home page is displayed")
	public void home_page_is_displayed() {
		
		assertEquals("Google",driver.getTitle());
		driver.close();
	   
	}



}
