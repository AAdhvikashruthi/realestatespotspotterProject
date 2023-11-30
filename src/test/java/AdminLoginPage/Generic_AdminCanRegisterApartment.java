package AdminLoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ObjectRepo.ApartmentRegisterPage;
import com.ObjectRepo.HomeRegisterPage;
import com.ObjectRepo.LoginPage;
import com.ObjectRepo.OwnerDashboardPage;
import com.ObjectRepo.OwnerHomePage;
import com.ObjectRepo.RegisterPage;
import com.ObjectRepo.WelcomePage;
import com.realestatespotpotter.GenericUtilis.BaseClass;
import com.realestatespotpotter.GenericUtilis.ExcelUtils;
import com.realestatespotpotter.GenericUtilis.FileUtils;
import com.realestatespotpotter.GenericUtilis.JavaUtils;
import com.realestatespotpotter.GenericUtilis.WebDriverUtils;
@Listeners(com.realestatespotpotter.GenericUtilis.ListnerImplimentaion.class)
public class Generic_AdminCanRegisterApartment  extends BaseClass{
     @Test(retryAnalyzer = com.realestatespotpotter.GenericUtilis.RetryImpclass.class, groups="smoke")
	public  void AdminCanRegisterApartment() throws Throwable {
		
	
		RegisterPage r = new RegisterPage(driver);
		r.getRegister();
		
		 
		OwnerHomePage ow = new OwnerHomePage(driver);
		ow.getRegister().click();
		//Assert.fail();
		ApartmentRegisterPage ap = new ApartmentRegisterPage(driver);
		ap.ApartmentLink();
		
		
		eLib.readMultipleDataApartment("APARTMENT", driver);
		ap.UploadImage();
		ap.submitButton();
		//HomeRegisterPage hr=new HomeRegisterPage(driver);  
		//hr.confirmationMsg();
		

	}

}
