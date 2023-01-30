package testngpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class TestNGDemo {
	WebDriver driver;

	//loading web app
	//signin click
	//creating own account
	//choose u r loc
	
  /*@Test
  public void amazon() throws InterruptedException {
	  driver.get("https:\\www.amazon.com");                                                        //loading web app amazon
	  driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).click();              //click sign in
	  
	  driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("laxmivarshu@gamil.com");     //enter email in text box
	  driver.navigate().back();                                                                     //back navigate command
	  driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span")).click();                    //click language
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[3]/div/label/span/span/span[1]")).click();//change language
	 
	 // driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")).click();
	// new Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"))).selectByVisibleText("Amazon Devices");
	 
	  //click dropdown and select 
	   
  }*/
  
 /* @Test
  public void byjus() throws InterruptedException {
	  driver.get("https:\\learn.byjus.com");
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/a/span[1]")).click();
	// new Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"))).selectByVisibleText("Amazon Devices");
	 driver.findElement(By.xpath("//*[@id=\"form\"]/span/span[1]/span/span[2]")).click();
	 driver.findElement(By.xpath("//*[@id=\"enterNumber\"]")).sendKeys("9885072399");
	 driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[1]/div[3]/button")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//*[@id=\"enterPassNumber\"]")).getAttribute("");
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//*[@id=\"mobile-login-form\"]/div/button")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[1]/div/a")).click();
	 
  }*/
	
	 @Test
		  public void hotstar() throws InterruptedException {
		 driver.get("https:\\www.hotstar.com");
		 Thread.sleep(1000);
		  
	  }
   
  
  @BeforeTest
  public void beforeTest() {
	 driver=new ChromeDriver();
	 System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
	 driver.manage().window().maximize();
	 
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
  }

}
