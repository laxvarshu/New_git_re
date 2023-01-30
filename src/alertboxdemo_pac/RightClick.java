package alertboxdemo_pac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class RightClick {
	WebDriver driver;
	
  @Test
  public void alert() throws InterruptedException {
	  driver.get("http://seleniumlearn.com/");
		Thread.sleep(5000);
	
		Actions act = new Actions(driver);

		act.contextClick(driver.findElement(By.xpath("//*[@id=\"menu-387-1\"]/a"))).build().perform();
		
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
