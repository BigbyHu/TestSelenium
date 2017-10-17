package org.selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriverdemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.bin", "E:\\Mozilla Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "E:\\Mozilla Firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// Puts a Implicit wait, Will wait for 10 seconds before throwing
		// exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().to("http://localhost:8081/TestSelenium/");
		driver.findElement(By.id("first")).sendKeys("34");
		driver.findElement(By.id("last")).sendKeys("78");
		driver.findElement(By.id("button")).click();
		// String result = driver.findElement(By.id("last")).getText();
		WebElement element = driver.findElement(By.id("all"));
		String result = element.getAttribute("value");
		
		// Launch website
		// driver.navigate().to("http://www.calculator.net/");

		// Maximize the browser
		/*
		 * driver.manage().window().maximize();
		 * 
		 * 
		 * // Click on Math Calculators
		 * driver.findElement(By.xpath(".//*[@id='menu']/div[3]/a")).click();
		 * 
		 * // Click on Percent Calculators
		 * driver.findElement(By.xpath(".//*[@id='menu']/div[4]/div[3]/a")).
		 * click();
		 * 
		 * // Enter value 10 in the first number of the percent Calculator
		 * driver.findElement(By.id("cpar1")).sendKeys("10");
		 * 
		 * // Enter value 50 in the second number of the percent Calculator
		 * driver.findElement(By.id("cpar2")).sendKeys("50");
		 * 
		 * // Click Calculate Button driver.findElement(By.xpath(
		 * ".//*[@id='content']/table/tbody/tr/td[2]/input")).click();
		 * 
		 * // Get the Result Text based on its xpath String result =
		 * driver.findElement(By.xpath(".//*[@id='content']/p[2]/span/font/b")).
		 * getText();
		 */

		// Print a Log In message to the screen
		System.out.println(" The Result is " + result);

		// Close the Browser.
		driver.close();
	}
}
