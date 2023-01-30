package junitsamplepac;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitAnnoDemo {
	static ChromeDriver driver;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\lib\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.close();
	}
	
	//@Disabled
	@Test
	
	void google() {
		driver.get("https:\\www.google.com");
	}
	
	//@ignore
	
	@Test
	void facebook() {
		driver.get("https:\\www.facebook.com");
	}
	@Test
	void twitter() {
		driver.get("https:\\www.twitter.com");
		
	}

}
