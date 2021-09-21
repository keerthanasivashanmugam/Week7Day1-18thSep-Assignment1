package assignment1POM;
import org.testng.annotations.Test;


public class DeleteteLeadRunner extends Lead_BaseClass{
	
	@Test()
	public void runDeleteLead() throws InterruptedException      {
		
		new Login_Page(driver).enterUsernamePassword("demosalesmanager","crmsfa").clickLogin()
		.clickCRMSFA().clickLead().clickFindLeads().clickPhoneTab().enterPhoneNumber("99").clickFindLead().selectFirstLink()
		.clickDeleteteButton().clickFindLeads().enterDeletedIDClickFindLeads().verifyDeleteIDNotDisplayed();
	}
	
}
