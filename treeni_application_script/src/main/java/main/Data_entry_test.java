package main;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
	       
	    }
		

	    @Test
	    public void login() throws InterruptedException, AWTException, IOException {
	    	WebDriver driver = new EdgeDriver();
	    	 originalWindowHandle = driver.getWindowHandle();
	    	 
	    	 new_data_entry();
	  	   
	 		
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
	
//	driver.manage().window().setSize(new Dimension(676, 296));
      Thread.sleep(4000);
     
      Actions act = new Actions(driver);
      act.sendKeys(Keys.ESCAPE).perform();
      Robot r = new Robot();
      r.keyPress(KeyEvent.VK_ESCAPE);
      r.keyRelease(KeyEvent.VK_ESCAPE);
//      driver.manage().window().setSize(new Dimension(676, 295));
      driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys("admin@treeni.com");	          
      driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys("Treeni@123");
      Thread.sleep(1500);
      driver.findElement(By.xpath("//*[@id=\"mainSection\"]/div/div/div[2]/div[2]/div[1]/div/form/div[3]/button"))
              .click();
      Thread.sleep(1500);
      driver.get("https://utcltest.resustain.io/indicators/669a53a4b4c98b173f000c09/editor");
      Thread.sleep(6000);
      driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/div/button[1]")).click();
      Thread.sleep(2000);

      driver.manage().window().setSize(new Dimension(676, 295));
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div/div[2]"));   

      element.click();
      element.click();
      driver.findElement(By.xpath("//div[text()='China']")).click();
      driver.manage().window().setSize(new Dimension(700, 295));
      WebElement date= driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div/div[2]"));
      date.click();
      date.click();
      
      Thread.sleep(1000);
      driver.manage().window().maximize();
     WebElement select= driver.findElement(By.xpath("//*[@id=\"gdg-overlay-0\"]/div/input"));
     select.sendKeys("20-02-2024");
     r.keyPress(KeyEvent.VK_ENTER);
     r.keyRelease(KeyEvent.VK_ENTER);
     Thread.sleep(1000);
//     driver.manage().window().setSize(new Dimension(800, 296));////
     r.keyPress(KeyEvent.VK_UP);
     r.keyRelease(KeyEvent.VK_UP);
 
     for (int i = 0; i < 6; i++) {
         r.keyPress(KeyEvent.VK_RIGHT);
         r.keyRelease(KeyEvent.VK_RIGHT);
         Thread.sleep(100); 
     }

     r.keyPress(KeyEvent.VK_ENTER);
     r.keyRelease(KeyEvent.VK_ENTER);

    r.keyPress(KeyEvent.VK_4);
    r.keyRelease(KeyEvent.VK_4);
    
    r.keyPress(KeyEvent.VK_TAB);
    r.keyRelease(KeyEvent.VK_TAB);
    Thread.sleep(1000);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(1000);
    r.keyPress(KeyEvent.VK_6);
    r.keyRelease(KeyEvent.VK_6);
   
   
    
    r.keyPress(KeyEvent.VK_SHIFT);
    Thread.sleep(1000);
    for (int e = 0; e < 3; e++) {
    	r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(100); 
    }
    Thread.sleep(100);
    r.keyRelease(KeyEvent.VK_SHIFT);
  
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    
     
     WebElement text= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/textarea"));
     text.sendKeys("test2022");
     

       r.keyPress(KeyEvent.VK_RIGHT);
       r.keyRelease(KeyEvent.VK_RIGHT);

     	Thread.sleep(100);
     driver.manage().window().setSize(new Dimension(1000, 300));
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[1]/div/div[2]")).click();
    driver.manage().window().maximize();
    Thread.sleep(100);
//    handle the file type attribute
    	r.keyPress(KeyEvent.VK_TAB);
    	  r.keyRelease(KeyEvent.VK_TAB);
    	  Thread.sleep(100);
	
  r.keyPress(KeyEvent.VK_ENTER);
  r.keyRelease(KeyEvent.VK_ENTER);
     
  WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));

  // Send the file path to the input element
  String filePath = "C:\\Users\\sande\\Downloads\\image (7).png";
  fileInput.sendKeys(filePath);
     
     //clear the window select file pop-up
     r.keyPress(KeyEvent.VK_ESCAPE);
     r.keyRelease(KeyEvent.VK_ESCAPE);
    //     handle saved the file pop-up
     Thread.sleep(1000);
     r.keyPress(KeyEvent.VK_ENTER);
     r.keyRelease(KeyEvent.VK_ENTER);
     
      //save the record
      driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/button[7]")).click();
      
    //    handle save pop-up
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    


     
      
     
}	    
	    
	    
}