package assignment1POM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class OpentapsCRM_Page extends Lead_BaseClass{
	
	public OpentapsCRM_Page(EdgeDriver driver) {
		this.driver=driver;
	}
	
	public ViewLead_Page clickCreateLead( ) {
		
		driver.findElement(By.name("submitButton")).click();
		return new ViewLead_Page(driver);
	}
	
	public OpentapsCRM_Page enterCompanyName(String companyName) {
		
		WebElement comapnyNameElement = driver.findElement(By.id("updateLeadForm_companyName"));
		String actualCompanyName = comapnyNameElement.getAttribute("value");
		System.out.println(actualCompanyName+"  : actual company name");
		comapnyNameElement.clear();
		comapnyNameElement.sendKeys(companyName);
		return this;
	}
	
}
