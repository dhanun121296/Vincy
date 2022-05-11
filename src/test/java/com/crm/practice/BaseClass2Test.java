package com.crm.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass2Test {
	
	
	@BeforeSuite
	public void send()
	{
		System.out.println("i am before suite");
	}
	@BeforeTest
	public void compose()
	{
		System.out.println("i am before test");
	}
	@BeforeClass
	public void inbox()
	{
		System.out.println("i am before class");
	}
	@BeforeMethod
	public void saveInDraft()
	{
		System.out.println("i am before method");
	}
	@Test
	public void sent1()
	{
		System.out.println("i am before test annotation2");
	}

	@AfterMethod
	public void calender()
	{
		System.out.println("i am after method");
	}
	@AfterClass
	public void draft()
	{
		System.out.println("i am after class");
	}
	@AfterTest
	public void msg()
	{
		System.out.println("i am after test");
	}
	@AfterSuite
	public void draftAndSand()
	{
		System.out.println("i am after suite");
	}
	
}
