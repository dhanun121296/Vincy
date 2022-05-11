package com.crm.campaignsTest;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.skimoon.genericUtility.BaseClass;
import com.crm.skimoon.pomUtility.CampaignInformationPage;
import com.crm.skimoon.pomUtility.CampaignsPage;
import com.crm.skimoon.pomUtility.CreateNewCampaignPage;
import com.crm.skimoon.pomUtility.CreateNewProductPage;
import com.crm.skimoon.pomUtility.HomePage;
import com.crm.skimoon.pomUtility.ProductsPage;

@Listeners(com.crm.skimoon.genericUtility.ListenerImpClass.class)
public class CampaignWithproductTest extends BaseClass
{
	@Test(retryAnalyzer = com.crm.skimoon.genericUtility.RetryImpClass.class)
	public void CampaignWitproductTest() throws Throwable {
				
		// read test data from excel file
	    String productname = elib.getDataFromExcel("product", 11, 1) + rannum;
		String campaignname = elib.getDataFromExcel("campaigns", 1, 0) + rannum;
	
		/*create a product*/
		HomePage hp=new HomePage(driver);
		hp.getProductslink();	//.click();
		
		/*click on create product page img*/
		ProductsPage pp=new ProductsPage(driver);
		pp.getCreateProductImg().click();
		
		/*create a new product*/
		CreateNewProductPage cnpp=new CreateNewProductPage(driver);
		cnpp.createNewProduct(productname);
		
		/*verify*/
		wlib.waitUntilUrlVisible(driver, "DetailView&module=Products");
		
		
		/*navigate to campaign page*/
		hp.navigateToCampaign();
		
		/*navigate to create campaign page*/
		CampaignsPage cp=new CampaignsPage(driver); 
		cp.getcreatenewCampaignImg().click();
		
		/*create a new campaign with product*/
		CreateNewCampaignPage cncp=new CreateNewCampaignPage(driver);
		cncp.createCapaigmWithProduct(campaignname, productname);
		
		/* verify */
		CampaignInformationPage cip =new CampaignInformationPage(driver);
		String actualInfoPage =cip.getCampaignInfotitle().getText();

		boolean actual = actualInfoPage.contains(campaignname);
		
	//	assertTrue(actual,"campaign is not created===FAIL");
			assertTrue(actual,"campaign is not created===FAIL");

		System.out.println("campaign is created===PASS");

	}

}
