package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Footerlink {
	WebDriver driver;
	@Given("open homepage in the default browser")
	public void open_homepage_in_the_default_browser() {
		driver=new ChromeDriver();
		   driver.get("https://bstackdemo.com/");
		   driver.manage().window().maximize();
	}

	@When("click on the link in footer")
	public void click_on_the_link_in_footer() {
		PageClass pg=new PageClass(driver);
		pg.clickPrivacyPolicy();
	    
	}

	@Then("print the message")
	public void print_the_message() {
	 driver.close();
	 System.out.println("Footer link Clicked");
	}
}