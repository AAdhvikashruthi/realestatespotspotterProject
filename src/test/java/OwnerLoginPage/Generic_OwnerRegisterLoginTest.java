package OwnerLoginPage;



import java.io.FileInputStream;
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
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ObjectRepo.LoginPage;
import com.ObjectRepo.RegisterPage;
import com.ObjectRepo.WelcomePage;
import com.realestatespotpotter.GenericUtilis.ExcelUtils;
import com.realestatespotpotter.GenericUtilis.FileUtils;
import com.realestatespotpotter.GenericUtilis.JavaUtils;
import com.realestatespotpotter.GenericUtilis.WebDriverUtils;

@Listeners(com.realestatespotpotter.GenericUtilis.ListnerImplimentaion.class)
public class Generic_OwnerRegisterLoginTest {
	@Test
	public static void main(String[] args) throws Throwable {
		
		
		//create object 
		FileUtils fLib= new FileUtils();
		ExcelUtils eLib=new ExcelUtils();
		JavaUtils jLib = new JavaUtils();
		WebDriverUtils wLib = new WebDriverUtils();
				
				
		//	String BROWSER = fLib.readDataFromPropertyFile("browser");
		String URL = fLib.readDataFromPropertyFile("url");
		String USERNAME = fLib.readDataFromPropertyFile("username");
		String PASSWORD = fLib.readDataFromPropertyFile("password");
		
		WebDriver driver=new ChromeDriver();
		wLib.maximizeWindow(driver);
		wLib.waitForImplicit(driver, 5);
		driver.get(URL);
		WelcomePage wp = new WelcomePage(driver);
		wp.register();
		RegisterPage rp=new RegisterPage(driver);

		rp.ownerReg(eLib.readMultipleData("OWNER_REG", driver), driver);
		
		rp.getLogin().click();
		LoginPage lp=new LoginPage(driver);
		
		
		lp.Reg_Login();
		driver.quit();
		
		
		
		
		
		
		
	/*	Properties pObj = new Properties();
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		pObj.load(fi);
		String URL = pObj.getProperty("url");
		
		
		
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		FileInputStream e=new FileInputStream(".\\src\\test\\resources\\SSdata.xlsx");
		Workbook wb = WorkbookFactory.create(e);
		Sheet sh = wb.getSheet("OWNER_REG");
		int rownum=sh.getLastRowNum();
		HashMap<String, String> set = new HashMap<String, String>();
		for(int i=0;i<=rownum;i++)
		{
			String key = sh.getRow(i).getCell(0).getStringCellValue();
			String value = sh.getRow(i).getCell(1).getStringCellValue();
			set.put(key, value);
		}
		for(Entry<String, String> map:set.entrySet())
		{
			driver.findElement(By.xpath(map.getKey())).sendKeys(map.getValue());
		}
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		String con = "Registration successfull. Now you can login";
		WebElement act = driver.findElement(By.xpath("//div[text()='Registration successfull. Now you can login']"));
		String actual = act.getText();
		if(actual.equalsIgnoreCase(con))
		{
			System.out.println("Registration successfull");
		}
		else
		{
			System.out.println("Registration not successfull");
		}
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.name("username")).sendKeys(sh.getRow(3).getCell(1).getStringCellValue());
		driver.findElement(By.name("password")).sendKeys(sh.getRow(4).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();   */
	}

}

