package com.vtiger.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	//Declaration
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']" )
	private WebElement createContactLookUpImg;
	
	//initialization
	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	//getter
	public WebElement getCreateContactLookUpImg() {
		return createContactLookUpImg;
	}
	
	//Business library
	public void clickOnCreateContactsLookUpImage() {
		createContactLookUpImg.click();
		
	}
	
}
