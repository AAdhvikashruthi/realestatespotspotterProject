package com.TestNG;

import org.testng.annotations.Test;

import com.realestatespotpotter.GenericUtilis.BaseClass;

public class Practice extends BaseClass {
	@Test(groups="smoke")
	public void practice1()
	{
		System.out.println("practice2 is running");
	}
	@Test
	public void practice2()
	{
		System.out.println("practice2 is running");
	}

}
