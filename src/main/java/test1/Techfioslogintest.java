package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Techfioslogintest {
	
	static WebDriver driver;


	public static void main(String[] args) {
		
		launchBrowser();
		loginTest();
		tearDown();
		
	}	
		public static void launchBrowser() {
			
			
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
			driver = new ChromeDriver();
			
			
			driver.manage().window().maximize();
			
			driver.get("http://techfios.com/test/billing/?ng=admin/");
			
		}	
			
			
			public static void loginTest() {
			
			driver.get("http://techfios.com/test/billing/?ng=admin/");
			
			driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
			
			driver.findElement(By.id("password")).sendKeys("abc123");
			
			driver.findElement(By.name("login")).click();
	
			
	
	}
			
		public static void tearDown() {	
			
			driver.close();
			
		}
}
