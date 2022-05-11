package com.crm.contactstest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.skimoon.genericUtility.BaseClass;
import com.crm.skimoon.pomUtility.ContactInformationPage;
import com.crm.skimoon.pomUtility.ContactsPage;
import com.crm.skimoon.pomUtility.CreateNewContactsPage;
import com.crm.skimoon.pomUtility.HomePage;

public class CreateContactAndDeleteContactTest extends BaseClass
{
	@Test
	public  void CreateContactDeleteContactTest() throws InterruptedException, Throwable 
	{
			
		// read test data from excel file
		String lastname = elib.getDataFromExcel("contacts", 1, 1) + rannum;
		String confirmationmsg = elib.getDataFromExcel("contacts", 1, 3);
		
		driver.manage().window().maximize();
		wlib.waitUntilPageLoad(driver);
		
		/*navigate to contacts*/
		HomePage hp=new HomePage(driver);
		hp.getContactslink().click();
		
		/*click on create contact button*/
		ContactsPage cp=new ContactsPage(driver);
		cp.getCreateContactImg().click();
		
		/*click on create new contact button*/
		CreateNewContactsPage cncp=new CreateNewContactsPage(driver);
		cncp.CreateNewContact(lastname);
		
		/*verify*/
	    ContactInformationPage cip=new ContactInformationPage(driver);
		String actualpagetitle =cip.getContactInformationPagetitle().getText();
		boolean actual = actualpagetitle.contains(lastname);
		SoftAssert s=new SoftAssert();
		s.assertTrue(actual,"contact is not created===FAIL");
		System.out.println("contact is created===PASS");
		
		
		/*again navigate to contacts page*/
		hp.getContactslink().click();
		
		/*search for the latest created contact*/
		cp.searchLatestContactAndDelete(lastname);
		wlib.acceptAlertAndVerify(driver, confirmationmsg);
		
		wlib.waitUntilPageLoad(driver);
	    		 
	}

}
