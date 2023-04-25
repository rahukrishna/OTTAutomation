package pages;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	 protected static WebDriver driver;
	    public static WebDriverWait wait;
	    //public Duration duration = Duration.between(firstStop, lastStop);
	    static{
	    	 System.setProperty(
			            "webdriver.chrome.driver",
			            "F:\\Learning\\chromedriver.exe"); 
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
	       // System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
	        //ChromeOptions chromeoptions = new ChromeOptions();
	        driver = new ChromeDriver(options);
	        //wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	    }
	   
		public BaseClass(WebDriver driver){
	    	BaseClass.driver = driver;
	    	//wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }
		
		public static void launchURL(String url){
	        driver.get(url);
	    }

	    public static void closeBrowser(){
	        driver.quit();    
	    }
	    
	    protected WebElement getElement (String locator){
			//return locator;
	       return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator))); 
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
