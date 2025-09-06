package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout {
	WebDriver driver;
	@Given("open the browserstack website in default browser")
	public void open_the_browserstack_website_in_default_browser() {
			driver=new ChromeDriver();
		   driver.get("https://bstackdemo.com/");
		   driver.manage().window().maximize();
	}

	@When("click on signin and then signin")
	public void click_on_signin_and_then_signin() {
		PageClass pg=new PageClass(driver);
		pg.login();
	
	}

	@When("click on logout")
	public void click_on_logout() {
		PageClass pg=new PageClass(driver);
		pg.logout();
	}

	@Then("finally close the browser")
	public void finally_close_the_browser() {
	    driver.close();
	    System.out.println("Logout done successfully");
	}

}