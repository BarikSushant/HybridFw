package com.vtiger.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInformationPage {
	//Declaration
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement orgHeaderText;

	//initialization
	public OrganizationInformationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Utilization
		public WebElement getOrgHeaderText() {
			return orgHeaderText;
		}
	//Business Library
		public String getHeader() {
			return orgHeaderText.getText();
		}
}
