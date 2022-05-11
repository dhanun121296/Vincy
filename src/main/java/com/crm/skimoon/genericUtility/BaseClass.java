package com.crm.skimoon.genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.crm.skimoon.pomUtility.HomePage;
import com.crm.skimoon.pomUtility.Loginpage;
/**
 * this class contains all basic configuration of TestNG
 * @author Dell
 *
 */
public class BaseClass 
{
	/*in order to access all libraries for the test script sub class here i make public*/
	
	/*Object creation for libraries*/
	public WebDriverUtility wlib=new WebDriverUtility();
	public FileUtility flib=new FileUtility();
	public ExcelUtility elib=new ExcelUtility();
	public DatabaseUtility dlib=new DatabaseUtility();
	public int rannum = JavaUtility.getRandomNum();
	public static WebDriver driver;
	public static WebDriver sdriver=null;
	
	/**
	 * beforeSuite will get executed only one time in a execution
	 * this method is used to connect to the database
	 * @throws Throwable 
	 */
	@BeforeSuite(groups= {"smokeTest","regresionTest"})
	public void bsConfig() throws Throwable
	{
		System.out.println("------connected to db is done------");
	}
	
	
	
	/**
	 * this method is used to launch the browser
	 * @throws Throwable 
	 */
//	@Parameters("browser")
//	@BeforeTest(groups= {"smokeTest","regresionTest"})
	public void btConfig(String browser) throws Throwable
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			driver=new InternetExplorerDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		wlib.waitUntilPageLoad(driver);
		System.out.println("------browser is launched------");
		
	}

	
	
	
	
	
	/**
	 * this method is used to launch the browser
	 * @throws Throwable 
	 */

	@BeforeClass(groups= {"smokeTest","regresionTest"})
	public void bcConfig() throws Throwable
	{
		String browser  = flib.getKeyValueFromProperty("browser");
		
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			driver=new InternetExplorerDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		wlib.waitUntilPageLoad(driver);
		sdriver=driver;
		System.out.println("------browser is launched------");
		
	}
	
	
	
	/**
	 * this method is used to login to the application
	 * @throws Throwable 
	 */
	@BeforeMethod(groups= {"smokeTest","regresionTest"})
	public void bmConfig() throws Throwable
	{
		String URL  = flib.getKeyValueFromProperty("url");
		String USERNAME  = flib.getKeyValueFromProperty("username");
		String PASSWORD  = flib.getKeyValueFromProperty("password");
		driver.get(URL);
		Loginpage lp=new Loginpage(driver);
		lp.loginToApp(USERNAME, PASSWORD);
		System.out.println("------login is done------");
	}
	/**
	 * this method is used to logout the application
	 */
	@AfterMethod(groups= {"smokeTest","regresionTest"})
	public void amConfig()
	{
		HomePage hp=new HomePage(driver);
	
		hp.logout();
		System.out.println("------logged out successefull------");
	}
	
	@AfterClass(groups= {"smokeTest","regresionTest"})
	public void acConfig()
	{
		driver.quit();
		System.out.println("------browser is closed------");
	}
	
	
//	@AfterTest(groups= {"smokeTest","regresionTest"})
	public void atConfig()
	{
		driver.quit();
		System.out.println("------browser is closed------");
	}
	
	
	@AfterSuite(groups= {"smokeTest","regresionTest"})
	public void asConfig()
	{
		System.out.println("------db connection is closed------");
	}
	

}
