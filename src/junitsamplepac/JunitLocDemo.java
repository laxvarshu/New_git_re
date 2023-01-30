package junitsamplepac;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitLocDemo {
	static WebDriver driver;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\lib\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.close();
		
	}

	@Test
	void Locaters() {
		driver.get("https:\\www.redmine.org");
		driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("lakshmi");
		
	}

}
