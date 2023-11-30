package com.databasepractice.pakageTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WritingDataToPropertiesFileTest {

	public static void main(String[] args) throws IOException {
		
		Properties pObj = new Properties();
		pObj.setProperty("browser", "chrome");
		pObj.setProperty("url","http://rmgtestingserver/domain/House_Rental_Application/");
		pObj.setProperty("username", "admin");
		pObj.setProperty("password", "admin");
		
		//create obj for FileOutStream
		
		FileOutputStream fout = new FileOutputStream("C:\\Users\\SHRU\\eclipse-workspace\\com.realestate.spotpotter\\src\\test\\resources\\commondata.properties");
		pObj.store(fout, "write data");
		
		FileInputStream fin = new FileInputStream("C:\\Users\\SHRU\\eclipse-workspace\\com.realestate.spotpotter\\src\\test\\resources\\commondata.properties");
		
		pObj.load(fin);
		
		String BROWSER = pObj.getProperty("browser");
		String URL = pObj.getProperty("url");
		String USERNAME = pObj.getProperty("username");
		String PASSWORD = pObj.getProperty("password");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get(URL);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.name("username")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		
		
		

	}

}
