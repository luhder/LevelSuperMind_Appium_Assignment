package loginEmail;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class ValidLogin {
	public static 	AndroidDriver driver;
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
	        
	        driver.findElement(By.xpath("//android.widget.TextView[@text=\"Email\"]")).click();
	        
	        
	        WebElement emailField =driver.findElement(By.xpath("//android.widget.TextView[@text=\"Enter your email\"]"));
	        emailField.sendKeys("redhulkr2003@gmail.com");
	        
	        driver.findElement(By.xpath("(//android.view.View[@content-desc=\"Arrow Right\"])[1]")).click();
	         
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.google.android.gms:id/positive_button\"]")).click();
	        System.out.println();
	     // Set implicit wait for all elements
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	       
	}

}
