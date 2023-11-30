package com.practice.PakageTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calender_Popup_MakemytripTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions action = new Actions(driver);
		action.doubleClick().perform();
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='November 2023']/ancestor::div[@role='grid']/descendant::p[text()='17']")).click();
		
		

	}

}
