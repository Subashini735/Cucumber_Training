package Scenario_Datatable;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Step_Def3 {
	
	@Given("I want to create an account")
	public void i_want_to_create_an_account() {
	    System.out.println("User wants to create account");
	}

	@When("I enter my data")
	public void i_enter_my_data(DataTable dT) {
		
		List<Map<String,String>> list = dT.asMaps(String.class,String.class);
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i).get("name"));
			System.out.println(list.get(i).get("password"));
			System.out.println("\n");
		}
	   
	}

	@Then("Verify the account")
	public void verify_the_account() {
	    System.out.println("User able to login to account");
	}


}
