package loginPhone;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class ValidLogin {
    public static AndroidDriver driver;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        setup();
    }

    public static void setup() throws MalformedURLException, InterruptedException {
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
        driver.findElement(By.xpath("//android.widget.TextView[@text=\"Phone\"]")).click();
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement phoneNumberField = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText")));
        phoneNumberField.sendKeys("9744127762");
        
        driver.findElement(By.xpath("(//android.view.View[@content-desc=\"Arrow Right\"])[1]")).click();
         
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.google.android.gms:id/positive_button\"]")).click();
        System.out.println();
     // Set implicit wait for all elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
       
        System.out.println("Signup completed");
        
        //Checking the user entered the home page or not
       if(!driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"xp_icon\"]")).isDisplayed()) {
        //clicking on the filling personal data
        
        //Name field
	      WebElement name =  driver.findElement(By.xpath("//android.widget.TextView[@text=\"Your Name\"]"));
	      name.sendKeys("Redhul");
	     
	    //Email field
	      WebElement emailfield = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Your Email\"]"));
	      emailfield.sendKeys("redhulkr2003@gmail.com");
	      
	      //Gender selecting
	      
	      WebElement gender = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Male\"]"));
	      gender.click();
	      
	      //Terms and condition agreeing
	      WebElement button1 = driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[4]"));
	      button1.click();
	      
	      WebElement button2 = driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[5]"));
	      button2.click();
	      
	      //Arrow right button clicking
	       driver.findElement(By.xpath("//android.view.View[@content-desc=\"Arrow Right\"]")).click();
	      
	      //Selecting the meditation type
	       
	       WebElement stressOption = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Stress and anxiety\"]"));
	       
	       stressOption.click();
	       
	       //Arrow right button clicking
	       driver.findElement(By.xpath("//android.view.View[@content-desc=\"Arrow Right\"]")).click();
	      
	       //What are you looking selection
	       
	       driver.findElement(By.xpath("//android.widget.TextView[@text=\"Stress Relief\"]")).click();
	       
	       driver.findElement(By.xpath("//android.widget.TextView[@text=\"Better Sleep\"]")).click();
	       
	       
	       //Arrow right button clicking
	       driver.findElement(By.xpath("//android.view.View[@content-desc=\"Arrow Right\"]")).click();
	      
       }
      
       else {
	       //Entering the home page
	      
    	   System.out.println("User entered into the homepage");
	       //Search button checking
	       
	       WebElement searchIcon = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"xp_icon\"]"));
	       
	      searchIcon.click();
	       
	       //searching operation
	       
	       driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("Calm music");
	       
	       
     
	       }

        
    }
}
