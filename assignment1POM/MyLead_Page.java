package assignment1POM;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class MyLead_Page extends Lead_BaseClass{

		
		public MyLead_Page(EdgeDriver driver) {
			this.driver=driver;
		}

		public CreateLead_Page clickCreateLead() {
			driver.findElement(By.linkText("Create Lead")).click();
			return new CreateLead_Page(driver);
		}

		public MergeLead_Page  clickMergeLeads() {
			
			driver.findElement(By.linkText("Merge Leads")).click();
			return new MergeLead_Page(driver);
		}

		public FindLead_Page  clickFindLeads() {
			
			driver.findElement(By.linkText("Find Leads")).click();
			return new FindLead_Page(driver);
		}

	}


