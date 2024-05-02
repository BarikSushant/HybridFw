package Actual.vtiger.TC;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.genericUtilities.Baseclass;
import com.vtiger.objectRepositories.CreateNewOrganizationPage;
import com.vtiger.objectRepositories.HomePage;
import com.vtiger.objectRepositories.OrganizationInformationPage;
import com.vtiger.objectRepositories.OrganizationPage;

public class CreateOrganizationTest extends Baseclass{
@Test
public void createorg() {
	//click on orgModule
	HomePage hp=new HomePage(driver);
	hp.clickOnOrgLink();
	//click on organization loookup image
	OrganizationPage org=new OrganizationPage(driver);
	org.clickOnCreateOrgLookupImg();
	//create new organization
	CreateNewOrganizationPage co=new CreateNewOrganizationPage(driver);
	co.CreateNewOranization("Sushant"+ju.getRandomNumber());
    //get the header and verify
	OrganizationInformationPage oip=new OrganizationInformationPage(driver);
    String header = oip.getHeader();
    //verify
    Assert.assertTrue(header.contains("Sushant"));
    System.out.println("==ORGANIZATION is created and TC is Passed==");
}

}
