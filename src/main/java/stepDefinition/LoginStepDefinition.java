package stepDefinition;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefinition {

    WebDriver driver;

    @Given("user is already on Login Page logintest")
    public void user_is_already_on_login_page() {
        System.setProperty("webdriver.chrome.driver", "/Users/kartik/Desktop/Zip_file_installer/chromedriver_mac64/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://ui.cogmento.com/");
    }

    @When("title of login page is Free CRM logintest")
    public void title_of_login_page_is_free_CRM() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Cogmento CRM", title);
    }
    
    
     //Reg Exp:
 	 //1. \"([^\"]*)\"
     //2. \"(.*)\"

	/*//when you do not use data driven approach
	 * @Then("^user enters username and password$") 
	 * public void user_enters_username_and_password() {
	 * driver.findElement(By.name("username")).sendKeys(
	 * "kartikmodi121195@icloud.com");
	 * driver.findElement(By.name("password")).sendKeys("Modi@9898"); }
	 */
    
    
    @Then("^user enters \"(.*)\" and \"(.*)\" logintest$")
	 public void user_enters_username_and_password(String username, String password){
	 driver.findElement(By.name("email")).sendKeys(username);
	 driver.findElement(By.name("password")).sendKeys(password);
	 }
    
    @Then("^user clicks on login button logintest$")
    public void user_clicks_on_login_button() {
        driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
    }

    @Then("^user is on home page logintest$")
    public void user_is_on_home_page() {
        String title = driver.getTitle();
        System.out.println("Home Page title ::" + title);
        Assert.assertEquals("Cogmento CRM", title);
   }
   
    @Then("^Close the browser logintest$")
	 public void close_the_browser(){
		 driver.quit();
		 
}
    
}
    
    
    