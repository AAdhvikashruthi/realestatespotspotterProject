package AdminLoginPage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ObjectRepo.HomeRegisterPage;
import com.ObjectRepo.LoginPage;
import com.ObjectRepo.OwnerHomePage;
import com.ObjectRepo.WelcomePage;
import com.realestatespotpotter.GenericUtilis.BaseClass;
import com.realestatespotpotter.GenericUtilis.ExcelUtils;
import com.realestatespotpotter.GenericUtilis.FileUtils;
import com.realestatespotpotter.GenericUtilis.JavaUtils;
import com.realestatespotpotter.GenericUtilis.WebDriverUtils;

@Listeners(com.realestatespotpotter.GenericUtilis.ListnerImplimentaion.class)
public class G1_HomeRegAdminTest extends BaseClass{
	@Test(retryAnalyzer = com.realestatespotpotter.GenericUtilis.RetryImpclass.class)
public void HomeRegadmin() throws Throwable {
	
	
	
     JavaUtils jLib = new JavaUtils();
	
	 int r=jLib.getRandomNo();
		
	//Launch the browser	
	
	OwnerHomePage ow=new OwnerHomePage(driver);
	HomeRegisterPage hr=new HomeRegisterPage(driver);   
	

	ow.getRegister().click();
	hr.mobileData();
	hr.homeReg(eLib.readMultipleData("HOME", driver), driver, jLib,"email");
		
	
	hr.confirmationMsg();
	
	
	
}
}


