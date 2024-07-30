package main;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class Data_entry_test {

		
		
		public WebDriver driver;
		  public String originalWindowHandle;

	    @BeforeClass
	    public void setUp() {
	        System.setProperty("webdriver.edge.driver", "D:/seleniumwork/Drives/edgedriver_win64.exe");
	        driver = new EdgeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.manage().window().maximize();
	        driver.quit();
	    }
		

	    @Test
	    public void login() throws InterruptedException, AWTException, IOException {
	    	WebDriver driver = new EdgeDriver();
	    	 originalWindowHandle = driver.getWindowHandle();
	    	 
	    	 DataEntry();
	  	   
	 		
	    }
	    
	    public void DataEntry() throws InterruptedException, AWTException, IOException {
	    	
	    	
	    	
	    	
	    	
	    	WebDriver driver = new EdgeDriver();
	    	 originalWindowHandle = driver.getWindowHandle();
	      	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	      	new_data_entry();
	      	driver.quit();
	        
} 
	    
public void new_data_entry() throws InterruptedException, AWTException {
	WebDriver driver = new EdgeDriver();
	driver.get("https://utcltest.resustain.io/");
      Thread.sleep(4000);
     
      Actions act = new Actions(driver);
      act.sendKeys(Keys.ESCAPE).perform();
      Robot r = new Robot();
      r.keyPress(KeyEvent.VK_ESCAPE);
      r.keyRelease(KeyEvent.VK_ESCAPE);

      driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys("admin@treeni.com");	          
      driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys("Treeni@123");
      Thread.sleep(1500);
      driver.findElement(By.xpath("//*[@id=\"mainSection\"]/div/div/div[2]/div[2]/div[1]/div/form/div[3]/button"))
              .click();
      Thread.sleep(1500);
      driver.get("https://utcltest.resustain.io/indicators/669a53a4b4c98b173f000c09/editor");
      Thread.sleep(1000);
      Thread.sleep(1000);
      driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/button[1]")).click();
      
     
}	    
	    
	    
}