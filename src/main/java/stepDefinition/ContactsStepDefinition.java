package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactsStepDefinition {


	 WebDriver driver;

	
	 @Given("^user is already on Login Page ContactsTest$")
	 public void user_already_on_login_page(){
	 System.setProperty("webdriver.chrome.driver","/Users/kartik/Desktop/Zip_file_installer/chromedriver_mac64/chromedriver");
	 driver = new ChromeDriver();
	 driver.get("https://ui.cogmento.com/");
	 }
	
	
	 @When("^title of login page is Free CRM ContactsTest$")
	 public void title_of_login_page_is_free_CRM(){
	 String title = driver.getTitle();
	 System.out.println(title);
	 Assert.assertEquals("Cogmento CRM", title);
	 }
	

	
	 @Then("^user enters \"(.*)\" and \"(.*)\" ContactsTest$")
	 public void user_enters_username_and_password(String username, String password){
	 driver.findElement(By.name("email")).sendKeys(username);
	 driver.findElement(By.name("password")).sendKeys(password);
	 }
	
	 @Then("^user clicks on login button ContactsTest$")
	 public void user_clicks_on_login_button() {
		 
		 
		 driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		 
			/*
			 * WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
			 *  JavascriptExecutor js = (JavascriptExecutor)driver;
			 *   js.executeScript("arguments[0].click();",
			 * loginBtn);
			 */
	 }
	
	
	 @Then("^user is on home page ContactsTest$")
	 public void user_is_on_hopme_page(){
	 String title = driver.getTitle();
	 System.out.println("Home Page title ::"+ title);
	 Assert.assertEquals("Cogmento CRM", title);
	 }
	 
	 @Then("^user moves to new contact page ContactsTest$")
	 public void user_moves_to_new_contact_page() {
		
		    Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"))).build().perform();
			driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[1]/div[3]/button[1]")).click();
		}
	 
	 
	 @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\" ContactsTest$")
	 	 public void user_enters_contacts_details(String firstname, String lastname, String position){
         driver.findElement(By.id("first_name")).sendKeys(firstname);
		 driver.findElement(By.id("surname")).sendKeys(lastname);
		 driver.findElement(By.id("company_position")).sendKeys(position);
		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
	 }
	 

	 @Then("^Close the browser ContactsTest$")
	 public void close_the_browser(){
		 driver.quit();
	 }
	
	
	

}
