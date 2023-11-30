package com.practice.PakageTest;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon {
	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("iphone");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		/*List<WebElement> products = driver.findElements(By.xpath(
				"//span[@class='a-price-whole']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[@class='a-size-medium a-color-base a-text-normal']"));
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for (int i = 0; i < price.size(); i++) {
			String eachPrice = price.get(i).getText();
			String product = products.get(i).getText();
			String r = eachPrice.replace(",", "");
			int p = Integer.parseInt(r);
			if (p <= 60000) {
				System.out.println(product + "=======" + eachPrice);
			}
		}*/
		List<WebElement> product = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
		List<WebElement> price = driver.findElements(By.xpath("//span[@class=\"a-price-whole\"]"));
		for(int i=0;i<product.size();i++)
		{
			String p = product.get(i).getText();
			String pr = price.get(i).getText();
			String s = pr.replace(",", "");
			int price1 = Integer.parseInt(s);
			if(price1>60000)
			{
			System.out.println(p+"--->"+pr);
		}
		}

	}

}