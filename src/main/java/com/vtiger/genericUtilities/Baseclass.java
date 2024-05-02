package com.vtiger.genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.graphbuilder.math.func.EFunction;
import com.vtiger.objectRepositories.HomePage;
import com.vtiger.objectRepositories.LoginPage;

public class Baseclass {
	public PropertyFileUtility pu=new PropertyFileUtility();
	public ExcelFileUtility eu=new ExcelFileUtility();
	public WebDriverUtility wu=new WebDriverUtility();
	public JavaUtility ju=new JavaUtility();
	public WebDriver driver=null;//runtime polymorphism
	
	@BeforeSuite
	public void bsconfig() {
		System.out.println("==DB CONNECTED==");
	}
	@AfterSuite
	public void asconfig() {
		System.out.println("==DB DISCONNECTED==");
	}
	@BeforeClass
	public void bcconfig() throws Throwable {
		String BROWSER = pu.readDataFromPropertyfile("browser");
		String URL = pu.readDataFromPropertyfile("url");
		if(BROWSER.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			System.out.println("Edgedriver is launched");
		}
		else if (BROWSER.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
			System.out.println("==chrome is launched==");
		}
		else {
			System.out.println("===INVALID BROWSER NAME===");
		}
		wu.maximizeWindow(driver);
		wu.waitforpageLoad(driver);//implicit wait
		driver.get(URL);
		System.out.println("==BRWOSER IS OPENED==");
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
		System.out.println("==BROWSER IS CLOSED==");
	}
	@BeforeMethod
	public void bmconfig() throws Throwable {
		String UN = pu.readDataFromPropertyfile("un");
		String PWD = pu.readDataFromPropertyfile("pwd");
		LoginPage lp=new LoginPage(driver);
		lp.loginToApp(UN, PWD);
		System.out.println("==login is succesfully==");
	}
	@AfterMethod
	public void amconfig() {
		HomePage hp =new HomePage(driver);
		hp.logOutfromApp(driver);
		System.out.println("==LOGOUT IS DONE SUCCESSFULLY");
	}
	
	

}
