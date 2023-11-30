package com.practice.PakageTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Popup_Ksrtc {

	public static void main(String[] args) {
	
		//Open the browser
		
		WebDriver driver = new ChromeDriver();
		
		//Enter the url
		 
		driver.get("https://www.ksrtc.in/oprs-web/");
		
		// Maximize the window
		
		driver.manage().window().maximize();
		
		// PageLoad wait
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		
		// select the depature date 
		driver.findElement(By.id("txtJourneyDate")).click();
		
		//select date
		
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/descendant::a[text()='9']")).click();
		
		

	}

}
