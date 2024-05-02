package com.vtiger.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	//Declaration
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createOrgLookUpImg;
	
	
	//Initialization
	public OrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
    
	
	//Utilization(getters)
	public WebElement getCreateOrgLookUpImg() {
		return createOrgLookUpImg;
	}
	//Business library
	public void clickOnCreateOrgLookupImg() {
		createOrgLookUpImg.click();
		
	}
	
}
