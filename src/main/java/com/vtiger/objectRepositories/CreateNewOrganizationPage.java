package com.vtiger.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrganizationPage {
	//Declartion
	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement orgNameEdtElement;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
    
	//Initialization
	public CreateNewOrganizationPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	//Utilization(getters)

	public WebElement getOrgNameEdtElement() {
		return orgNameEdtElement;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	//Business Library
	public void CreateNewOranization(String ORGNAME) {
		orgNameEdtElement.sendKeys(ORGNAME);
		saveBtn.click();
		
	}
	
}
