package domainTypes;

import io.cucumber.java.ParameterType;
import io.cucumber.messages.types.Product;

public class CustomParameterTypes {
	
	@ParameterType(".*")
	public Product product(String name) {
		return new Product(name, name);
	}

}
