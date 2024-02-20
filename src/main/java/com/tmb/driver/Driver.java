package com.tmb.driver;

import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;

import com.tmb.enums.ConfigProperties;
import com.tmb.utils.PropertyUtils;

public final class Driver {
	private Driver() {

	}

	public static void initDriver() throws Exception {

		if (Objects.isNull(DriverManager.getDriver())) {

			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().get(PropertyUtils.get(ConfigProperties.URL));
			DriverManager.getDriver().manage().window().maximize();
		}
	}

	public static void quitDriver() {
		if (Objects.nonNull(DriverManager.getDriver())) {

			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}
}
