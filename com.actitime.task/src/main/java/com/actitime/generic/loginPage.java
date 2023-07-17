package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
WebDriver driver;

/**
 * @param driver
 */
public loginPage(WebDriver driver) {
	super();
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
@FindBy(id="username")
private WebElement userNameTextField;
@FindBy(name="pwd")
private WebElement passwordTextField;
@FindBy(id="loginButton")
private WebElement loginButton;

/**
 * @return the loginButton
 */
public WebElement getLoginButton() {
	return loginButton;
}
/**
 * @return the passwordTextField
 */
public WebElement getPasswordTextField() {
	return passwordTextField;
}
/**
 * @return the userNameTextField
 */
public WebElement getUserNameTextField() {
	return userNameTextField;
}

}
