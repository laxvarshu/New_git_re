package junitsamplepac;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Junittestcasedemo {
static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\lib\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com");
		//driver.get("https:\\www.google.com");
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.close();
	}
	@Test
	void test1() {
		driver.get("https://www.google.com");
	}
	@Test
	void test2() {
		driver.get("https://www.facebook.com");
	}
	@Test
	void test3() {
		driver.get("https://www.flipkart.com");
	}

}
