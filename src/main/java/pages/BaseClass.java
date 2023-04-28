package pages;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/* Base class module*/
public class BaseClass {
	 protected static WebDriver driver;
	    public static WebDriverWait wait;
	   public  static void LaunchBrowser(){
	    	 System.setProperty(
			            "webdriver.chrome.driver",
			            "F:\\Learning\\chromedriver.exe"); 
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
	        driver = new ChromeDriver(options);
	        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    }
	   
		public BaseClass(WebDriver driver){
			LaunchBrowser();
	    	BaseClass.driver = driver;
	    	
	      
	    }
		
		public static void launchURL(String url){
	        driver.get(url);
	    }

	    public static void closeBrowser(){
	        driver.quit();    
	    }
	    
	    protected WebElement getElement (String locator){
			//return locator;
	       //return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	    	return driver.findElement(By.xpath(locator));
	    }
	    
	    protected List<WebElement> getElements (String locator){
			
	    	List <WebElement> Lst = driver.findElements(By.xpath(locator));
	    	return Lst;
	      
	    }
	    
	    private void waitForElement (String locator){
			//return locator;
	       
	  	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator))); 
	    }

	    public void clickElement(String locator){
	    	getElement(locator).click();
	    }
	    public void clickJS(String locator)
	    {
	    	WebElement Element = getElement(locator);
	    	JavascriptExecutor executor = (JavascriptExecutor)driver;
	    	executor.executeScript("arguments[0].click();", Element);
	    }
	    public void typeJS(String locator, String value)
	    {
	    	WebElement Element = getElement(locator);
	    	JavascriptExecutor executor = (JavascriptExecutor)driver;
	    	executor.executeScript("arguments[0].value='"+ value +"';", Element);
	    }
	    public void pressEnterKeyJS(String locator) 
		 {
			
	    	getElement(locator).submit();
		 }

	    public void type (String locator, String textToWrite){
	    	getElement(locator).clear();
	    	getElement(locator).sendKeys(textToWrite);
	    }
	    
	    public void typeEnterKey (String locator){
	    
	    	getElement(locator).sendKeys(Keys.ENTER);
	    }

	    public void goToLinkText(String link){
	        driver.findElement(By.linkText(link)).click();;
	    }

	    public String textFromElement(String locator){
	        return getElement(locator).getText();
	    }

	    public void selectItems(String locator, int index){
	        List<WebElement> results = driver.findElements(By.xpath(locator));
	        results.get(index).click();
	        }

}
