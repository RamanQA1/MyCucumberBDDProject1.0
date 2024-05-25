package stepDefinations;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PlaceAnOrder {
	
	private WebDriver driver;
	

@Given("I am a guest customer")
public void i_am_a_guest_customer() {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://askomdch.com/store/");
   
}

@Given("I have a product in the cart")
public void i_have_a_product_in_the_cart() throws InterruptedException {
	
	driver.findElement(By.xpath("//a[@aria-label='Add “Blue Shoes” to your cart']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@title='View cart']")).click();
   
}

@Given("I am on the checkout page")
public void i_am_on_the_checkout_page() {
	
	driver.findElement(By.xpath("//a[normalize-space()=\"Proceed to checkout\"]")).click();
   
}

@When("I provide billing details")
public void i_provide_billing_details(List<Map<String,String>> billingDetails) {
	
	driver.findElement(By.id("billing_first_name")).sendKeys(billingDetails.get(0).get("First name"));
	driver.findElement(By.id("billing_last_name")).sendKeys(billingDetails.get(0).get("Last name"));
	driver.findElement(By.id("billing_address_1")).sendKeys(billingDetails.get(0).get("Street address_line1"));
	WebElement cityy = driver.findElement(By.id("billing_city"));
	cityy.clear();
	cityy.sendKeys(billingDetails.get(0).get("City"));
	Select select = new Select(driver.findElement(By.id("billing_state")));
	select.selectByVisibleText(billingDetails.get(0).get("State"));
	driver.findElement(By.id("billing_postcode")).sendKeys(billingDetails.get(0).get("Zip code"));
	driver.findElement(By.id("billing_email")).sendKeys(billingDetails.get(0).get("Email address"));
	   
   
}

@When("I Placed an order")
public void i_placed_an_order() throws InterruptedException {
	
	driver.findElement(By.id("place_order")).click();
	Thread.sleep(5000);
    
}

@Then("The order should placed successfully")
public void the_order_should_placed_successfully() {
	
	String actualTxt = driver.findElement(By.xpath("//p[text()=\"Thank you. Your order has been received.\"]")).getText();
	Assert.assertEquals(actualTxt,"Thank you. Your order has been received.");
    
}




}
