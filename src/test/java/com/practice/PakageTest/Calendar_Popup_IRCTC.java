package com.practice.PakageTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_Popup_IRCTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		 driver.get("https://www.irctc.co.in/nget/train-search");
		 
		 driver.findElement(By.xpath("//span[@class='ng-tns-c58-10 ui-calendar']/input")).click();
		 
		 driver.findElement(By.xpath("//div[@class=\"ng-trigger ng-trigger-overlayAnimation ng-tns-c58-10 ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all ui-shadow ng-star-inserted\"]/descendant::a[text()='16']")).click();
		 
	}

}
////a[@draggable='false' and @class='ui-state-default ng-tns-c58-10 ng-star-inserted']