package com.practice.PakageTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Olympics_Game {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		 List<WebElement> countryName = driver.findElements(By.xpath("//span[@data-cy='country-name']"));
		 System.out.println("countyu names"+countryName.size());
		//drivdr("//span[@class='OcsTextstyles__StyledText-sc-1a1i41u-0 cuettq text--sm-body']")
		// List<WebElement> gold = driver.findElements(By.xpath("(//div[@class='styles__Wrapper-sc-qcc2vw-1 djbnKX'])[2]"));
		 //System.out.println(gold.size());
		 
		 List<WebElement> allMedals = driver.findElements(By.xpath("//span[@class='OcsTextstyles__StyledText-sc-1a1i41u-0 cuettq text--sm-body']"));
		 System.out.println(allMedals.size());
		 
		 for(int i=0;i<countryName.size();i++)
		 {
			 System.out.println(countryName.get(i).getText()+"---->"+allMedals.get(i).getText());
		 }
		 List<WebElement> gold = driver.findElements(By.xpath("(//div[@class='styles__HeaderDesktop-sc-qcc2vw-3 exNpwg'])[2]"));
		 System.out.println(gold.size());
		 
	}

}
