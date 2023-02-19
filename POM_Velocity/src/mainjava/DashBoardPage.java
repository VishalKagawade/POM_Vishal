package mainjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class DashBoardPage extends BaseTest {
	
	// All the loacators of page 
	@FindBy(xpath="//h6[text()='Dashboard']")
	WebElement titleOfDashboard;
	
	@FindBy(css=".oxd-userdropdown i")
	WebElement clickOnDropDown;
	
	@FindBy(xpath="//*[text()='Logout']")
	WebElement clickLogoutText;
	
	//Initialization of locators / variables 
	public DashBoardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//All method on page
	/*
	 * Author : Vishal Kagawade
	 * Date : 4 Feb 2023
	 * Description : This method use to verify title of dashboard page
	 * Parameter return : string
	 */
	public String titleOfDashboardPage() {
		return titleOfDashboard.getText();
	}
	
	/*
	 * Author : Vishal Kagawade
	 * Date : 4 Feb 2023
	 * Description : This method use to logout the user 
	 */
	public void clickOnLogout() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().refresh();
		clickOnDropDown.click();
		clickLogoutText.click();
		
	}

}
