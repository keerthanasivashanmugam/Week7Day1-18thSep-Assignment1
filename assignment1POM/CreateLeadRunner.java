package assignment1POM;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class CreateLeadRunner extends Lead_BaseClass{
	
	@BeforeClass
	public void fileName () {
		fileName ="CreateLead";
	}

@Test(dataProvider="LeadDetails")
public void runCreateLead(String companyName, String firstName, String lastName, String phoneNumber) {
	   
		new Login_Page(driver).enterUsernamePassword("demosalesmanager", "crmsfa").clickLogin()
		.clickCRMSFA().clickLead().clickCreateLead()
		.enterCompanyNameFirstNameLastNamePhoneNo(companyName, firstName, lastName, phoneNumber)
		.clickCreate().getCompanyFirstLastName();
		

	}
	
}
