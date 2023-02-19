package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PIMTest extends CommonTest{

	@Test(priority=3, groups= {"sanity","regression"})
	public void verifyPIMPageTitle() {
		
		PimPage.clickPimPageLink();
		String verifyPimPagetitle = PimPage.getPimPagetitle();
		Assert.assertEquals(verifyPimPagetitle, "PIM");
	}
	
	@Test(priority=4, groups= {"sanity","regression"})
	public void verifyEmpIDfromSearch() {
		PimPage.setPimPageEid("0038");
		PimPage.clicksearchBtn();
		String verifyEidFromSearch= PimPage.getEidFromSearchedresults("0038");
		Assert.assertEquals(verifyEidFromSearch, "0038");
	}
	
}
