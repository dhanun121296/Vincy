package com.crm.oppertunityTest;

import org.testng.annotations.Test;

import com.crm.skimoon.genericUtility.BaseClass;
import com.crm.skimoon.pomUtility.ContactInformationPage;
import com.crm.skimoon.pomUtility.ContactsPage;
import com.crm.skimoon.pomUtility.CreateNewContactsPage;
import com.crm.skimoon.pomUtility.CreateNewOppertunityPage;
import com.crm.skimoon.pomUtility.HomePage;
import com.crm.skimoon.pomUtility.OpportunityInfoPage;
import com.crm.skimoon.pomUtility.OpportunityPage;

public class OppertunitiesWithRelatedToContactTest extends BaseClass 
{
	@Test
	public void OppertunitieWithRelatedToContactTest() throws Throwable 
	{				
		/*fetch the data from excel*/
		String opertunityname=elib.getDataFromExcel("oppertunities", 1, 0)  +rannum;
		String contactlastname = elib.getDataFromExcel("oppertunities", 1, 2) + rannum;
                
        /*navigate to the contact link and create organization*/
        HomePage hp=new HomePage(driver);
        hp.getContactslink().click();

        /*navigate to create contact*/
        ContactsPage cp=new ContactsPage(driver);
        cp.getCreateContactImg().click();

        /*create new contact*/
        CreateNewContactsPage cncp=new CreateNewContactsPage(driver);
        cncp.CreateNewContact(contactlastname);
        
        /*verify*/
        ContactInformationPage cip=new ContactInformationPage(driver);
		String contactactualinfo = cip.getContactInformationPagetitle().getText();

		 if(contactactualinfo.contains(contactlastname))
		{
			System.out.println(contactactualinfo + "==> verified==>pass");
		}
		 else
		 {
			 System.out.println(contactactualinfo + "==>is not verified==>fail");
		 }
        /*navigate to the opportunity link*/
        hp.getOpportunitieslink().click();
        
        /*click on the create opportunity img*/
        OpportunityPage opp=new OpportunityPage(driver);
        opp.getCreateOpportunityImg().click();
        
        /*enter opportunity name with related To mandatory field and select contact in related to dropdown*/
        CreateNewOppertunityPage cnop=new CreateNewOppertunityPage(driver);
        cnop.opportunitynameAndSelectContact(opertunityname);
        cnop.getRelatedToOrganizationLookUp().click();
        
        /*switch to contacts page,select contact and came back to parent page click on save button*/
        cp.SearchAndSelectContact(contactlastname);
       
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
