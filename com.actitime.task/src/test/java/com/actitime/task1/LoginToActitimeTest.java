package com.actitime.task1;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.HomePage;
import com.actitime.generic.loginPage;

public class LoginToActitimeTest extends BaseClass {
	@Test
public void loginToHomePageTest() throws Throwable  {
		webdriverUtils.implicitWait(driver);
		loginPage loginPage = new loginPage(driver);
		loginPage.getUserNameTextField().sendKeys(fileUtils.readDataFromPropertyFile("username"));
		loginPage.getPasswordTextField().sendKeys(fileUtils.readDataFromPropertyFile("password"));
		loginPage.getLoginButton().click();
		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.getLogoutOption().isDisplayed(), "HomePage is not Pass");
		Reporter.log("Homepage is  displayed", true);
		
	}
}
