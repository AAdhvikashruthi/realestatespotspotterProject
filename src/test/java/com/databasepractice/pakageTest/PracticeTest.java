package com.databasepractice.pakageTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeTest {
	@Test
	public static void createCustomer()
	{
		//System.out.println("The customer has created");
		Reporter.log("the customer ", true);
	}
	@Test
	public static void modifyCustomer()
	{
		Reporter.log("The customer has Updates",true);
	}

}
