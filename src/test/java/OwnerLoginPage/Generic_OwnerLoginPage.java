package OwnerLoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ObjectRepo.LoginPage;
import com.ObjectRepo.WelcomePage;
import com.realestatespotpotter.GenericUtilis.ExcelUtils;
import com.realestatespotpotter.GenericUtilis.FileUtils;
import com.realestatespotpotter.GenericUtilis.JavaUtils;
import com.realestatespotpotter.GenericUtilis.WebDriverUtils;

public class Generic_OwnerLoginPage {
	public static void main(String[] args) throws Throwable {
		
	
	
	//create object 
			FileUtils fLib= new FileUtils();
			ExcelUtils eLib=new ExcelUtils();
			JavaUtils jLib = new JavaUtils();
			WebDriverUtils wLib = new WebDriverUtils();
				
			String URL = fLib.readDataFromPropertyFile("url");
			String USERNAME = fLib.readDataFromPropertyFile("username");
			String PASSWORD = fLib.readDataFromPropertyFile("password");
			
			WebDriver driver = new ChromeDriver();
			wLib.waitForImplicit(driver, 10);
			driver.get(URL);
			
			WelcomePage wp = new WelcomePage(driver);
			wp.login();
		    
			LoginPage lp = new LoginPage(driver);
			lp.Login(USERNAME, PASSWORD);
			
			//lp.getSubmit();
            
			
}
}