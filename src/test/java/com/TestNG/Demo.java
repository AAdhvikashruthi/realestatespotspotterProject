package com.TestNG;

import org.testng.annotations.Test;

import com.realestatespotpotter.GenericUtilis.BaseClass;

public class Demo extends BaseClass{
	@Test
	public void demo1()
	{
		System.out.println("demo1 is running");
	}
	@Test(groups="regression")
	public void demo2()
	{
		System.out.println("demo2 is running");
	}

}
