package AdminLoginPage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ObjectRepo.HomeRegisterPage;
import com.ObjectRepo.LoginPage;
import com.ObjectRepo.OwnerHomePage;
import com.ObjectRepo.WelcomePage;
import com.realestatespotpotter.GenericUtilis.ExcelUtils;
import com.realestatespotpotter.GenericUtilis.FileUtils;
import com.realestatespotpotter.GenericUtilis.JavaUtils;
import com.realestatespotpotter.GenericUtilis.WebDriverUtils;


public class G_HomeRegAdminTest {
public static void main(String[] args) throws Throwable {
	//create object 
	FileUtils fLib= new FileUtils();
	ExcelUtils eLib=new ExcelUtils();
	JavaUtils jLib = new JavaUtils();
	WebDriverUtils wLib = new WebDriverUtils();
	
	
//	String BROWSER = fLib.readDataFromPropertyFile("browser");
	String URL = fLib.readDataFromPropertyFile("url");
	String USERNAME = fLib.readDataFromPropertyFile("adminname");
	String PASSWORD = fLib.readDataFromPropertyFile("adminpassword");
	
	int r=jLib.getRandomNo();
		
	//Launch the browser	
	WebDriver driver= new ChromeDriver();
	wLib.maximizeWindow(driver);
	wLib.waitForImplicit(driver, 5);
	
	driver.get(URL);
	WelcomePage wp=new WelcomePage(driver);
	wp.login();
	//login
	
	LoginPage lp=new LoginPage(driver);
	lp.Login(USERNAME, PASSWORD);
	
	OwnerHomePage ow=new OwnerHomePage(driver);
	HomeRegisterPage hr=new HomeRegisterPage(driver);   
	
	
	ow.getRegister().click();
	hr.mobileData();
	hr.homeReg(eLib.readMultipleData("HOME", driver), driver, jLib,"email");
		
	
	hr.confirmationMsg();
	
	
	
}
}

