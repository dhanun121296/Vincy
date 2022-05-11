package com.crm.purchaseorderTest;

import static org.testng.Assert.assertTrue;

import com.crm.skimoon.genericUtility.BaseClass;
import com.crm.skimoon.pomUtility.CreateNewProductPage;
import com.crm.skimoon.pomUtility.CreateNewPurchaseOrderPage;
import com.crm.skimoon.pomUtility.CreateNewVendors;
import com.crm.skimoon.pomUtility.HomePage;
import com.crm.skimoon.pomUtility.ProductsPage;
import com.crm.skimoon.pomUtility.PurchaseOrderInformationPage;
import com.crm.skimoon.pomUtility.PurchaseOrderPage;
import com.crm.skimoon.pomUtility.VendorsPage;

public class CreateNewPurchaseOrderTest extends BaseClass
{
	public void CreatePurchaseOrderTest() throws Throwable 
	{   
        /*use excel file to fetch the test data*/
		String purchasesubject = elib.getDataFromExcel("purchase", 1, 0)+rannum;
		String vendorname = elib.getDataFromExcel("purchase", 1, 2)+rannum;
		String productname = elib.getDataFromExcel("purchase", 1, 1)+rannum;
		String qty=elib.getDataFromExcel("purchase", 1, 3)+rannum;
		String billadress=elib.getDataFromExcel("purchase", 1, 4)+rannum;
			
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

		boolean actual = actualPurchaseOrderInfoTitle.contains(purchasesubject);
		
		assertTrue(actual,"purchaseOrder is not created===FAIL");
		System.out.println("purchaseOrder is created===PASS");
		
		
		        
	}

}
