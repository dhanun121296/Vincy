package com.crm.practice;

import java.sql.ResultSet;

import org.testng.annotations.Test;

import com.crm.skimoon.genericUtility.DatabaseUtility;

public class SelectQuery
{
	@Test
	public void SelectQuerry() throws Throwable 
	{
		DatabaseUtility dlib=new DatabaseUtility();
		
		//step-01:load/register the mysql database
		//step-02:connect to the database
		//step-03:create a query statement
		//step-04:execute the query
		//step-05:close the connection
		
try{
	//step-01:open/launch the appn
        dlib.getConnectionToDatabase();
		/*
		 * Driver driverreg=new Driver(); DriverManager.registerDriver(driverreg);
		 * //step-02:give the url,username,password conn=
		 * DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root",
		 * "root");
		 */
        //step-03:create a statement and query	
        
       // dlib.excecuteQueryAndVerify("select * from students_info", 2, "ram");
        ResultSet resultset = dlib.executeQueryAndFetch("select * from students_info");
        while(resultset.next())
        {
        	System.out.println(resultset.getString(3)+"\t"+resultset.getInt(1)+"\t"+resultset.getString(2));
        }
       //System.out.println(dlib.toString());
		
        /*
		 * Statement state = conn.createStatement(); String query =
		 * "select * from students_info"; //step-04:execute the query ResultSet
		 * resultset = state.executeQuery(query);//it will return the table //resultset
		 * is a like a hashset, in hashset inorder to fetch the data from the table by
		 * index we go for iterator while(resultset.next()) {
		 * System.out.println(resultset.getInt(01)+" "+ resultset.getString(2)+" "+
		 * resultset.getString(3)+" "+ resultset.getString(4)); }
		 */
      }
		/*
		 * catch(Exception e) { System.out.println("handled"); }
		 */

finally
{
	dlib.closeDatabase();
	//System.out.println("connection is closed");
}
}
}
