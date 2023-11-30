package com.TestNG;

import org.testng.annotations.Test;

public class ExcuteDPExcelTest {
	@Test(dataProviderClass=DataProviderExcelTest.class, dataProvider="getData")
	public void getData(String name, String Location) 
	{
     System.out.println(name+"------->"+Location);	
     
	}
	
	@Test(dataProviderClass=DataProviderExcelTest.class, dataProvider = "getData")
	public void executeData(String name, String Location)
	{
		System.out.println(name+"------>"+Location);
	}

}
