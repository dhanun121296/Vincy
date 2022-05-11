package com.crm.practice;

import org.testng.annotations.Test;

public class TestClass5Test 
{
	/*In order to mention the dependency we use dependsOnMethods*/
	@Test(dependsOnMethods="sent",priority=0)
	public void trash()
	{
		System.out.println("pass");
		int[] arr= {1,2,3};
        System.out.println(arr[4]);		
	}
	@Test(dependsOnMethods="compose",priority=1)
	public void sent()
	{
		System.out.println("i am test2");
	}
	
	@Test(priority=2)
	public void compose()
	{
		System.out.println("i am test3");
	}


}
