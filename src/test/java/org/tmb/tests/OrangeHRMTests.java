package org.tmb.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tmb.pages.OrangeHRMLoginPage;

public final class OrangeHRMTests extends BaseTest {
	private OrangeHRMTests() {

	}

	@Test
	public void loginLogoutTest() throws InterruptedException {
		String title = new OrangeHRMLoginPage().enterUsername("Admin").enterPassword("admin123").clickLogin()

				.clickWelcome().clickLogout().getTitle();
		Thread.sleep(4000);
		Assert.assertEquals(title, "OrangeHRM");

	}
}
