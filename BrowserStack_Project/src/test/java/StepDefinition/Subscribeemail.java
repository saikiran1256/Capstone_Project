package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Subscribeemail {
	WebDriver driver;
	@Given("open the homepage in the default browser")
	public void open_the_homepage_in_the_default_browser() {
			driver=new ChromeDriver();
		   driver.get("https://bstackdemo.com/");
		   driver.manage().window().maximize();
	    
	}

	@When("go and enter email in subscribe mail box")
	public void go_and_enter_email_in_subscribe_mail_box() {
		PageClass pg=new PageClass(driver);
		pg.NewsletterEmail();
	    
	}

	@Then("finally close browser")
	public void clos_the_browser() {
	  driver.close();
	  System.out.println("Subscribe email Completed");
	}

}