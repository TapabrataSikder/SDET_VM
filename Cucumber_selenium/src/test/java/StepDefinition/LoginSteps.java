package StepDefinition;

import org.openqa.selenium.WebDriver;
import Pages.Page;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver;
	Page p;
	
	@Given("login page open")
	public void login_page_open() {
	    driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://parabank.parasoft.com/parabank/index.htm");
	    p = new Page(driver);
	}

	@When("^enter (.*) and (.*) and click on submit button and check (.*)")
	public void enter_username_and_password_and_click_on_submit_button_and_check_status(String username1, String pwd, String stat) throws InterruptedException {
	    p.login(username1, pwd, stat);
	}

	@Then("successfully done")
	public void successfully_done() {
	   System.out.println("Logged in..");
	}
	
	
//	@Given("registration page is open")
//	public void registration_page_is_open() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("^enter (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*)")
//	public void enter_john_doe_main_delhi_dl_test_user_and_pass123(Integer int1, Integer int2, Integer int3, Integer int4) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("click on register button")
//	public void click_on_register_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("user registration should be Success")
//	public void user_registration_should_be_success() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

}
