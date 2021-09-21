package assignment1POM;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class MergeLead_Page extends Lead_BaseClass {

	public MergeLead_Page(EdgeDriver driver) {
		this.driver=driver;
	}
	
	public FindLeadLookUp_Page  clickFromLeadLP() {
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		return new FindLeadLookUp_Page(driver);
	}

public FindLeadLookUp_Page  clickToLeadLP() {
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		return new FindLeadLookUp_Page(driver);
	}
	public FindLead_Page  clickMergeLeadClickAlertOK() {
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
		return new FindLead_Page(driver);
	}


	
	
	
}
