//package hooks;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.BeforeStep;
//import io.cucumber.java.Scenario;
//
//public class CucumberHooks {
//	
//	@Before(order=0)
//	public void before0(Scenario scenario) {
//		System.out.println("Before Hook = 0");
//		System.out.println("Scenario Name: " +scenario.getName());
//		System.out.println("Scenario Status: " +scenario.getStatus());
//	}
//	
//	
//	@After(order=0)
//	public void after0() {
//		System.out.println("After Hook =0");
//	}
//	
//	@Before(order=1)
//	public void before1(Scenario scenario) {
//		System.out.println("Before Hook= 1");
//		
//	}
//	
//	@After(order=1)
//	public void after1() {
//		System.out.println("After Hook = 1");
//	}
//	
//	@BeforeStep
//	public void beforeStep() {
//		System.out.println("Before Step");
//	}
//	
//@io.cucumber.java.AfterStep
//	public void afterStep() {
//		System.out.println("After Step");
//	}
//
//}
