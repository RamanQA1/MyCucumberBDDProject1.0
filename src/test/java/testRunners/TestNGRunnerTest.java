package testRunners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

//@CucumberOptions(plugin = "message:target/cucumber-report.ndjson")

@CucumberOptions(plugin = { "pretty", "html:target/cucumber.html", "summary" },// Pretty plugin give detail report//

		snippets = SnippetType.CAMELCASE,
		dryRun=true ,
		tags= "@scenario1 or @featuretag",
		glue={"stepDefinations","hooks","domainTypes"},
		features ="src/test/java/featureFiles" 
		) 




public class TestNGRunnerTest extends AbstractTestNGCucumberTests {

	@BeforeClass
	public void before() {
		System.out.println("before clsss");
	}

	@AfterClass
	public void after() {
		System.out.println("after clsss");
	}
}