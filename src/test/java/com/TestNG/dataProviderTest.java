package com.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderTest {
	
	
	@Test(dataProvider = "getData")
	public void getData(String from, String Dest)
	{
		System.out.println("travell from -->"+from+ " travell to ----" +Dest);
	}
	@Test(dataProvider = "data")
	public void data(String from, String Dest)
	{
		System.out.println("travell from -->"+from+ " travell to ----" +Dest);
	}
	@DataProvider
	public Object[][] data()
	{
		Object[][] obj = new Object[2][2];
		
		obj[0][0] ="banglore";
		obj[0][1] = "mysore";
		
		obj[1][0] = "banglore";
		obj[1][1] ="delhi";
		
		
		return obj;
		
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj = new Object[2][2];
		
		obj[0][0] = "mysroe";
		obj[0][1] = "pune";
		
		obj[1][0] = " delhi";
		obj[1][1] = " banglore";
		return obj;
		
		
	}
	

}
