package test1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Techfios { 
	
	
	
	@Test
	
	public void loginTechfios() throws Exception {
		
	
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("http://techfios.com/test/billing/?ng=login/");
		
		
		
		
		
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
			
		driver.close();
		
		driver.quit();
		
		
		
		
	}
	
	
	

}
