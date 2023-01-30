package alertboxdemo_pac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class AlertBoxDemo {
	WebDriver driver;
	
  @Test
  public void alert() throws InterruptedException {
	  driver.get("http://www.seleniumlearn.com/how-handle-alert-box-using-selenium");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"node-100\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(5000);
	  driver.switchTo().alert().accept();
	  
	  
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
