package stepDefinations;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.*;
import objects.Customer;

public class DataTableStepDef {
	
	// 1st  CUSTOM DATA TABLE TYPE OR TRANSFORMER.//
	
//	@DataTableType
//	public Customer customerEntry(List<String> entry) {
//		return new Customer(entry.get(0),entry.get(1));
//		
//	}
	
	////////////////////////////////////////////////////////////////////
	
	// 2nd CUSTOM DATA TABLE TYPE OR TRANSFORMER.//
	
	@DataTableType
	public Customer customerEntry(Map<String, String> entry) {
		return new Customer(entry.get("Username"),entry.get("Password"));
		
	}
	
	//@Given("My Credential")
	//public void my_credential(DataTable dataTable) {
		
	//	List <String> cred =dataTable.values();
	//	System.out.println("UserName : " +cred.get(0));
	//	System.out.println("Password : " +cred.get(1));
		
	//}
	
	////////////////////////////////////////////////////////////////////////////////////////////////

//	@Given("My Credential")
//	public void my_credential(Customer customer) {
//		
//		
//		System.out.println("UserName : " +customer.getUsername());
//		System.out.println("Password : " +customer.getPassword());
//		
//	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// THIS METHOD USES CUSTOM DATA TABLE TYPE OR TRANSFORMER.. 1ST  TRANSFORMER USE BY THIS METHOD
	
//	@Given("My Credential")
//	public void my_credential(List<Customer> customers) {
//		
//		
//		System.out.println("Row 0 username : " +customers.get(0).getUsername());
//		System.out.println("Row 0 password : " +customers.get(0).getPassword());
//        System.out.println("Row 1 username : " +customers.get(1).getUsername());
//		System.out.println("Row 1 password : " +customers.get(1).getPassword());
//	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// SINGLE OR DOUBLE ROW WITH HEADER BY USING LIST OF LIST....
	
	
//	@Given("My Credential")
//	public void my_credential(List<List<String>> customers) {
//		
//		
//		System.out.println("username : " +customers.get(1).get(0));
//		System.out.println("password : " +customers.get(1).get(1));
//        System.out.println("username : " +customers.get(2).get(0));
//		System.out.println("password : " +customers.get(2).get(1));
//	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// SINGLE OR DOUBLE ROW WITH HEADER BY USING LIST OF MAP....[USING LIST OF MAP INSTEAD OF LIST OF LIST]
	// IN MAP CUCUMBER IGNORES HEADER THE ROW 1 BECOME ROW 0...
	
//	@Given("My Credential")
//	public void my_credential(List<Map<String,String>> customers) {
//		
//		
//		System.out.println("username : " +customers.get(0).get("Username"));
//		System.out.println("password : " +customers.get(0).get("Password"));
//        System.out.println("username : " +customers.get(1).get("Username"));
//		System.out.println("password : " +customers.get(1).get("Password"));
//	}
	
////////////////////////////////////////////////////////////////////////////////////////////
	
	// THIS METHOD USES CUSTOM DATA TABLE TYPE OR TRANSFORMER.. 2nd  TRANSFORMER USE BY THIS METHOD
	
//	@Given("My Credential")
//	public void my_credential(List<Customer> customers) {
//		
//		
//		System.out.println("Row 0 username : " +customers.get(0).getUsername());
//		System.out.println("Row 0 password : " +customers.get(0).getPassword());
//        System.out.println("Row 1 username : " +customers.get(1).getUsername());
//		System.out.println("Row 1 password : " +customers.get(1).getPassword());
//	}

///////////////////////////////////////////////////////////////////////////////////////////////
	
	// Multiple Column with header..
	
	@Given("My Credential")
	public void my_credential(List<Map<String,String>> customers) {
		
		
		System.out.println("username : " +customers.get(0).get("Username"));
		System.out.println("password : " +customers.get(0).get("Password"));
        System.out.println("username : " +customers.get(1).get("Username"));
		System.out.println("password : " +customers.get(1).get("Password"));
	}

}
