package com.crm.practice;

import org.testng.annotations.Test;

public class TestClass4Test 
{
	/*In order to skip the testcase we use enabled=false*/
	@Test
	public void send1()
	{
		System.out.println("i am test1");
	}
	
	@Test(enabled=false)
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
