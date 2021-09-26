package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/iframe");
		
		List<WebElement> noOfFrames =  driver.findElements(By.tagName("iframe"));
		System.out.println(noOfFrames.size());
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id='tinymce']/p")).clear();
		driver.findElement(By.xpath("//*[@id='tinymce']/p")).sendKeys("Ajay");
		Thread.sleep(4000);
		
		//how to switch back to parent frame
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		
		driver.close();
	}
}
