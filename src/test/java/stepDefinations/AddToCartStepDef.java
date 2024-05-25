package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCartStepDef {
	
	private WebDriver driver;
	

@Given("I am on the Store page")
public void i_am_on_the_store_page() {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://askomdch.com/store/");
    
}

@When("I add {string} to the cart")
public void i_add_to_the_cart(String string) throws InterruptedException {
	
	driver.findElement(By.xpath("//a[@aria-label='Add “Blue Shoes” to your cart']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@title='View cart']")).click();
	
	
    
}

@Then("I should see {int} {string} in the cart")
public void i_should_see_in_the_cart(Integer quantity, String productName) {
	
	String actualProductName = driver.findElement(By.xpath("//a[text()=\"Blue Shoes\"]")).getText();
	Assert.assertEquals(actualProductName, productName);
    
	String getActualQuantity = driver.findElement(By.xpath("//input[@type=\"number\"]")).getAttribute("value");// see inspect element for Attribute (Value=1)
	Assert.assertEquals(Integer.parseInt(getActualQuantity), quantity);
}




}
