package com.vtiger.genericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebDriverUtility {
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public void minimizeWindow(WebDriver driver) {
		driver.manage().window().minimize();
	}
	public void waitforpageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	//select Class
	public void handleDropDown(WebElement element,int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	public void handleDropDown(WebElement element,String value) {//we are called ListBox
		Select s=new Select(element);
		s.selectByValue(value);
	}
	public void handleDropDown(String visibleText,WebElement element) {
		Select s=new Select(element);
		s.selectByVisibleText(visibleText);
	}
	//Action Class
	public void mouseOverAction(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	public void rightClick(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.contextClick(element).perform();	
	}
	public void doubleClick(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
	}
	public void dragAndDrop(WebDriver driver,WebElement srcele,WebElement destele) {
		Actions a=new Actions(driver);
		a.dragAndDrop(srcele,destele).perform();
	}
	public void getScreenshot(WebDriver driver) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./"+"\\Screenshots\\ProjectName"+System.currentTimeMillis()+".png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}

	


 


