package com.crm.skimoon.genericUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImpClass implements ITestListener
{

	public void onTestFailure(ITestResult result)
	{
		JavaUtility jLib=new JavaUtility();
		System.out.println("=======Failure=======");
		
		String testName = result.getMethod().getMethodName();
		
		EventFiringWebDriver eDriver=new EventFiringWebDriver(BaseClass.sdriver);
		File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
		
		File dstFile = new  File("./screenshot/"+testName+"_"+jLib.getSystemDate()+".png");
		try {
			FileUtils.copyFile(srcFile, dstFile);
		}
		catch(IOException e) {
		//	e.printStackTrace();
		}
	}
}		//	File dest=new File("./photos/"+d2+screenshotName+".PNG");


