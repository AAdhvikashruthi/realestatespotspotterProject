package com.databasepractice.pakageTest;
		
		import java.io.FileInputStream;
		import java.io.IOException;
		import java.time.Duration;
		import java.util.HashMap;
		import java.util.Map.Entry;
		import java.util.Properties;
		import java.util.Random;

		import org.apache.poi.ss.usermodel.Sheet;
		import org.apache.poi.ss.usermodel.Workbook;
		import org.apache.poi.ss.usermodel.WorkbookFactory;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;
		import org.openqa.selenium.support.ui.Select;
		public class Admin_can_Register_with_DD_and_img_Test {

		
			public static void main(String[] args) throws IOException, InterruptedException {
				
				
				//get the data from .properties file
				FileInputStream fis = new FileInputStream("C:\\Users\\SHRU\\eclipse-workspace\\com.realestate.spotpotter\\src\\test\\resources\\commondata.properties");
				Properties pObj = new Properties();
				pObj.load(fis);
				String BROWSER = pObj.getProperty("browser");
				String URL = pObj.getProperty("url");
				String USERNAME = pObj.getProperty("username");
				String PASSWORD = pObj.getProperty("password");
						
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
			
				driver.get(URL);
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				
				//login to appln
				driver.findElement(By.xpath("//a[text()='Login']")).click();
				driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(USERNAME);
				driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(PASSWORD);

				driver.findElement(By.xpath("//button[text()='Submit']")).click();
				driver.findElement(By.xpath("//a[text()='Register']")).click();
				
				
				//enter the values in text fields
				
				FileInputStream fi = new FileInputStream("C:\\Users\\SHRU\\eclipse-workspace\\com.realestate.spotpotter\\src\\test\\resources\\SSSdata.xlsx");
				Workbook wb = WorkbookFactory.create(fi);
				Sheet sh = wb.getSheet("HOME");
				int count = sh.getLastRowNum();
				
				HashMap<String, String> map = new HashMap<String, String>();            //empty
				
				for (int i = 0; i <=count; i++) 
				{
					String key = sh.getRow(i).getCell(0).getStringCellValue();
					String value = sh.getRow(i).getCell(1).getStringCellValue();
					map.put(key, value);
				}
				for(Entry<String, String> set : map.entrySet())
				{
					
						driver.findElement(By.xpath(set.getKey())).sendKeys(set.getValue());
					
				}
				
				//handle industry dropdown
			WebElement drop = driver.findElement(By.xpath("//select[@name=\"vacant\"]"));
				
				Select sel = new Select(drop);
				sel.selectByVisibleText("Occupied");
				
				driver.findElement(By.xpath("//h2[text()='Register Room']/ancestor::div[@role=\"alert\"]/descendant::input[@name=\"image\"]")).sendKeys("C:\\Users\\SHRU\\Pictures\\anupama");
				
				Thread.sleep(5000);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			    driver.findElement(By.xpath("//h2[text()='Register Room']/parent::div[@class=\"alert alert-info\"]/descendant::button[text()='Submit']")).click();
			    
			    System.out.println("hi");
			    System.out.println("hello");
				
				
				
			
				
			}
		}
		

	
	

