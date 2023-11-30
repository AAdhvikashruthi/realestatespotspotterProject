package com.realestatespotpotter.GenericUtilis;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.ObjectRepo.LoginPage;
import com.ObjectRepo.OwnerHomePage;
import com.ObjectRepo.WelcomePage;
import com.realestatespotpotter.GenericUtilis.DatabaseUtils;
import com.realestatespotpotter.GenericUtilis.ExcelUtils;
import com.realestatespotpotter.GenericUtilis.FileUtils;
import com.realestatespotpotter.GenericUtilis.WebDriverUtils;

public class BaseClass {
	
	public DatabaseUtils dLib = new DatabaseUtils();
	public FileUtils fLib = new FileUtils();
	public ExcelUtils eLib = new ExcelUtils();
	public WebDriverUtils wLib = new WebDriverUtils();
	public WebDriver driver;
	public static WebDriver sdriver;
	
	@BeforeSuite(alwaysRun=true)
	public void config_BS() throws Throwable
	{
		dLib.connectDB();
		System.out.println("db connection ");
	}
	//@Parameters("BROWSER")
	@BeforeClass(alwaysRun=true)
	public void config_BC() throws Throwable
	{
		System.out.println(" --lunching the browser--");
		String BROWSER = fLib.readDataFromPropertyFile("browser");
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			System.out.println("chrome browser exicuting");
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
			System.out.println("edge is running");
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			
		}
		
		else
		{
			System.out.println("---Invalid browser");
		}
		Thread.sleep(15000);
		sdriver = driver;
	}
	@BeforeMethod(alwaysRun=true)
	public void config_BM() throws Throwable
	{
		String URL = fLib.readDataFromPropertyFile("url");
		String USERNAME = fLib.readDataFromPropertyFile("username");
		String PASSWORD = fLib.readDataFromPropertyFile("password");
		
		driver.get(URL);
		WelcomePage lg = new WelcomePage(driver);
		lg.login();
		wLib.waitForPageLoad(driver, 10);
		
		LoginPage Lg = new LoginPage(driver);
		Lg.Login(USERNAME, PASSWORD);
		 System.out.println("Login to the application");
		
		
	}
	@AfterMethod(alwaysRun=true)
	public void config_AM()
	{  
		OwnerHomePage ow = new OwnerHomePage(driver);
		ow.getLogout().click();
		System.out.println("Logout to the application");
	}
	@AfterClass(alwaysRun=true)
	public void config_AC()
	{
		driver.quit();
		System.out.println(" close browser");
	}
	@AfterSuite(alwaysRun=true)
	public void config_AS() throws Throwable
	{
		dLib.disconnectDB();
		System.out.println("close DB connection");
	}

}

