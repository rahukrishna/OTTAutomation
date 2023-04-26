package steps;
import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pages.AmazonPrimePage;
@RunWith(Cucumber.class)
public class AmazonPrime {
	
	 AmazonPrimePage amazon = new AmazonPrimePage();
	    
	 @Given("^the user navigate to https://www\\.primevideo\\.com$")
	 public void the_user_navigate_to_https_www_primevideo_com() throws Throwable {
		 amazon.navigateToAmazon();
		 //
	 }

	 @When("^user enters (.+) and (.+)$")
	 public void user_enters_and_ranjini (String username , String pasword) throws Throwable {	     
		        amazon.SignIn(username,pasword);
	 }

	 @Then("^the user is able to login$")
	 public void the_user_is_able_to_login() throws Throwable {
		 amazon.verifySignedIn();
	 }
	 
	 @Given("^the user navigate to https://www\\.primevideo\\.com and log in with (.+) and(.+)$")
	 public void the_user_login_to_application(String username , String pasword)
		 {amazon.navigateToAmazon();
		 amazon.SignIn(username,pasword);
		 amazon.verifySignedIn();
	 }
	 @When("^user enters (.+) in the search box$")
	 public void the_user_searches_moviename(String moviename)
	 {
		 amazon.enterMovieNameandSearch(moviename);		 
	 }
	 @Then("^movies are displayed$")
	 public void movies_are_displayed()
	 {
		 amazon.verifyFilmsDisplayed();
	 }
	
	 
	 @When("^user click on (.+)$")
	 public void user_click_on(String movieName) throws Throwable {
	    
		 amazon.navigateToMovie(movieName);
	 }
	 
	 @Then("^it navigates to movie page$")
	 public void it_navigates_to_movie_page(String movieName) throws Throwable {	     
		 amazon.verifyNavigatedToMoviePage(movieName);
	 }
	 @Given("^user enters (.+) in the search box,user click on (.+)$")
	 public void the_user_searches_moviename_and_click_on(String moviename)
	 {
		 amazon.enterMovieNameandSearch(moviename);		
		 amazon.navigateToMovie(moviename);
	 }
	 @When("user clics on play button")
	 public void the_user_clicks_on_play_button()
	 {
		 amazon.clickOnPlayButton();
	 }
	 @Then("Movie is playing")
	 public void movie_is_playing()
	 {
		 
	 }

	 
}
