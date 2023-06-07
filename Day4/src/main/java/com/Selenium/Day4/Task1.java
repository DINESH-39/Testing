package com.Selenium.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		dr.manage().window().maximize();
		dr.findElement(By.id("input-firstname")).sendKeys("BhakthaPriyan");
		dr.findElement(By.id("input-lastname")).sendKeys("M");
		dr.findElement(By.id("input-email")).sendKeys("bhaktha12@gmail.com");
		dr.findElement(By.id("input-password")).sendKeys("abc123");
		dr.findElement(By.xpath("//*[@id=\'form-register\']/fieldset[3]/div/div/div[2]/label")).click();
		Thread.sleep(5000);
		dr.quit();
	}

}
