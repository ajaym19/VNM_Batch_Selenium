package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		WebElement e=driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[1]/div[2]/button"));
		e.click();
		Thread.sleep(3000);
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for Prompt Box']")).click();
		driver.switchTo().alert().sendKeys("Ajay");
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();
	}
}
