package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;
	
	@Given("Browserstack website should be opened in default browser")
	public void Browserstack_website_should_be_opened_in_default_browser() {
	   driver=new ChromeDriver();
	   driver.get("https://bstackdemo.com/");
	   driver.manage().window().maximize();
	   
	}

	@Given("^Click on signin link and add (.*) and (.*)$")
	public void Click_on_signin_link_and_add_username_and_password(String username,String password) {
		PageClass pg=new PageClass(driver);
		pg.login(username.trim(),password.trim());
		
	    
	}

	@Then("click on login button")
	public void click_on_login_button() {
	    System.out.println("Login Successful");
	    driver.close();
	}


}
