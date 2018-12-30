package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("^User is already on Login page$")		
	public void Usr_already_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");	
		driver.manage().window().maximize();
	}
	@When("^title of page is Free CRM$")
	public void Title_of_login_page() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	}	
	@Then("User enters \'(.*)' and \'(.*)'$")
	public void user_enters_Username_and_Password(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	} 
	@Then("User clicks on Login button")
	public void user_clicks_on_Login_button() {
		WebElement loginbuttn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", loginbuttn);
	}

	@Then("User is on home page")
	public void user_is_on_home_page() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO", title);
	}
	    
	
	
	

}
