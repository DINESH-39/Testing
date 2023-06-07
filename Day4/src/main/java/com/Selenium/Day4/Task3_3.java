package com.Selenium.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task3_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://demo.opencart.com/");
		dr.manage().window().maximize();
		Thread.sleep(5000);
		dr.findElement(By.xpath("//*[@id=\'content\']/h3")).click();
		
	}

}
