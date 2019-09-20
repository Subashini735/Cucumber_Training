package Simple_Test;

//import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {
	
	@Given("Enter {string} and {string}")
	public void inputcase(String a , String b) {
	    System.out.println("Username:"+" "+a+" "+"Password:"+" "+b);
	   
	}

	@When("Click on Login button")
	public void click_on_Login_button() {
		System.out.println("Login button is Clicked");
	    
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		System.out.println("Home page is displayed");
	    
	}
	
	@Given("Enter {string}")
	public void inputuser(String x) {
		
		System.out.println("User name is entered"+" "+x);
	   
	}

	@Then("Home page is not displayed")
	public void home_page_is_not_displayed() {
		System.out.println("Login failed");
	    
	}

}
