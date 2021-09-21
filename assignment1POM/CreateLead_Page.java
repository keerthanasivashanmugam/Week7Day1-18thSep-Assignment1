package assignment1POM;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateLead_Page extends Lead_BaseClass{

	public CreateLead_Page(EdgeDriver driver) {
		this.driver=driver;
	}

	public CreateLead_Page enterCompanyNameFirstNameLastNamePhoneNo(String companyName, String firstName,String lastName,String phoneName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoneName);
		return this;
	}
	
	public ViewLead_Page clickCreate() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLead_Page(driver);
		}

	
}
