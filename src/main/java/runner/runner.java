package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import pages.BaseClass;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/Resources",
        glue={"steps"},
       // plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-reports.json"},
        tags="@Amazon"
)
public class runner {

	@AfterClass
	public static void cleanDriver(){
	BaseClass.closeBrowser();
	}

}
