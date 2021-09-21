package assignment1POM;

import org.testng.annotations.Test;

public class DuplicateLeadRunner extends Lead_BaseClass {

	@Test()
	public void runDuplicateLead() throws InterruptedException {

		new Login_Page(driver).enterUsernamePassword("demosalesmanager", "crmsfa").clickLogin().clickCRMSFA()
				.clickLead().clickFindLeads().clickPhoneTab().enterPhoneNumber("98").clickFindLead().selectFirstLink()
				.clickDuplicateButton().clickCreateLead().getUpdatedCompanyName();
	}

}
