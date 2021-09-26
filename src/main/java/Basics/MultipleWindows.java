package Basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		System.out.println("Parent Window title is " + driver.getTitle());
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		driver.findElement(By.id("button1")).click();
		Set<String> windows =  driver.getWindowHandles();
		System.out.println("Printing all the window handles");
		for (String string : windows) {
			System.out.println(string);
		}
		
		Iterator<String> it = windows.iterator();
		it.next();
		String childWindow = it.next();
		
		driver.switchTo().window(childWindow);
		//Selenium Framework | Selenium, Cucumber, Ruby, Java et al.
		System.out.println("Child window title is " +driver.getTitle());
		driver.close(); //this will only close the current window pointed by driver
		driver.quit(); //this will close all the windows
	}
}
