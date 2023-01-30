package testngpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class NewTestselectDemo {
	WebDriver driver;
	
  @Test
  public void Balabharthi() throws InterruptedException {
	driver.get("https://accounts.google.com/signup/");  
	Thread.sleep(2000);
	// new Select(driver.findElement(By.xpath("")))
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\lib\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }

}
