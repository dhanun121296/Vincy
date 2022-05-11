package com.crm.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class NonselectQuery 
{
	@Test
	public void NonselectQuerry() throws Throwable 
	{
		//step-01:load/register the mysql database
		//step-02:connect to the database
		//step-03:create a query statement
		//step-04:insert the data
		//step-05:close the connection
		Connection conn =null;
		int result = 0;
try{
	//step-01:open/launch the appn

		Driver driverreg=new Driver();
		DriverManager.registerDriver(driverreg);
//step-02:give the url,username,password
		conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
//step-03:create a statement and query		
		Statement state = conn.createStatement();
//step-04:insert the data
		 result = state.executeUpdate("insert into students_info values('7', 'iam','gowda', 'mandya');");
		
}catch(Exception e)
{
	System.out.println("handled");
}

finally
{
	if(result==1)
	{
		System.out.println("data inserted successfully");
	}
	else
	{
		System.out.println("data is not inserted");
	}
	conn.close();
	System.out.println("connection closed");
}

}
}
