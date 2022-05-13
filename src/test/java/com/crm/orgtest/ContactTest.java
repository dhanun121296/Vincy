package com.crm.orgtest;

import org.testng.annotations.Test;

public class ContactTest {

	@Test
	public void createContactTest()
	{
		//start
		System.out.println("contact created");
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.println(BROWSER);
		System.out.println(URL);
		
	}
}
