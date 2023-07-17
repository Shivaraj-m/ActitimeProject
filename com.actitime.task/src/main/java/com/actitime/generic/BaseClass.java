package com.actitime.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
	
public WebDriver driver;
public fileUtility fileUtils=new fileUtility();
public webDriverUtility webdriverUtils=new webDriverUtility();
@BeforeMethod
public void configBeforMethod() throws IOException {
	String browserName=fileUtils.readDataFromPropertyFile("browser");
	if (browserName.equals("Chrome")) {
		driver=new ChromeDriver();
	}else if (browserName.equals("edge")) {
		driver=new EdgeDriver();
	}else {
		driver=new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.get(fileUtils.readDataFromPropertyFile("url"));
} 
@AfterMethod
public void confiAfterMethod() {
	driver.manage().window().minimize();
	driver.quit();
}
}
