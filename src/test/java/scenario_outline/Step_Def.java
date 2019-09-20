package scenario_outline;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Def {
	
	@Given("Enter {string} and")
	public void enter_and(String id) {
		
		System.out.println("User Id "+" "+id);
	    
	}
	
	@And("Enter the {string} in the field")
	public void enter_the_in_the_field(String pass) {
		
		System.out.println("Password "+" "+pass);
	    
	}

	@When("Click on Login button")
	public void click_on_Login_button() {
		
		System.out.println("Login button is clicked");
	    
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		
		System.out.println("Home page is displayed");
	   
	}

}
