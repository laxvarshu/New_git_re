package alertboxdemo_pac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class AlertBox_wthMsg {
	WebDriver driver;
	
  @Test
  public void alertboxwithmsg() throws InterruptedException {
	  driver.get("http://www.seleniumlearn.com/prompt-dialog-box");
	  driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
		Thread.sleep(5000);
	      Alert alt;
	      alt=driver.switchTo().alert();
	      alt.sendKeys("laxmi");
	      
	      
		
		
		/*Alert alt = driver.switchTo().alert();
		alt.sendKeys("lax");
		alt.accept();*/
  }
  @BeforeClass
  public void beforeClass() {
	  driver=new ChromeDriver();
	  System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	  driver.manage().window().maximize();
	  	  
  }

  @AfterClass
  public void afterClass() {
  }

}
