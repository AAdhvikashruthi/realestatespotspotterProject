package com.TestNG;

import org.testng.annotations.Test;

import com.realestatespotpotter.GenericUtilis.BaseClass;

public class Sample extends BaseClass {
	@Test(groups="regression")
	public void sample1()
	{
		System.out.println("sample1 is running");
	}
	@Test(groups={"smoke","regression"})
	public void sample2()
	{
		System.out.println("sample2 is running");
	}
}
