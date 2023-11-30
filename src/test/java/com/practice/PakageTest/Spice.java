package com.practice.PakageTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spice {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=redmi&crid=VT45PAJ17ZN9&sprefix=redmi%2Caps%2C297&ref=nb_sb_noss_1");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> allProductname = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
		List<WebElement> allPrice = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]/ancestor::div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/descendant::span[@class=\"a-price-whole\"]"));
		
		for(int i=0;i<allProductname.size();i++)
		{
			String text = allProductname.get(i).getText();
			String text1 = allPrice.get(i).getText();
			System.out.println(text+"------>"+text1);
		}
	}

}
