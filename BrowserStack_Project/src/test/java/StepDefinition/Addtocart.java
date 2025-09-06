package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Addtocart {
	WebDriver driver;
	@Given("Home page opened in default browser")
	public void Home_page_opened_in_default_browser() {
		driver=new ChromeDriver();
		   driver.get("https://bstackdemo.com/");
		   driver.manage().window().maximize();
	}

	@When("click on signin and signin with credentials")
	public void click_on_signin_and_signin_with_credentials() {
		PageClass pg=new PageClass(driver);
		pg.login();
	}

	@When("Add an item to cart")
	public void add_an_item_to_cart() {
		PageClass pg=new PageClass(driver);
		pg.addItemToCart();
	}

	@Then("close the popup")
	public void close_the_popup() {
		PageClass pg=new PageClass(driver);
		pg.closeCart();
		driver.close();
		System.out.println("Item Added to cart ");
	    
	}
}