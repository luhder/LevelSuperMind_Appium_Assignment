package loginPhone;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class InvalidLogin {
	public static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		setup();

	}
	
	public static void setup() throws MalformedURLException {
	    DesiredCapabilities dc = new DesiredCapabilities();

        // Setting desired capabilities
        dc.setCapability("appium:platformName", "Android");
        dc.setCapability("appium:platformVersion", "11");
        dc.setCapability("appium:deviceName", "SM A207F");
        dc.setCapability("appium:automationName", "UiAutomator2");
        dc.setCapability("appPackage", "level.game");
        dc.setCapability("appActivity", "level.game.MainActivity"); 
        // Initializing the URL
        URL url = new URL("http://127.0.0.1:4723/");
      
        driver = new AndroidDriver(url, dc); 

        System.out.println("App started.....");
        
       // By buttonLocator = By.xpath(
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button")));

        // Now you can click or interact with the button
        button.click();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        //driver.findElement(By.xpath("//android.widget.TextView[@text=\"Email\"]")).click();
        
       
        //Finding the number textbox and giving input 
        driver.findElement(By.xpath("//android.widget.TextView[@text=\"Phone\"]")).click();
       
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
       
        WebElement phoneNumberField = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText")));
        
        phoneNumberField.sendKeys("0000000000");//Proving wrong phone number
        //Arrow right button clicking
	    driver.findElement(By.xpath("//android.view.View[@content-desc=\"Arrow Right\"]")).click();
	    
	    try {
	    if(driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\\\"xp_icon\\\"]")).isDisplayed()) {
	    	System.out.println("The user entered into the homepage");
	    }
	    }
	    catch(Exception e) {
	    	System.out.println("Error happened in signup");
	    }
        
	}

}
