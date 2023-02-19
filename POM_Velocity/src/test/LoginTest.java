package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test(priority = 0, groups = { "Sanity", "regression" })
	public void verifyTitleOfLoginPage() {
		String verifyTitleOfLoginPage = loginPage.titleOfLoginPage();
		Assert.assertEquals(verifyTitleOfLoginPage, "Login");
	}

	@Test(priority = 1, groups = { "Sanity", "regression" })
	public void verifyUrlOfloginPage() {
		String verifyUrlOfLoginPage = loginPage.urlOfLoginPage();
		Assert.assertEquals(verifyUrlOfLoginPage, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(priority = 2, groups = { "Sanity", "regression" })
	public void verifyLoginWithCorrectCredentials() {
		loginPage.setUsername("Admin");
		loginPage.setPassword("admin123");
		loginPage.clickLoginBtn();
		String verifyTitleOfdashboard = dashboard.titleOfDashboardPage();
		Assert.assertEquals(verifyTitleOfdashboard, "Dashboard");
	}

	@Test(priority = -1, groups = { "Sanity", "regression" })
	public void verifyBuildTitle() {
		String verifyTitleOfBuild = loginPage.getBuildTitle();
		Assert.assertEquals(verifyTitleOfBuild, "OrangeHRM");

	}

}
