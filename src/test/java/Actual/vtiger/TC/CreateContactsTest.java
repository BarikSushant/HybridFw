package Actual.vtiger.TC;

import java.sql.Driver;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.genericUtilities.Baseclass;
import com.vtiger.objectRepositories.ContactsPage;
import com.vtiger.objectRepositories.CreateNewContactsPage;
import com.vtiger.objectRepositories.HomePage;
import com.vtiger.objectRepositories.OrganizationInformationPage;

public class CreateContactsTest extends Baseclass {
	//click on contacts module
	@Test
	public void CreateContacts() {
		HomePage hp1 =new HomePage(driver) ;
			hp1.clickOnContactsLink();
		
	//click on contactsLookUpImage
	ContactsPage cp= new ContactsPage(driver);
	  cp.clickOnCreateContactsLookUpImage();
	//create new Contacts
	  CreateNewContactsPage cnp=new CreateNewContactsPage(driver);
	  cnp.CreateNewContacts("Nayak"+ju.getRandomNumber());
	  //get the header and verify
	  OrganizationInformationPage oif=new OrganizationInformationPage(driver);
	  String header = oif.getHeader();
	  //verify
	  Assert.assertTrue(header.contains("Nayak"));
	  System.out.println("==ORGANIZATION is created and TC is Pass==");
	}
}	
	
	
