package com.crm.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.crm.skimoon.genericUtility.ExcelUtility;
import com.crm.skimoon.genericUtility.FileUtility;
import com.crm.skimoon.genericUtility.JavaUtility;
import com.crm.skimoon.genericUtility.WebDriverUtility;
import com.crm.skimoon.pomUtility.CreateNewProductPage;
import com.crm.skimoon.pomUtility.CreateNewPurchaseOrderPage;
import com.crm.skimoon.pomUtility.CreateNewVendors;
import com.crm.skimoon.pomUtility.HomePage;
import com.crm.skimoon.pomUtility.Loginpage;
import com.crm.skimoon.pomUtility.ProductsPage;
import com.crm.skimoon.pomUtility.PurchaseOrderInformationPage;
import com.crm.skimoon.pomUtility.PurchaseOrderPage;
import com.crm.skimoon.pomUtility.VendorsPage;

public class CreateNewPurchaseOrder 
{
	@Test
	public void CreatePurchaseOrder() throws Throwable 
	{   WebDriverUtility wlib = new WebDriverUtility();
	    FileUtility flib=new FileUtility();
	    ExcelUtility elib=new ExcelUtility();
	    
        /*use property file to fetch the common data*/
		
		String browser = flib.getKeyValueFromProperty("browser");
		/*To create random number*/
		int rannum = JavaUtility.getRandomNum();
        /*use excel file to fetch the test data*/
		
		String purchasesubject = elib.getDataFromExcel("purchase", 1, 0)+rannum;
		String vendorname = elib.getDataFromExcel("purchase", 1, 2)+rannum;
		String productname = elib.getDataFromExcel("purchase", 1, 1)+rannum;
		String qty=elib.getDataFromExcel("purchase", 1, 3)+rannum;
		String billadress=elib.getDataFromExcel("purchase", 1, 4)+rannum;
		
        /*In order to run test in different browsers*/
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
        /*inspect the elements of loginpage*/
		driver.manage().window().maximize();
		wlib.waitUntilPageLoad(driver);
		
		/*login to the application*/
		Loginpage lp=new Loginpage(driver);
		lp.loginToApp();
		
	    /*navigate to the products page*/
		HomePage hp=new HomePage(driver);
		hp.getProductslink().click();
		
		/*click on create product img*/
		ProductsPage pp=new ProductsPage(driver);
		pp.getCreateProductImg().click();
		
		/*enter product name and save it*/
		CreateNewProductPage cnpp=new CreateNewProductPage(driver);
		cnpp.createNewProduct(productname);
		
		/*verify*/
		wlib.waitUntilUrlVisible(driver, "DetailView&module=Products");
		
		/*navigate to vendors*/
		hp.navigateToVedors();
		
		/*click on create vendors*/
		VendorsPage vp=new VendorsPage(driver);
		vp.getCreateVedorsImg().click();
		
		/*enter the vendor name click on save button*/
		CreateNewVendors cnv=new CreateNewVendors(driver);
		cnv.createNewVendor(vendorname);
		
		/*verify*/
		wlib.waitUntilUrlVisible(driver, "DetailView&module=Vendors");
		
		/*navigate to more and click on Purchase order*/
		hp.navigateToPurchaseOrder();
		
		/*click on create purchase order img*/
		PurchaseOrderPage pop=new PurchaseOrderPage(driver);
		pop.getcreatePurchaseOrderImg().click();
		
		/*enter all the mandatory fields and click on save button*/
		CreateNewPurchaseOrderPage cnpo=new CreateNewPurchaseOrderPage(driver);
		cnpo.createNewPurchaseOrderPage(purchasesubject, vendorname, billadress, productname, qty);
		
		/* verify */
	    PurchaseOrderInformationPage poip= new PurchaseOrderInformationPage(driver);
	    wlib.waitUntilUrlVisible(driver, "DetailView&module=PurchaseOrder&record");
		String actualPurchaseOrderInfoTitle = poip.getPurchaseOrderInformationPageTitle().getText();

		if (actualPurchaseOrderInfoTitle.contains(purchasesubject)) {
			System.out.println(purchasesubject + "==> verified==>pass");
		} else {
			System.out.println(purchasesubject + "==>is not verified==>fail");
		}
		/*logout*/
		hp.logout();
		/*close the application tab and close the browser */
		driver.quit();
        
	}

}
