package com.TestNG;

import org.testng.annotations.Test;

public class ExceuteDPTest {
	@Test(dataProviderClass=dataProviderTest.class, dataProvider = "data")
	public void data(String from, String Dest)
	{
		System.out.println("teavelling from"+from+"travelling to"+Dest);
	}

}
