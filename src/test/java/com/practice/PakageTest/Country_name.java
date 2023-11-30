package com.practice.PakageTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Country_name {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String countryName = "South Africa";
		List<WebElement> ele = driver.findElements(By.xpath("//table/tbody/tr[*]/td[2]/span[2]"));
		boolean flag = false;
		for(WebElement webele : ele)
		{
			String countryNames = webele.getText();
			
			if(countryNames.equals(countryName))
			{
				System.out.println("is present");
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("not present");
		}
		
	}

}
