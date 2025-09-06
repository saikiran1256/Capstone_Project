package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Filters {
	WebDriver driver;
	@Given("open the homepage in default browser")
	public void open_the_homepage_in_default_browser() {
		driver=new ChromeDriver();
		   driver.get("https://bstackdemo.com/");
		   driver.manage().window().maximize();
	
	}

	@When("select multiple selections using dropdown")
	public void select_multiple_selections_using_dropdown() {
		PageClass pg=new PageClass(driver);
		pg.filter();
	}

	@Then("closing the driver")
	public void closing_the_driver() {
	   driver.close();
	   System.out.println("Filters completed");
	}
}