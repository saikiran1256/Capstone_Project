package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Removefromcart {
	WebDriver driver;
	
	@Given("Open homepage in default browser")
	public void open_homepage_in_default_browser() {
		driver=new ChromeDriver();
		   driver.get("https://bstackdemo.com/");
		   driver.manage().window().maximize();
	    
	}

	@When("click on signin and then login with credentials")
	public void click_on_signin_and_then_login_with_credentials() {
		PageClass pg=new PageClass(driver);
		pg.login();
	}

	@When("add an item to cart")
	public void add_an_item_to_cart() {
		PageClass pg=new PageClass(driver);
		pg.addItemToCart();
		pg.addQuantity();
		pg.removeQuantity();
		pg.closeCart();
	   
	}

	@When("remove the item from cart")
	public void remove_the_item_from_cart() {
		PageClass pg=new PageClass(driver);
		pg.openCart();
		pg.removeItemFromCart();
		
		
	}

	@Then("close the cart")
	public void close_the_cart() {
		PageClass pg=new PageClass(driver);
		pg.closeCart();
		driver.close();
		System.out.println("Item removed from cart");
	}
	

}