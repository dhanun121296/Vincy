package com.crm.orgtest;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.skimoon.genericUtility.BaseClass;
import com.crm.skimoon.pomUtility.CreateNewOrganizationPage;
import com.crm.skimoon.pomUtility.HomePage;
import com.crm.skimoon.pomUtility.OrganizationInfoPage;
import com.crm.skimoon.pomUtility.OrganizationsPage;


@Listeners(com.crm.skimoon.genericUtility.ListenerImpClass.class)
public class CreateOrgTest extends BaseClass
{
	@Test(dataProvider="multidata")
	
	public void createOrgTest(String orgname,String industrytype) throws Throwable
	{
			
		/*navigate to the organizations*/
		HomePage hp=new HomePage(driver);
		hp.getOrganizationslink().click();
		
		/*click on create organization img*/
		OrganizationsPage op=new OrganizationsPage(driver);
		op.getCreateOrgImg().click();
		
		/*navigate to the create new organization page*/
		CreateNewOrganizationPage cno=new CreateNewOrganizationPage(driver);
		cno.CreateNewOrgWithIndustryType(orgname+rannum, industrytype);
		
		/*verify */
		OrganizationInfoPage oip= new OrganizationInfoPage(driver);
		String orgactualinfo = oip.getorgnizationInfoPageTitle().getText();
		boolean actual = orgactualinfo.contains(industrytype);
		assertTrue(actual,"Organization is not created===FAIL");
		System.out.println("Organization is created===PASS");

		
		
	}
	
	/*create data by using data provider*/
	
	@DataProvider(name="multidata")
	public Object[][] getdata() throws Throwable
	{
		Object[][] data = elib.readDataForDataProvider("multiOrg");
		return data;
		
	}
	
}
