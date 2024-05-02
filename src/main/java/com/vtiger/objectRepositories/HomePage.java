package com.vtiger.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericUtilities.WebDriverUtility;

public class HomePage extends WebDriverUtility{
	//Declaration
	@FindBy(xpath = "//a[@href='index.php?module=Accounts&action=index']")
	private WebElement Organizationlnk;
	
	@FindBy(xpath = "//a[@href='index.php?module=Contacts&action=index']")
	private WebElement Contactlnk;
	
	@FindBy(xpath = "//a[@href='index.php?module=Potentials&action=index']")
	private WebElement oppertunitieslnk;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorImg;
	
	@FindBy(xpath = "//a[@href='index.php?module=Users&action=Logout']")
	private WebElement signOutLnk;
	
	//Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Getters

	public WebElement getOrganizationlnk() {
		return Organizationlnk;
	}

	public WebElement getContactlnk() {
		return Contactlnk;
	}

	public WebElement getOppertunitieslnk() {
		return oppertunitieslnk;
	}

	public WebElement getAdministratorImg() {
		return administratorImg;
	}

	public WebElement getSignOutLnk() {
		return signOutLnk;
	}
	
	//business library
	public void clickOnOrgLink() {
		Organizationlnk.click();
	}
	public void clickOnContactsLink() {
		Contactlnk.click();
	}
	public void logOutfromApp(WebDriver driver) {
		mouseOverAction(driver, administratorImg);
		signOutLnk.click();
	}
	
			

}
