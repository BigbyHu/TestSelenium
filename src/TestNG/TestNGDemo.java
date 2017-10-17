package TestNG;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {

	/*@BeforeTest
	public void beforeng() {

	}*/

	@Test
	public void middleng() {
		
		//火狐浏览器
		/*System.setProperty("webdriver.firefox.bin", "E:\\Mozilla Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "E:\\eclipseWorkSpace\\TestSelenium\\driver\\geckodriver.exe");*/
		
		//Chrome
		//System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		
		//谷歌Driver
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://localhost:8081/TestSelenium/");
		//火狐Driver
		/*WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://localhost:8081/TestSelenium/");*/
		driver.findElement(By.id("first")).sendKeys("345");
		driver.findElement(By.id("last")).sendKeys("678");
		driver.findElement(By.id("button")).click();
		WebElement element = driver.findElement(By.id("all"));
		String result = element.getAttribute("value");
		System.out.println(" The Result is " + result);
		driver.close();

	}

/*	@AfterTest
	public void afterng() {
	}*/
}