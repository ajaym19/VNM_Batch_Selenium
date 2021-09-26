package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFunctions {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * get - launch a new browser and opens a URL
		 * getCurrentUrl
		 * getpagesource
		 * 
		 * get windowhandle
		 * getwindowhandles
		 * 
		 * drop down
		 * Handling Frames
		 * 
		 * close 
		 * quit
		 * findelement
		 * findelements
		 * 
		 * 
		 * 
		 *  find Element
		 *  find Elements
		 *  
		 *  
		 *  
		 *  Navigation
		 *  
		 *  later:
		 * 
		 * isdisplayed: if the element is displayed , return true
		 * isEnabled: element is displayed and is enabled, retrun true
		 * isselected:
		 * 
		 * Wait/Synchronization
		 *  PageLoadTimeout
		 *  Implict Wait
		 *  Explicit Wait
		 *  
		 * 
		 */
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		String expectedTitle = "Google India";
		String actualTitle = driver.getTitle();
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case failed");
		}
		
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();
	}
}
