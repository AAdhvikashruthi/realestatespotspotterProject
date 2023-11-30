package com.databasepractice.pakageTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Owner_registerAndLogin_Test {

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
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		FileInputStream fi = new FileInputStream("C:\\Users\\SHRU\\eclipse-workspace\\com.realestate.spotpotter\\src\\test\\resources\\SSSdata.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet("Owner");
		HashMap<String, String> hp = new HashMap<String, String>();
		int count = sh.getLastRowNum();
		for(int i=0;i<=count;i++)
		{
			String key = sh.getRow(i).getCell(0).getStringCellValue();
			String value = sh.getRow(i).getCell(1).getStringCellValue();
			hp.put(key, value);
			
		}
		for(Entry<String, String> set:hp.entrySet())
		{
			driver.findElement(By.xpath(set.getKey())).sendKeys(set.getValue());
		}
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		/*WebElement Exp = driver.findElement(By.xpath("//h2[text()='Register']/ancestor::div[@role=\"alert\"]/descendant::div[text()='Registration successfull. Now you can login']"));
	    String data = Exp.getText();
	    String res = "Registration successfull. Now you can login";
	    if(data.equalsIgnoreCase(res))
	    {
	    	System.out.println("registration succesfull");
	    }
	    else
	    {
	    	System.out.println("regisstration is not successfull");
	    }*/
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.name("username")).sendKeys(sh.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.name("password")).sendKeys(sh.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	

}
