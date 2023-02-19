package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage extends BaseTest {

	// All the locators of page
	@FindBy(xpath = "//*[text()='Login']")
	WebElement textLoginPage;

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement pass;

	@FindBy(tagName = "button")
	WebElement clicklogin;

	// Initialization of locators or variables
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Methods required to perform test steps

	/*
	 * Author : Vishal Kagawade
	 *  Date : 04 Feb 2023 
	 *  Description : This test method
	 * use to verify login page title Parameter return : String
	 */

	public String titleOfLoginPage() {
		return textLoginPage.getText();
	}

	/*
	 * Author : Vishal Kagawade 
	 * Date : 04 Feb 2023 
	 * Description : This test method
	 * use to verify login page url Parameter return : String
	 */

	public String urlOfLoginPage() {
		return driver.getCurrentUrl();
	}

	/*
	 * Author : Vishal Kagawade 
	 * Date : 04 Feb 2023 
	 * Description : This test method
	 * use to verify set usernamevalue
	 */

	public void setUsername(String usrname) {
		username.sendKeys(usrname);
	}

	/*
	 * Author : Vishal Kagawade 
	 * Date : 04 Feb 2023 
	 * Description : This test method
	 * use to setpasswordvalue
	 */

	public void setPassword(String password) {
		pass.sendKeys(password);
	}

	/*
	 * Author : Vishal Kagawade 
	 * Date : 04 Feb 2023 
	 * Description : This test method
	 * use to click on login button
	 */

	public void clickLoginBtn() {
		clicklogin.click();

	}

	/*
	 * Author : Vishal Kagawade 
	 * Date : 04 Feb 2023 
	 * Description : This test method use to get title of build 
	 * Parameter return : String
	 */

	public String getBuildTitle() {
		return driver.getTitle();
	}

}
