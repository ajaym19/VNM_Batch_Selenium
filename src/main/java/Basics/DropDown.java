package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://jsbin.com/osebed/2");
		//driver.findElement(By.xpath("//option[@value='apple']")).click();
		 WebElement dropdown = driver.findElement(By.id("fruits"));
		 Select select = new Select(dropdown);
		 select.selectByValue("orange");
		 select.selectByVisibleText("Grape");
		 Thread.sleep(3000);
		 driver.quit();
	}
}
