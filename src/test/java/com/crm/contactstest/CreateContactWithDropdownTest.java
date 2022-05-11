package com.crm.contactstest;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.skimoon.genericUtility.BaseClass;
import com.crm.skimoon.pomUtility.ContactInformationPage;
import com.crm.skimoon.pomUtility.ContactsPage;
import com.crm.skimoon.pomUtility.CreateNewContactsPage;
import com.crm.skimoon.pomUtility.HomePage;

public class CreateContactWithDropdownTest extends BaseClass
{
	@Test
	public void CreateContactWitDropdownTest() throws InterruptedException, Throwable 
	{
		
		//read test data from excel file 
	    String lastname= elib.getDataFromExcel("contacts", 1, 1) + rannum;				
	   
		/*navigate to the contacts link*/
		HomePage hp=new HomePage(driver);
		hp.getContactslink().click();
		
		/*click on create contact img*/
		ContactsPage cp=new ContactsPage(driver);
		cp.getCreateContactImg().click();
		
		/*give the lastname and under group dropdown select support group*/
		CreateNewContactsPage cncp=new CreateNewContactsPage(driver);
		cncp.CreateNewContactWithGroupDropdown(lastname);
		
    	/*verify */
		ContactInformationPage cip=new ContactInformationPage(driver);
		String contactactualinfo = cip.getContactInformationPagetitle().getText();
		boolean actual = contactactualinfo.contains(lastname);
	
		assertTrue(actual,"contact is not created===FAIL");
		System.out.println("contact is created===PASS");
		
   		
	}


}
