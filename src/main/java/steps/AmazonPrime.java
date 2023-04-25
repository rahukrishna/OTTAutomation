package steps;
import static org.junit.Assert.*;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AmazonPrimePage;
@RunWith(Cucumber.class)
public class AmazonPrime {
	
	 AmazonPrimePage amazon = new AmazonPrimePage();
	    
	 @Given("^the user navigate to https://www\\.primevideo\\.com$")
	 public void the_user_navigate_to_https_www_primevideo_com() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	     //throw new PendingException();
		 amazon.navigateToAmazon();
	 }

	 @When("^user enters (\\d+) and #ranjini(\\d+)$")
	 public void user_enters_and_ranjini (String username , String pasword) throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	     //throw new PendingException();
		
		        amazon.SignIn(username,pasword);
	 }

	 @Then("^the user is able to login$")
	 public void the_user_is_able_to_login() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	     //throw new PendingException();
		 amazon.verifySignedIn();
	 }
	/*    @Given("^the user navigate to https://www.primevideo.com$")
	    public void navigatToAmazonPage(){

	        amazon.navigateToAmazon();

	    }
	  

	   @When("^user enters (.+) and (.+)$")
	    public void enterUsernameAndPassword(String username , String pasword){
	        amazon.SignIn(username,pasword);
	       
	        //amazon.getItemsString();


	    }

	   

	  @Then("^the user is able to login$")
	    public void VerifySigned(){
	        //amazon.addItemToCart();
		  //Assert.isTrue(amazon.verifySignedIn(), "Successfull", "Failed");
		// Assert.assertEquals();
		  amazon.verifySignedIn();
	     // Assert.assertEquals("true", String.valueOf());
	     // Assert.
	    }
*/
}
