package com.practice.PakageTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Productname_Price_flipkar {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/clothing-and-accessories/topwear/tshirt/men-tshirt/pr?sid=clo,ash,ank,edy&otracker=categorytree&otracker=nmenu_sub_Men_0_T-Shirts");
		//driver.get("https://www.flipkart.com/fashion-bds2-23-sale-store?fm=neo%2Fmerchandising&iid=M_c07d1564-7e3f-42c3-ae1b-56c0ffc00bf5_1_FBB4FBSRQIC6_MC.CPZ5PBSAJQKR&otracker=hp_rich_navigation_5_1.navigationCard.RICH_NAVIGATION_Fashion_CPZ5PBSAJQKR&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_5_L0_view-all&cid=CPZ5PBSAJQKR");
		List<WebElement> AllProductName = driver.findElements(By.xpath("//div[@class='_2WkVRV']"));		
		System.out.println("total Product in "+AllProductName.size());
		
		/*for(WebElement e: AllProductName)
		{
			System.out.println(e.getText());
		}*/
		
		List<WebElement> AllProductPrice = driver.findElements(By.xpath("//div[@class='_30jeq3']"));
		System.out.println("price of the products are"+AllProductPrice.size());
		/*for(WebElement e: AllProductPrice)
		{
			System.out.println(e.getText());
		}*/
		
		for(int i=0;i<AllProductName.size();i++)
		{
			System.out.println(AllProductName.get(i).getText()+"--------->"+AllProductPrice.get(i).getText());
		}
		
	}

}
