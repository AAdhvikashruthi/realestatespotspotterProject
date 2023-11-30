package com.practice.PakageTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Popup_Goibibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		// Enter the url
		driver.get("https://www.goibibo.com/");
		
		// maximize the browser
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
	  driver.findElement(By.xpath("//div[text()='November 2023']/ancestor::div[@role='grid']/descendant::p[text()='24']")).click();
	   driver.findElement(By.xpath("//p[text()=' Click to add a return flight for better discounts']")).click();
		
		
		for(;;)
		{
			try
			{
				driver.findElement(By.xpath("//div[text()='March 2024']/ancestor::div[@role='grid']/descendant::p[text()='16']")).click();
				break;
			}
			catch(Exception e)
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
	driver.findElement(By.xpath("//span[text()='Done']")).click();
		

	}

}
