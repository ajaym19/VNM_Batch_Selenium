package SynchronizationDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsDemo {

	/*
	 * Waits:
	 * it helps us to achieve synchronization
	 * 2 types
	 * Implicit wait //define once
	 * 	it is applicable to all the elements on the page
	 * 
	 * Explicit Wait
	 * we have to define our own rules and conditions
	 * it is applicable to only one element on which we have applied wait
	 * 
	 * 
	 * PageLoadTimeOut
	 * 
	 * 
	 * Thread.sleep
	 * sleep for 10 seconds
	 * button is visible in 2 seconds
	 * 
	 * Implicit wait
	 * for 10 seconds
	 * button is visible in 2 seconds
	 * 
	 */
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		//applying page load timeout
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement searchBtn = driver.findElement(By.linkText("Search"));
		wait.until(ExpectedConditions.visibilityOf(searchBtn));
		searchBtn.click();
		driver.close();
	}
}
