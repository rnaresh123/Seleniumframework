package org.tmb.tests;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tmb.driver.DriverManager;

public final class HomepageTests extends BaseTest {
	private HomepageTests() {

	}
	/*
	 * Valitade whether the title containing Google Search or google search Validate
	 * whether the title is not null and the length of title is greater then 15 and
	 * less then 100 check for the links on page-->Testing mini Bytes-Youtube
	 * numbers of links displayed is exactly 10 or 15
	 */

	@Test
	public void test3() {
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
		String title = DriverManager.getDriver().getTitle();
		Assert.assertTrue(Objects.nonNull(title), "title is null");
		Assert.assertTrue(title.toLowerCase().contains("google search"));
		// Assert.assertTrue(title.toLowerCase().matches("//w.*" + "google search")); //
		// [a-z,A-Z,0-9]
		assertTrue(title.length() > 15);
		assertTrue(title.length() < 100);
		List<WebElement> elements = DriverManager.getDriver().findElements(By.xpath("//h3"));
		System.out.println(elements);
		Assert.assertEquals(elements.size(), 20);
		boolean isElementPresent = false;
		for (WebElement element : elements) {
			if (element.getText().contains("Testing Mini Bytes -YouTube")) {
				isElementPresent = true;
			}
		}
		Assert.assertTrue(isElementPresent, "Testing Mini Bytes is not found");
	}

}
