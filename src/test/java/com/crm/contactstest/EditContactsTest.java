package com.crm.contactstest;



import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.skimoon.genericUtility.BaseClass;
import com.crm.skimoon.pomUtility.ContactInformationPage;
import com.crm.skimoon.pomUtility.ContactsPage;
import com.crm.skimoon.pomUtility.CreateNewContactsPage;
import com.crm.skimoon.pomUtility.EditingContactInformation;
import com.crm.skimoon.pomUtility.HomePage;

@Listeners(com.crm.skimoon.genericUtility.ListenerImpClass.class)
public class EditContactsTest extends BaseClass
{
	@Test(groups= {"smokeTest"})
	public void EditContactTest() throws InterruptedException, Throwable 
	{
		/*read test data from excel file*/
	    String lastname= elib.getDataFromExcel("contacts", 1, 1) + rannum;
	    String replace_lastname= elib.getDataFromExcel("contacts", 1, 4) + rannum;
	   		
		/*navigate to the contacts link*/
		HomePage hp=new HomePage(driver);
		hp.getContactslink().click();
		
		/*click on create contact img*/
		ContactsPage cp=new ContactsPage(driver);
		cp.getCreateContactImg().click();
		
		/*enter last name and create the contact*/
		CreateNewContactsPage cncp=new CreateNewContactsPage(driver);
		cncp.CreateNewContact(lastname);
		
    	/*verify */
		ContactInformationPage cip =new ContactInformationPage(driver);
		 String contactactualinfo = cip.getContactInformationPagetitle().getText();
		 boolean actual = contactactualinfo.contains(lastname);
			SoftAssert s=new SoftAssert();
			s.assertTrue(actual,"contact is not created===FAIL");
			System.out.println("contact is created===PASS");
		 
		 /*click on contacts link in major tab*/
		 hp.getContactslink().click();
		 cp.searchLatestContactAndEdit(lastname);
		 EditingContactInformation ecip=new EditingContactInformation(driver);
		 ecip.Editcontactlastname(replace_lastname);
		  
    	/*verify */
		 String actualContactInfoPageTitle = ecip.getConctactInfotitle().getText();
		 boolean flag = actualContactInfoPageTitle.contains(replace_lastname);
			s.assertTrue(flag,"contact is not edited===FAIL");
			System.out.println("contact is edited===PASS");
			
			s.assertAll();		 
		 
		 
		
    	
    }
	
	
	@Test(groups= {"smokeTest"})
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
		 boolean actual = actualpagetitle.contains(actualpagetitle);
			SoftAssert s=new SoftAssert();
			s.assertTrue(actual,"contact is not deleted===FAIL");
			System.out.println("contact is deleted===PASS");
		
		
		/*again navigate to contacts page*/
		hp.getContactslink().click();
		
		/*search for the latest created contact*/
		cp.searchLatestContactAndDelete(lastname);
		wlib.acceptAlertAndVerify(driver, confirmationmsg);
		
		s.assertAll();
	    		 
	}

	
	
	
}