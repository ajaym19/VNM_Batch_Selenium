package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingApplication {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Test Login of FB Application Manually
		 * Steps:
		 * 1. Open Browser
		 * 2. Launch the URL
		 * 3. Enter username
		 * 4. Enter password
		 * 5. Click on Login Button
		 * 6. Close the browser
		 */
		
		//webdriver manager	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement emailTextBox = driver.findElement(By.id("email"));
		emailTextBox.sendKeys("username");
		driver.findElement(By.id("pass")).sendKeys("password");
		//driver.findElement(By.name("login")).click();
		//driver.findElement(By.partialLinkText("password?")).click();
		Thread.sleep(3000);
		
		List<WebElement> urls = driver.findElements(By.tagName("a"));
		System.out.println(urls.size());
		System.out.println(urls.get(0).getText());
		driver.close();
		
		//get all the urls and print the text of each url in console
		//save the text of each url in another list
	}

}
