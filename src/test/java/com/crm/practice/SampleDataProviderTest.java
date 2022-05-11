package com.crm.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleDataProviderTest 
{
	@Test(dataProvider="getdata")
	public void SampleDataTest(String product,String name, String model, int price )
	{
		System.out.println(product+" "+name+" "+" "+model+" "+" "+price);
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[3][4];
		data[0][0]="mobiles";
		data[0][1]="iphone";
		data[0][2]="13pro";
		data[0][3]=10000;
		
		data[1][0]="mobiles";
		data[1][1]="samsung";
		data[1][2]="j6";
		data[1][3]=12000;
		
		data[2][0]="mobiles";
		data[2][1]="nokia";
		data[2][2]="1100";
		data[2][3]=8000;
		return data;
	}

}
