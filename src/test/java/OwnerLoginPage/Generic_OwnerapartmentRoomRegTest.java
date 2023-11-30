package OwnerLoginPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ObjectRepo.ApartmentRegisterPage;
import com.ObjectRepo.HomeRegisterPage;
import com.ObjectRepo.LoginPage;
import com.ObjectRepo.OwnerHomePage;
import com.ObjectRepo.WelcomePage;
import com.realestatespotpotter.GenericUtilis.BaseClass;
import com.realestatespotpotter.GenericUtilis.ExcelUtils;
import com.realestatespotpotter.GenericUtilis.FileUtils;
import com.realestatespotpotter.GenericUtilis.WebDriverUtils;

@Listeners(com.realestatespotpotter.GenericUtilis.ListnerImplimentaion.class)
public class Generic_OwnerapartmentRoomRegTest extends BaseClass {
	@Test
	public void OwnerapartmentRoomRegTest() throws Throwable {
		
		//Initial house count
		OwnerHomePage ow=new OwnerHomePage(driver);
		int initalcount = ow.initialRoom();
		ow.getRegister().click();
		
		//Apartment Register
			OwnerHomePage om= new OwnerHomePage(driver)	;
			om.getRegister().click();
			ApartmentRegisterPage ar= new ApartmentRegisterPage(driver);
			ar.ApartmentLink();
				
		eLib.readMultipleData("APARTMENT", driver);
		//Assert.fail();
		ar.UploadImage();
		ar.submitButton();

		//verify the data flow from register to home page
		ow.getHome().click();
		om.checkCount(initalcount);
		/*int finalcount= ow.initialRoom();
		if(initalcount<finalcount)
		{
			System.out.println("registered data is available");
		}
		else
		{
			System.out.println("registered data not is available");
		} */
	}	

}

