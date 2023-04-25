package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonPrimePage extends BaseClass {
	
	 
	  public AmazonPrimePage() {
		  super(driver);
		// TODO Auto-generated constructor stub
	}
	//
	  ////span[contains(text(),'Sign in to join Prime')]
	private String navigatetosigninButton = "//span[contains(text(),'Sign in')]/ancestor::button";
	private String userNameTextbox = "//input[contains(@id,'email')]";
	private String passwordTextbox = "//input[contains(@id,'pass')]";
	private String signInButton = "//input[@id='signInSubmit']";
	private String HomeButton = "//a[@class='RsC68p']/span";
	    /*private String pickThirdItem2="//div[@class='sg-col-inner']//div[@class='a-section a-spacing-small a-spacing-top-small']//div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style']//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']";
	    /*private String addToCart = "//input[@id='add-to-cart-button']";
	    private String addToCartMsg = "//span[contains(text(),'Agregado al carrito')]";*/
	    
	 public void navigateToAmazon(){
	       launchURL("https://www.primevideo.com/");
	    }
	 public void clickSigninButton(){
	        clickElement(navigatetosigninButton);
	    }
	 
	 public void SignIn(String username, String password){
	        type(userNameTextbox,username);
	        type(passwordTextbox,password);
	        clickElement(signInButton);
	        
	    }
	 
	 public boolean verifySignedIn(){
		 getElement(HomeButton);
		 return true;
	        
	    }
}
