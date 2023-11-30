package com.TestNG;

import org.testng.annotations.Test;

import com.realestatespotpotter.GenericUtilis.BaseClass;

public class Simple extends BaseClass{
	@Test(groups="smoke")
	public void simple1()
	{
		System.out.println("simple1 is running");
	}
	@Test
	public void simple2()
	{
		System.out.println("simple2 is running");
	}
}
