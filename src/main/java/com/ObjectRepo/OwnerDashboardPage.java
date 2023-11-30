package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OwnerDashboardPage {
	@FindBy(xpath="//a[text()='Logo/Home']")
	private WebElement logoLink;
	
	@FindBy(xpath="//a[@class=\"nav-link\" and @href=\"#\"]")
	private WebElement ownerprofileLink;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement LogoutLink;

	@FindBy(xpath="//a[text()='Home']")
	private WebElement HomeLink;

	@FindBy(xpath="//b[text()='Registered Rooms: ']")
	private WebElement registerdRoomLink;

	@FindBy(xpath="//b[text()='Registered Rooms: ']/span[@class=\"badge badge-pill badge-success\"]")
	private WebElement RegisterdRoomCount;

	@FindBy(xpath="//a[text()='Register']")
	private WebElement RegisterLink;

	@FindBy(xpath="//a[text()='Details/Update']")
	private WebElement deatilsAndUpdateLink;
	
	public OwnerDashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
