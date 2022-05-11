package com.crm.oppertunityTest;

import org.testng.annotations.Test;

import com.crm.skimoon.genericUtility.BaseClass;
import com.crm.skimoon.pomUtility.CreateNewOppertunityPage;
import com.crm.skimoon.pomUtility.CreateNewOrganizationPage;
import com.crm.skimoon.pomUtility.HomePage;
import com.crm.skimoon.pomUtility.OpportunityInfoPage;
import com.crm.skimoon.pomUtility.OpportunityPage;
import com.crm.skimoon.pomUtility.OrganizationInfoPage;
import com.crm.skimoon.pomUtility.OrganizationsPage;

public class OppertunitiesWithRelatedToTest extends BaseClass
{
	@Test
	public void OppertunitieWithRelatedToTest() throws Throwable 
	{			
		/*fetch the data from excel*/
		String opertunityname=elib.getDataFromExcel("oppertunities", 1, 0)  +rannum;
		String orgname = elib.getDataFromExcel("oppertunities", 1, 1) + rannum;
                
        /*navigate to the organization link and create organization*/
        HomePage hp=new HomePage(driver);
        hp.getOrganizationslink().click();

        /*navigate to create organization*/
        OrganizationsPage orgp=new OrganizationsPage(driver);
        orgp.getCreateOrgImg().click();

        /*create new organization*/
        CreateNewOrganizationPage cnorgp=new CreateNewOrganizationPage(driver);
        cnorgp.CreateNewOrg(orgname);
        
        /*verify*/
        OrganizationInfoPage orgip=new OrganizationInfoPage(driver);
		String organizationactualinfo = orgip.getorgnizationInfoPageTitle().getText();

		 if(organizationactualinfo.contains(orgname))
		{
			System.out.println(organizationactualinfo + "==> verified==>pass");
		}
		 else
		 {
			 System.out.println(organizationactualinfo + "==>is not verified==>fail");
		 }
        /*navigate to the opportunity link*/
        hp.getOpportunitieslink().click();
        
        /*click on the create opportunity img*/
        OpportunityPage opp=new OpportunityPage(driver);
        opp.getCreateOpportunityImg().click();
        
        /*enter opportunity name with related To mandatory field*/
        CreateNewOppertunityPage cnop=new CreateNewOppertunityPage(driver);
        cnop.getOppertunityNameEdit().sendKeys(opertunityname);
        cnop.getRelatedToOrganizationLookUp().click();
        
        /*switch to organizations page,select organization and came back to parent page click on save button*/
        
        orgp.SearchAndSelectOrganization(orgname);
       
    	/*verify */
        OpportunityInfoPage oip=new OpportunityInfoPage(driver);
		String oppertunityctualinfo = oip.getopportunityInfoPageTitle().getText();

		 if(oppertunityctualinfo.contains(opertunityname))
		{
			System.out.println(opertunityname + "==> verified==>pass");
		}
		 else
		 {
			 System.out.println(opertunityname + "==>is not verified==>fail");
		 }
 	}

}
