package alertboxdemo_pac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class DragDrop2 {
	WebDriver driver;
	
  @Test
  public void alert() throws InterruptedException {
	  driver.get("http://www.seleniumlearn.com/drag-and-drop");
     // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       Thread.sleep(9000);
       Actions act=new Actions(driver);
       WebElement source=driver.findElement(By.id("draggable"));
       WebElement target=driver.findElement(By.id("droptarget"));
       act.dragAndDrop(source,target).perform();
       
	
				
  }
  @BeforeClass
  public void beforeClass() {
	  driver=new ChromeDriver();
	  System.setProperty("Webdriver.chrome.driver","driver/chromedriver.exe");
	  driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() {
	  //driver.close();
  }

}
