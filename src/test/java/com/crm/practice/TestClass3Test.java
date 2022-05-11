package com.crm.practice;

import org.testng.annotations.Test;

public class TestClass3Test 
{
	@Test
	public void send1()
	{
		System.out.println("i am test1");
	}
	
	@Test(invocationCount=2)
	public void send2()
	{
		System.out.println("i am test2");
	}
	
	@Test
	public void send3()
	{
		System.out.println("i am test3");
	}

}
