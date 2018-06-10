package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
	@Given("^user navigates to facebook website$")
	public void user_navigates_to_facebook_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Navigating -Facebook website");
	}

	@When("^user validates the homepage title$")
	public void user_validates_the_homepage_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Validating homePage");
	}

	@Then("^user entered the user name$")
	public void user_entered_the_user_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Enter User Name Rajni");
	}

	@Then("^user entered the password$")
	public void user_entered_the_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Enter Password");
	}

	@Then("^user should be successfully logged in$")
	public void user_should_be_successfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login Successfull---pushing FreshCode");
	}
	
}
