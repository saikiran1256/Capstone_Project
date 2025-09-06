package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Favourites {
	
	WebDriver driver;

	@Given("Home page should be opened in default browser")
	public void Home_page_should_be_opened_in_default_browser() {
	
		driver=new ChromeDriver();
		   driver.get("https://bstackdemo.com/");
		   driver.manage().window().maximize();
	}

	@When("Click on signinlink and signin")
	public void click_on_signinlink_and_signin() {
		PageClass pg=new PageClass(driver);
		pg.login();
	}

	@When("add an item to favourites")
	public void add_an_item_to_favourites() {
		PageClass pg=new PageClass(driver);
		pg.addToFavourites();
	
	}

	@When("check the item in favourites section")
	public void check_the_item_in_favourites_section() {
		PageClass pg=new PageClass(driver);
	    pg.clickFavourites();
	}

	@When("click on the logo")
	public void click_on_the_logo() {
		PageClass pg=new PageClass(driver);
		pg.clickLogo();
	}

	@When("remove the item from favourites")
	public void remove_the_item_from_favourites() {
		PageClass pg=new PageClass(driver);
		pg.addToFavourites();
	   
	}
	@Then("close the driver")
	public void close_the_driver() {
	    System.out.println("Favourites Done ");
	    driver.close();
	}
}