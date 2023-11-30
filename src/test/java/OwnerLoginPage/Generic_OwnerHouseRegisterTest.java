package OwnerLoginPage;


import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

import junit.framework.Assert;

@Listeners(com.realestatespotpotter.GenericUtilis.ListnerImplimentaion.class)
public class Generic_OwnerHouseRegisterTest extends BaseClass {
	
	@Test
	public void OwnerHouseRegisterTest() throws Throwable {
		JavaUtils jLib = new JavaUtils();
		int r=jLib.getRandomNo();
			
		
		
		//Initial house count
		OwnerHomePage ow=new OwnerHomePage(driver);
		int initalcount = ow.initialRoom();
		ow.getRegister().click();   
		
		//Home Register
		HomeRegisterPage hr=new HomeRegisterPage(driver);   
		
	//	Assert.fail();
		ow.getRegister().click();
		hr.mobileData();
		hr.homeReg(eLib.readMultipleData("HOME", driver), driver, jLib,"email");
		//eLib.readMultipleData("HOME", driver);		
		
		hr.confirmationMsg();
		
		
        ow.getHome().click();
		int finalcount=ow.initialRoom();
		if(initalcount<finalcount)
		{
			System.out.println("registered data is available");
		}
		else
		{
			System.out.println("registered data is available");
		}  
	}

}

