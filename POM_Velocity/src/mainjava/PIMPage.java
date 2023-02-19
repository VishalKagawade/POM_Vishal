package mainjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class PIMPage extends BaseTest {
	
	//All the locators of page
	
	@FindBy(xpath="//*[text()='PIM']")
	WebElement PimPageLink;
	
	@FindBy(xpath="//h6[text()='PIM']")
	WebElement PimPageText;
	
	@FindBy(xpath="//div[@class='oxd-form-row']//input[@class='oxd-input oxd-input--active']")
	WebElement findEmpId;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement clickSearch;
	
	@FindBy(xpath = "//*[@class='orangehrm-container']")
	WebElement searchedEid;
	
	
	
	// Initialization of locators or variables
	
	public PIMPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	// methods required to perform test steps
	
	/*Author : Vishal Kagawade
	 * Date : 06 Feb 2023
	 * Description : This test method use to click on PIM page
	 * 
	 */
	
	public void clickPimPageLink() {
		PimPageLink.click();
	}
	
	/*Author : Vishal Kagawade
	 * Date : 06 Feb 2023
	 * Description : This test method use to get PIM page title
	 * Return: String 
	 */
	public String getPimPagetitle() {
		return PimPageText.getText();
	}
	
	/*Author : Vishal Kagawade
	 * Date : 06 Feb 2023
	 * Description : This test method use to set EID 
	 */
	
	public void setPimPageEid(String Eid) {
		findEmpId.sendKeys(Eid);
	}
	
	

	/*Author : Vishal Kagawade
	 * Date : 06 Feb 2023
	 * Description : This test method use to click on search 
	 */
	
	public void clicksearchBtn() {
		clickSearch.click();
	}
	
	/*Author : Vishal Kagawade
	 * Date : 06 Feb 2023
	 * Description : This test method use to get EID from searched results
	 * Return : String
	 */
	
	public String getEidFromSearchedresults(String eid) {
		clickSearch.click();
		return searchedEid.findElements(By.xpath("//div[text()='"+eid+"']")).get(0).getText();
		
		
	}
	
	
	
	
	
	

}
