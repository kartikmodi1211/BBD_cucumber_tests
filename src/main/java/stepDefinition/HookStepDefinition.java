package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HookStepDefinition {
	
	//@ before and @after are global hook that are called hooks
	@Before
	public void setUP(){
		System.out.println("launch FF");
		System.out.println("Enter URL for Free CRM APP");
	}
	
	@After
	public void tearDown(){
		System.out.println("close the browser");
     }
	//------------------------------------------------------------------
	//Below is the example of tagged hook,that are linked with tags in feature file
	//below tagged hooks (local hooks)will only run before and after scenario that is tagged with @first
	
	@Before("@First")
	public void beforeFirst(){
		System.out.println("before only first scenario");
	}
	
	@After("@First")
	public void afterFirst(){
		System.out.println("after only first sceanrio");
	}
	//---------------------------------------------------------------------
	
	@Given("^user is on deal page hooktest$")
	public void user_is_on_deal_oage() throws Throwable {
		System.out.println("user is on deal page");
	}
	
	@When("^user fills the deals form hooktest$")
	public void user_fills_the_deals_form() throws Throwable {
		System.out.println("create a deal");
	}
	
	@Then("^deal is created hooktest$")
	public void deal_is_created() throws Throwable {
		System.out.println("deal is created");
	}
		
	
	@Given("^user is on contact page hooktest$")
	public void user_is_on_contact_page() throws Throwable {
		System.out.println("user is on contact page");
	
	}
	
	@When("^user fills the contact form hooktest$")
	public void user_fills_the_contact_form() throws Throwable {
		System.out.println("create a contact");
	}
	
	@Then("^contact is created hooktest$")
	public void contact_is_created() throws Throwable {
		System.out.println("contact is created");
	}
	
	
	
	@Given("^user is on mail page hooktest$")
	public void user_is_on_mail_page() throws Throwable {
		System.out.println("user is on mail pahge");
   }
	
	@When("^user fills the mail form hooktest$")
	public void user_fills_the_mail_form() throws Throwable {
		System.out.println("create a mail");
	}
	
	@Then("^mail is created hooktest$")
	public void mail_is_created() throws Throwable {
		System.out.println("mail is created");
	}
}
