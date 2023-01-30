package alertboxdemo_pac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class AlartCancelOkButton {
	WebDriver driver;
	
  @Test
  public void alert_ok_cancel_buttondemo() throws InterruptedException {
	  driver.get("http://www.seleniumlearn.com/confirmation-dialog-box");
	  driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
	  Thread.sleep(2000);
	  driver.switchTo().alert().dismiss();
	  
	  }
  @BeforeClass
  public void beforeClass() {
	  driver=new ChromeDriver();
	  System.setProperty("driver.chromedriver.driver","driver/chromedriver.exe ");
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
  }

}
