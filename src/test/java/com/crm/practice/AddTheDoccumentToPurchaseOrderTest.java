package com.crm.practice;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.crm.skimoon.genericUtility.WebDriverUtility;

public class AddTheDoccumentToPurchaseOrderTest
{
	@Test
	public void addDoccumentToPurchaseOrder() throws Throwable
	{
		WebDriverUtility wlib = new WebDriverUtility();
//use property file to fetch the common data
		FileInputStream fis=new FileInputStream("./data/commondata.properties/");
		Properties pobj=new Properties();
		           pobj.load(fis);
		String url = pobj.getProperty("url");
		String username = pobj.getProperty("username");
		String password = pobj.getProperty("password");
		String browser = pobj.getProperty("browser");
		//inorder to create multiple organizatins use random class
	     Random ran=new Random();
	     int rannum = ran.nextInt(1000);
//use excel file to fetch the test data
		FileInputStream fis2=new FileInputStream("./data/data.xlsx/");
		Workbook book = WorkbookFactory.create(fis2);
		Sheet sh = book.getSheet("product");
		Row r = sh.getRow(11);
		String productname = r.getCell(1).getStringCellValue()+ rannum;
				
		WebDriver driver=null;
		if (browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (browser.equals("fire"))
		{
			driver=new FirefoxDriver();
		}
		else if (browser.equals("ie"))
		{
			driver=new InternetExplorerDriver();
		}
//inspect the elements of loginpage
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@id='submitButton' and @value='Login']")).click();
		driver.findElement(By.xpath("//a[.='Products']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
		driver.findElement(By.xpath("//input[@name='productname']")).sendKeys(productname);
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();

		WebElement move = driver.findElement(By.xpath("//a[.='More']"));
		wlib.mouseOverToElement(driver, move);
		wlib.waitUntilElementLoad(driver, move);
		driver.findElement(By.xpath("//a[@name='Purchase Order']")).click();
        driver.findElement(By.xpath("//a[@title='Purchase Order']")).click();
        WebElement moreinfo = driver.findElement(By.xpath("//a[.='More Information']"));
        wlib.mouseOverToElement(driver, moreinfo);
        wlib.waitUntilElementLoad(driver, moreinfo);
        driver.findElement(By.xpath("//a[.='Documents' and @class='drop_down']")).click();
       
        driver.findElement(By.xpath("//input[@title='Add Document' and @value='Add Document']")).click();
        driver.findElement(By.xpath("//input[@name='notes_title']")).sendKeys(productname);
        driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
        /*verify */
		 String docactualinfo = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();

		 if(docactualinfo.contains(productname))
		{
			System.out.println(productname + "==> verified==>pass");
		}
		 else
		 {
			 System.out.println(productname + "==>is not verified==>fail");
		 }

        WebElement ele1 = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		wlib.mouseOverToElement(driver, ele1);
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
		
		driver.quit();
        
	}

}
