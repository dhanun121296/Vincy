package com.crm.contactstest;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.skimoon.genericUtility.BaseClass;
import com.crm.skimoon.pomUtility.ContactInformationPage;
import com.crm.skimoon.pomUtility.ContactsPage;
import com.crm.skimoon.pomUtility.CreateNewContactsPage;
import com.crm.skimoon.pomUtility.HomePage;

@Listeners(com.crm.skimoon.genericUtility.ListenerImpClass.class)

public class CreateContactsTest extends BaseClass
{
	//@Test(groups= {"smokeTest"})
	
	@Test	//(retryAnalyzer = com.crm.skimoon.genericUtility.RetryImpClass.class)
	
	public void CreateContactTest() throws InterruptedException, Throwable 
	{		
		String lastname= elib.getDataFromExcel("contacts", 1, 1)+rannum ;
		 			
		/*Navigate to the organizations*/
		HomePage hp=new HomePage(driver);
		hp.getContactslink();	//.click();
		
		/*navigate to create new organizations img*/
		ContactsPage cp=new ContactsPage(driver);
	    cp.getCreateContactImg().click();
	    
	    /*give last name & save the contact*/
	    CreateNewContactsPage cno=new CreateNewContactsPage(driver);
		cno.CreateNewContact(lastname);
    	/*verify */
		ContactInformationPage cip=new ContactInformationPage(driver);
		String actualtitle = cip.getContactInformationPagetitle().getText();
		boolean actual = actualtitle.contains(lastname);
		
		assertTrue(actual,"contact is not created===FAIL");
		System.out.println("contact is created===PASS");
		
		
	}
	
	
	@Test(groups= {"regresionTest"})
	public void CreateContactsWithoutMandetoryFeildTest() throws InterruptedException, Throwable 
	{
		/*read test data from excel file*/
		String firstname=elib.getDataFromExcel("contacts", 1, 0) + rannum;
	    String errormsg=elib.getDataFromExcel("contacts", 1, 2);
	    			
			/*navigate to contacts link*/
			HomePage hp=new HomePage(driver);
			hp.getContactslink().click();
			
			/*click on create contact img*/
			ContactsPage cp=new ContactsPage(driver);
			cp.getCreateContactImg().click();
			
			/*enter first name and with entering data into mandatory field*/
			CreateNewContactsPage cncp=new CreateNewContactsPage(driver);
			cncp.CreateNewContactWithoutMandatory(firstname);
	  				
		    /*verify*/
			wlib.acceptAlertAndVerify(driver, errormsg);
	}

}
