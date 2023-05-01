/*package stepDefinitions;
import org.openqa.selenium.By;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	
	WebDriver driver;
	
	@Given("^User is already on Login Page$")
	public void user_is_already_on_Login_Page() {
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://classic.crmpro.com/index.html");
	}
	
	@When("^title of login page is FreeCRM$")
	public void title_of_login_page_is_FreeCRM() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
		
	}
	
	//Reg Exp:
	 //1. \"([^\"]*)\"
     //2. \"(.*)\"
	
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password)  {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		 
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException {
		 WebElement loginBtn =	driver.findElement(By.xpath("//input[@type='submit']"));
				 JavascriptExecutor js = (JavascriptExecutor)driver;
				 js.executeScript("arguments[0].click();", loginBtn);
				 Thread.sleep(10000);
	   
	}

	/*@Then("^user is on home page$")
	public void user_is_on_home_page()  {
	    String hptitle = driver.getTitle();
	    System.out.println(hptitle);
	    Assert.assertEquals("CRMPRO",hptitle);}

	@Then("^user moves to new contact page$")
	public void user_moves_to_new_contact_page() throws InterruptedException {
		driver.switchTo().frame("mainpanel");
        Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
        driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
	   
	}
	
	@Then("^user enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_contact_details(String firstname, String lastname, String position) {
		 driver.findElement(By.id("first_name")).sendKeys(firstname);
         driver.findElement(By.id("surname")).sendKeys(lastname);
         driver.findElement(By.id("company_position")).sendKeys(position);
         driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
	    
	}

	@Then("^close the browser$")
	public void close_the_browser() {
	    driver.quit();
	}

}*/
