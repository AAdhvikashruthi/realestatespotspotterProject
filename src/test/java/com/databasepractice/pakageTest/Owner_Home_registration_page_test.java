package com.databasepractice.pakageTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Owner_Home_registration_page_test {
	
		public static void main(String[] args) throws IOException {
			FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
			Properties pObj=new Properties();
			pObj.load(fis);
			String BROWSER=pObj.getProperty("browser");
			String URL = pObj.getProperty("url");
			String USERNAME = pObj.getProperty("username");
			String PASSWORD = pObj.getProperty("password");
			
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(URL);
			
			driver.findElement(By.xpath("//a[text()='Login']")).click();
			driver.findElement(By.name("username")).sendKeys(USERNAME);
			driver.findElement(By.name("password")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			
			WebElement iniCount = driver.findElement(By.xpath("//b[text()='Registered Rooms: ']/span[@class=\"badge badge-pill badge-success\"]"));
			String regcount = iniCount.getText();
			int initialcount=Integer.parseInt(regcount);
			
			
			driver.findElement(By.xpath("//a[text()='Register']")).click();
			driver.findElement(By.xpath("//a[text()='Individual Home Registration']")).click();
			
			FileInputStream fi=new FileInputStream("C:\\Users\\SHRU\\eclipse-workspace\\com.realestate.spotpotter\\src\\test\\resources\\SSSdata.xlsx");
			Workbook wb = WorkbookFactory.create(fi);
			org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("HOME");
			int rowcount = sh.getLastRowNum();
			HashMap<String, String> map = new HashMap<String, String>();
			for(int i=0;i<=rowcount;i++)
			{
			     String key = sh.getRow(i).getCell(0).getStringCellValue();
			     String value = sh.getRow(i).getCell(1).getStringCellValue();
			     map.put(key, value);
			}
			for(Entry<String, String> set:map.entrySet())
			{
				driver.findElement(By.xpath(set.getKey())).sendKeys(set.getValue());
			}
			
			WebElement drop = driver.findElement(By.xpath("//select[@name='vacant']"));
			Select sel = new Select(drop);
			sel.selectByVisibleText("Vacant");
			
			WebElement img = driver.findElement(By.xpath("//h2[text()='Register Room']/parent::div[@class=\"alert alert-info\"]/descendant::input[@name=\"image\"]"));
			img.sendKeys("C:\\Users\\SHRU\\Pictures\\anupama");
		  driver.findElement(By.xpath("//h2[text()='Register Room']/parent::div[@class=\"alert alert-info\"]/descendant::button[text()='Submit']")).click();
			
			WebElement con = driver.findElement(By.xpath("//h2[text()='Register Room']/parent::div[@class=\"alert alert-info\"]/descendant::div[text()='Registration successfull. Thank you']"));
			String msg = con.getText();	
			System.out.println(msg);
			String actText = "Registration successfull. Thank you";
			if(msg.equalsIgnoreCase(actText))
			{
				System.out.println("Succeefull");
			}
			else
			{
				System.out.println(" not Succeefull");
			}
			
			driver.findElement(By.xpath("//a[text()='Home']")).click();
			
			WebElement finalCount = driver.findElement(By.xpath("//b[text()='Registered Rooms: ']/span[@class=\"badge badge-pill badge-success\"]"));
			String registeredcount = finalCount.getText();
			int finalcount=Integer.parseInt(registeredcount);
		
			if(initialcount<finalcount)
			{
				System.out.println("registered data is available");
			}
			else
			{
				System.out.println("registered data is available");
			}
		}
		}


