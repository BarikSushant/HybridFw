package com.vtiger.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConatactsInformationPage {
	//declaration
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement ContactsHeadertext;
	
	//initialization
	public  ConatactsInformationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}
	
	//getter
	public WebElement getContactsHeadertext() {
		return ContactsHeadertext;
	}
	
	//Business library
	public  String getHeader() {
		return ContactsHeadertext.getText();
		
	}
	

}
