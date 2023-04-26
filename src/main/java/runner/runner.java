package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
import pages.BaseClass;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/Resources",
        glue={"steps"},
        		plugin= {"json:target/RunCuke/cucumber.json",
                        "pretty","html:target/RunCuke/cucumber.html",
                        "com.cucumber.listener.ExtentCucumberFormatter"},
        tags="@Amazon"
)
public class runner {

	@AfterClass
	public static void cleanDriver(){
	BaseClass.closeBrowser();
	}

}
