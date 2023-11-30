package com.practice.PakageTest;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class All_countryname {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
	}

}
