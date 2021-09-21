package assignment1POM;

import org.testng.annotations.Test;


public class MergeLeadRunner extends Lead_BaseClass{
	


	@Test()
	public void runMergeLead() throws InterruptedException    {
		
		new Login_Page(driver).enterUsernamePassword("demosalesmanager", "crmsfa").clickLogin().clickCRMSFA()
		.clickLead().clickMergeLeads().clickFromLeadLP().enterFirstNameClickFindLeadsClickLinkID()
		.clickToLeadLP().enterLastNameClickFindLeadsClickLinkID().clickMergeLeadClickAlertOK()
		.clickFindLeadMerge().enterLeadIDClickFindLeads().verifyMergedLeadID();
	}
	
}
