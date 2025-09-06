package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Vendors {
	WebDriver driver;
	
	@Given("open the home page in the default browser")
	public void open_the_home_page_in_the_default_browser() {
		 driver=new ChromeDriver();
		  driver.get("https://bstackdemo.com/");	
		  driver.manage().window().maximize();
	    
	}

	@When("select vendors and deselect vendors")
	public void select_vendors_and_deselect_vendors() {
		PageClass pg=new PageClass(driver);
		 pg.Samsung();
	        pg.Samsung();
	        pg.Google();
	        pg.Google();
	        pg.OnePlus();
	        pg.Apple();
	        pg.Apple();
	        pg.OnePlus();
	}

	@Then("lastly closing the driver")
	public void lastly_closing_the_driver() {
		driver.close();
		System.out.println("Vendors selection completed");
	}

}