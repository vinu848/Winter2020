package test1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestJunit {

	WebDriver driver;

	@Before
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://techfios.com/test/billing/?ng=admin/");

	}

	@Test
	public void loginTest() {

		driver.get("http://techfios.com/test/billing/?ng=admin/");

		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");

		driver.findElement(By.id("password")).sendKeys("abc123");

		driver.findElement(By.name("login")).click();

	}

	@After
	public void tearDown() {

		driver.close();
	}
}