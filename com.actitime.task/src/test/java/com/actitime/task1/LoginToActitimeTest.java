package com.actitime.task1;

import java.io.IOException;

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
		if(homePage.getLogoutOption().isDisplayed()) {
			homePage.getLogoutOption().click();
			System.out.println("HomePage is Pass");
		}
	}
}
