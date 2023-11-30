package com.ObjectRepo;






import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class OwnerHomePage {
	
	@FindBy(xpath="//a[text()='Logo/Home']")
	private WebElement HomeLogo;
	@FindBy(xpath="//a[@class=\"nav-link\" and @href=\"#\"]")
	private WebElement OwnerProfile;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement Logout;
	@FindBy(xpath="//a[text()='Home']")
	private WebElement Home;
	@FindBy(xpath="//b[text()='Registered Rooms: ']")
	private WebElement RegisteredRoom_link;
	@FindBy(xpath="//b[text()='Registered Rooms: ']/span[@class=\"badge badge-pill badge-success\"]")
	private WebElement RegisteredRoom_Count;
	@FindBy(xpath="//a[text()='Register']")
	private WebElement Register ;
	@FindBy(xpath="//a[text()='Details/Update']")
	private WebElement Updates ;
	
	public OwnerHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getHomeLogo() {
		return HomeLogo;
	}

	public WebElement getOwnerProfile() {
		return OwnerProfile;
	}

	public WebElement getLogout() {
		return Logout;
	}

	public WebElement getHome() {
		return Home;
	}

	public WebElement getRegisteredRoom_link() {
		return RegisteredRoom_link;
	}

	public WebElement getRegisteredRoom_Count() {
		return RegisteredRoom_Count;
	}
	
	
	public WebElement getRegister() {
		return Register;
	}

	public WebElement getUpdates() {
		return Updates;
	}

	public int initialRoom()
	{
		String ini = RegisteredRoom_Count.getText();
		int initialCount = Integer.parseInt(ini);
		return initialCount;
	}
public void checkCount(int initalcount)
	{
		String fi = RegisteredRoom_Count.getText();
		int finalcount = Integer.parseInt(fi);
		Assert.assertNotSame(initalcount, finalcount);
	/*	if(initalcount<finalcount)
		{
			System.out.println("registered data is available");
		}
		else
		{
			System.out.println("registered data not is available");
		}
		Assert.assertEquals(initalcount, finalcount);
	} */
	
}
}
