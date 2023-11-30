package com.practice.PakageTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[text()='round trip']")).click();
		driver.findElement(By.xpath("//div[text()='From']")).click();
		driver.findElement(By.xpath("//div[text()='India']")).click();
		driver.findElement(By.xpath("//div[text()='Agartala']"));
		
		driver.findElement(By.xpath("//div[text()='To']")).click();
		driver.findElement(By.xpath("//div[text()='India']")).click();
		driver.findElement(By.xpath("//div[text()='Jaipur']")).click();
		
		driver.findElement(By.xpath("//div[@data-testid='undefined-month-November-2023']/descendant::div[text()='25']")).click();
		driver.findElement(By.xpath("//div[@data-testid='undefined-month-December-2023']/descendant::div[text()='29']")).click();
		driver.findElement(By.xpath("//div[text()='Passengers']")).click();
		driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		driver.findElement(By.xpath("//div[@data-testid=\"home-page-travellers-done-cta\"]")).click();
		driver.findElement(By.xpath("//div[text()='Currency']")).click();
		driver.findElement(By.xpath("//div[text()='EUR']")).click();
		//driver.findElement(By.xpath("//div[text()='Family & Friends']")).click();
		driver.findElement(By.xpath("//div[text()='Students']")).click();
		driver.findElement(By.xpath("//div[@data-testid=\"home-page-flight-cta\"]")).click();
		

	}

}


