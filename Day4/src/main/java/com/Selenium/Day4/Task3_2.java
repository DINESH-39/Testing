package com.Selenium.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://demo.opencart.com/");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//*[@id=\'search\']/input")).sendKeys("Desktops");
		dr.findElement(By.linkText("Returns")).click();
		dr.navigate().back();
		dr.findElement(By.linkText("Gift Certificates")).click();
		dr.quit();
	}

}
