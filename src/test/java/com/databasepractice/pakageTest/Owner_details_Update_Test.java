package com.databasepractice.pakageTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Owner_details_Update_Test {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("C:\\Users\\SHRU\\eclipse-workspace\\com.realestate.spotpotter\\src\\test\\resources\\commondata.properties");
		Properties p = new Properties();
		p.load(fin);
		String BROWSER = p.getProperty("browser");
		String URL = p.getProperty("url");
		String USERNAME = p.getProperty("username");
		String PASSWORD=p.getProperty("password");
		
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		driver.findElement(By.xpath("//a[text()='Details/Update']")).click();
		
		//List<WebElement> data = driver.findElements(By.xpath("//h2[text()='List of Apartment Details']/ancestor::div[@class=\"col-12\"]/descendant::b[text()='Email: ']"));
		List<WebElement> data = driver.findElements(By.xpath("//b[text()='Mobile Number: ']/parent::p"));
		for(int i=0;i<data.size();i++)
		{
			String s ="7418991170";
			String mobileno = data.get(i).getText();
			//System.out.println(mobileno);
			if(mobileno.contains(s))
			{
				System.out.println("pass");
				break;
			}
			
			
		}
		
		
	}

}
