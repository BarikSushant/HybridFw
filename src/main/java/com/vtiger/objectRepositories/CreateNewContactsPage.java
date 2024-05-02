package com.vtiger.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v122.audits.model.ContentSecurityPolicyIssueDetails;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactsPage {
   //Declaration
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement saveBtn;
	
	//Initialization
	public CreateNewContactsPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}


	//getter
	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	
	//Business Libarary
	public void	CreateNewContacts(String LastName) {
		lastName.sendKeys(LastName);
		saveBtn.click();
		
	}
}
