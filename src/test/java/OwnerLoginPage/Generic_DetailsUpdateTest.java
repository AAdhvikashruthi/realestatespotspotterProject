package OwnerLoginPage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
public class Generic_DetailsUpdateTest  extends BaseClass{
	@Test(groups = "smoke")
	public  void DetailsUpdateTest() throws Throwable {
		
		
		JavaUtils jLib = new JavaUtils();
		
		int r=jLib.getRandomNo();
			
		
		
		//Initial house count
		OwnerHomePage ow=new OwnerHomePage(driver);
		int initalcount = ow.initialRoom();
		ow.getRegister().click();   
		
		//Home Register
		HomeRegisterPage hr=new HomeRegisterPage(driver);   
		
		
		ow.getRegister().click();
		hr.mobileData();
		hr.homeReg(eLib.readMultipleData("HOME", driver), driver, jLib,"email");
		//Assert.fail();
		
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
	
	
/*	//verify data flow in details module
	  driver.findElement(By.xpath("//a[text()='Details/Update']")).click();
	  List<WebElement> res = driver.findElements(By.xpath("//b[text()='Mobile Number: ']/parent::p"));
	  for(int i=0; i<res.size();i++)
		{
			String mob = res.get(i).getText();
			if(mob.contains(mobile))
			{
				System.out.println("The data is present");
				break;
			}
			else
			{
				System.out.print("");
			}
			} */
		}
}

