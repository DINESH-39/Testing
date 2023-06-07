package com.Selenium.Day6;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

			WebDriverManager.chromedriver().setup();
			WebDriver dr=new ChromeDriver();
			dr.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
			Thread.sleep(2000);
			dr.findElement(By.xpath("//*[@id=\'input-firstname\']")).sendKeys("Student");
			dr.findElement(By.xpath("//*[@id=\'input-lastname\']")).sendKeys("name");
			dr.findElement(By.xpath("//*[@id=\'input-email\']")).sendKeys("ajmal@gmail.com");
			dr.findElement(By.xpath("//*[@id=\'input-password\']")).sendKeys("ajmal12345");
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) dr;
			js.executeScript("window.scrollBy(0,250)");
			Thread.sleep(2000);
			dr.findElement(By.name("newsletter")).click();
			dr.findElement(By.name("agree")).click();
			dr.findElement(By.xpath("//*[@id=\'form-register\']/div/div/button")).click();
	
	}
}
