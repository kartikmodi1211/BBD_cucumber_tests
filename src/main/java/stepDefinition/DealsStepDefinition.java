package stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//Data table example 
public class DealsStepDefinition {
	
	WebDriver driver;
	
			
		 @Given("^user is already on Login Page Dealtest$")
		 public void user_already_on_login_page(){
			   System.setProperty("webdriver.chrome.driver", "/Users/kartik/Desktop/Zip_file_installer/chromedriver_mac64/chromedriver");
		        driver = new ChromeDriver();
		        driver.get("https://ui.cogmento.com/");
		 }
		 
		 @When("^title of login page is Free CRM Dealtest$")
		 public void title_of_login_page_is_free_CRM(){
		 String title = driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals("Cogmento CRM", title);
		 }
		 
		 @Then("^user enters username and password Dealtest$")
		 public void user_enters_username_and_password(DataTable credentials){
			List<List<String>> data = credentials.asLists();
		 driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
		 driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
		 }
		
		
		 @Then("^user clicks on login button Dealtest$")
		 public void user_clicks_on_login_button() {
			 driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		 }
		 
		 @Then("^user is on home page Dealtest$")
		 public void user_is_on_hopme_page(){
		 String title = driver.getTitle();
		 System.out.println("Home Page title ::"+ title);
		 Assert.assertEquals("Cogmento CRM", title);
		 }
		 
		 @Then("^user moves to new deal page Dealtest$")
		 public void user_moves_to_new_contact_page() {
		
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
			
			}
		 
		 @Then("^user enters deal details Dealtest$")
		 public void user_enters_contacts_details(DataTable dealData){
			 List<List<String>> dealValues =  dealData.asLists();
			 driver.findElement(By.id("title")).sendKeys(dealValues.get(0).get(0));
			 driver.findElement(By.id("amount")).sendKeys(dealValues.get(0).get(1));
			 driver.findElement(By.id("probability")).sendKeys(dealValues.get(0).get(2));
			 driver.findElement(By.id("commission")).sendKeys(dealValues.get(0).get(3));
		 }
		 
		 @Then("^Close the browser Dealtest$")
		 public void close_the_browser(){
			 driver.quit();
		 }
		
		

}
