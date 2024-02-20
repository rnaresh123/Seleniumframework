package com.tmb.pages;

import java.time.Duration;

import org.openqa.selenium.By;

import com.tmb.driver.DriverManager;
import com.tmb.enums.WaitStrategy;

public final class OrangeHRMLoginPage extends BasePage {

	private final By textboxUsername = By.name("username");
	private final By textboxPassword = By.name("password");
	private final By buttonLogin = By.xpath("//button[@type='submit']");

	public OrangeHRMLoginPage enterUsername(String username) throws InterruptedException {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		sendKeys(textboxUsername, username, WaitStrategy.PRESENCE);
		return this;

	}

	public OrangeHRMLoginPage enterPassword(String password) {
		sendKeys(textboxPassword, password, WaitStrategy.PRESENCE);
		return this;
	}

	public OrangeHRMHomePage clickLogin() {
		click(buttonLogin, WaitStrategy.CLICKABLE);
		return new OrangeHRMHomePage();
	}

	public String getTitle() {
		return getPageTitle();
	}

}
