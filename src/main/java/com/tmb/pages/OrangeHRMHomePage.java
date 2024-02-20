package com.tmb.pages;

import org.openqa.selenium.By;

import com.tmb.driver.DriverManager;
import com.tmb.enums.WaitStrategy;

public class OrangeHRMHomePage extends BasePage {
	private final By linkWelcome = By.className("oxd-userdropdown-name");
	private final By linkLogout = By.xpath("//a[text()='Logout']");

	public OrangeHRMHomePage clickWelcome() {
		click(linkWelcome,WaitStrategy.PRESENCE);
		return this;
	}

	public OrangeHRMHomePage clickLogout() {
		click(linkLogout,WaitStrategy.CLICKABLE);
		return this;
	}
	public String getTitle() {
		return DriverManager.getDriver().getTitle();
	}

}
