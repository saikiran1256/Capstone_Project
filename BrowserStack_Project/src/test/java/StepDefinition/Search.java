package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	WebDriver driver;
	@Given("open home page in default browser")
	public void open_home_page_in_default_browser() {
			driver=new ChromeDriver();
		   driver.get("https://bstackdemo.com/");
		   driver.manage().window().maximize();
	}

	@When("^go to (.*) and add text and search$")
	public void go_to_search_and_add_text_and_search(String search) {
		PageClass pg=new PageClass(driver);
		pg.searchFor(search);
	}

	@Then("close driver")
	public void close_driver() {
	    driver.close();
	    System.out.println("Search Completed");
	}

}