package com.crm.practice;

import org.testng.annotations.Test;

public class TestClass2Test
{
	/*priority starts from zero*/
	@Test (priority=1)
	public void send1()
	{
		System.out.println("i am test1");
	}
	
	@Test
	public void send2()
	{
		System.out.println("i am test2");
	}
	
	@Test(priority=2)
	public void send3()
	{
		System.out.println("i am test3");
	}

}
