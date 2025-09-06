package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Headerlinks {
	WebDriver driver;
	@Given("open website in default browser")
	public void open_website_in_default_browser() {
		   driver=new ChromeDriver();
		   driver.get("https://bstackdemo.com/");
		   driver.manage().window().maximize();
	   
	}

	@When("click on signin and signin with details")
	public void click_on_signin_and_signin_with_details() {
		PageClass pg=new PageClass(driver);
		pg.login();
	}

	@When("navigate to offers")
	public void navigate_to_offers() {
		PageClass pg=new PageClass(driver);
		pg.clickOffers();
		pg.clickLogo();
	   
	}

	@When("navigate to favourites")
	public void navigate_to_favourites() {
		PageClass pg=new PageClass(driver);
		pg.addToFavourites();
        pg.clickFavourites();
        pg.clickLogo();
        pg.addToFavourites();
		
	}

	@When("navigate to orders")
	public void navigate_to_orders() {
		
		PageClass pg=new PageClass(driver);
		pg.addItemToCart();
        pg.addQuantity();
        pg.removeQuantity();
        pg.clickBuy();
        pg.AddressInfo();
        pg.clickContinue();
        pg.downloadPdf();
        pg.continueShopping();
		pg.clickOrders();
		pg.clickLogo();
	    
	}

	@Then("close the browser")
	public void close_the_browser() {
	    driver.close();
	    System.out.println("Header links clicked");
	}

}