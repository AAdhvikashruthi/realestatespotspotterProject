package com.practice.PakageTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProKabbadi {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.prokabaddi.com/standings");
		
		//List<WebElement> points = driver.findElements(By.xpath("//div[@class='Argentina']"));
		//System.out.println(points.size());
		
		List<WebElement> teams = driver.findElements(By.xpath("//div[@class='team-name']"));
		 List<WebElement> points = driver.findElements(By.xpath("//div[@class='table-data matches-play']"));
		 List<WebElement> win = driver.findElements(By.xpath("//div[@class='table-data matches-won']"));
		 List<WebElement> lost = driver.findElements(By.xpath("//div[@class='table-data matches-lost']"));
		 
		 for(int i=0;i<teams.size();i++)
		 {
			 System.out.println(teams.get(i).getText()+"----->"+points.get(i).getText()+"---->"+win.get(i).getText()+"----->"+lost.get(i).getText());
		 }
	}

}
