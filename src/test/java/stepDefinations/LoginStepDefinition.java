package stepDefinations;

import io.cucumber.java.en.*;
import io.cucumber.messages.types.Product;


public class LoginStepDefinition {
	

@Given("I am on the store page")
public void i_am_on_the_store_page() {
    // Write code here that turns the phrase above into concrete actions
   
}

@When("I add a {product} to the cart")
public void i_add_a_to_the_cart(Product product) {
    // Write code here that turns the phrase above into concrete actions
    
    System.out.println("PRODUCT NAME : " +product.getName());
    
}

@Then("I see {int} {product} in the cart")
public void i_see_in_the_cart(Integer int1,Product product) {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("PRODUCT NAME : " +product.getName());
    
}


	
	

}
