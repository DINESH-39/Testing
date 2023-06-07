package com.Selenium.Day6;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task3 {

	public static void main(String[] args) throws InterruptedException 
	{
		
			WebDriverManager.chromedriver().setup();
			WebDriver dr = new ChromeDriver();
			dr.manage().window().maximize();
			dr.get("https://demo.wpeverest.com/user-registration/paypal-integration-form/");
			dr.findElement(By.name("user_email")).sendKeys("ajmal@gmail.com");
			dr.findElement(By.name("user_pass")).sendKeys("password");			
			WebElement checkBoxElement = dr.findElement(By.cssSelector("#multiple_choice_1641271687_CPU\\ i5\\ 8th\\ Gen"));
			boolean isSelected = checkBoxElement.isSelected();	
			if(isSelected == false) 
			{
				checkBoxElement.click();		
			}
			WebElement checkBoxElement1 = dr.findElement(By.cssSelector("#multiple_choice_1641271687_Mouse"));
			boolean isSelected1 = checkBoxElement1.isSelected();			
			if(isSelected1 == false) 
			{
				checkBoxElement1.click();
			}
			WebElement checkBoxElement2 = dr.findElement(By.cssSelector("#multiple_choice_1641271687_Keyboard"));
			boolean isSelected2 = checkBoxElement2.isSelected();
			if(isSelected2 == false) 
			{
				checkBoxElement2.click();
			}
			WebElement checkBoxElement3 = dr.findElement(By.cssSelector("#multiple_choice_1641271687_Scanner"));
			boolean isSelected3 = checkBoxElement3.isSelected();
			if(isSelected3 == false) 
			{
				checkBoxElement3.click();
			}
			Thread.sleep(5000);
			dr.quit();			
		}
}
