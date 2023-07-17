package com.actitime.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class webDriverUtility {
public void implicitWait(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
}
