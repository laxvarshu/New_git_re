package selenewprojectpac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleFirstDemoClass {
	
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		//System.out.println("hello");
		System.setProperty("webdriver.chrome.drver","C:\\Users\\User\\Documents\\lib\\chromedriver_win32.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//driver.manage().window().minimize();
	   //Thread.sleep(1000);
		//driver.close();//throught automation opened browser closes only one browser
		//driver.quit();//quit used to close multible bowser opened by automation
		driver.get("https:\\www.google.com");//to launch browser
		driver.navigate().to("https:\\facebook.com");//when w are navigate to main primary website to other website we use navigate.to
		//driver.close();
		//driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
	    driver.close();
		
		

	}

}
