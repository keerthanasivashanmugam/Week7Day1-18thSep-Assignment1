package assignment1POM;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class ViewLead_Page extends Lead_BaseClass {

	public ViewLead_Page(EdgeDriver driver) {
		this.driver = driver;
	}

	public ViewLead_Page getCompanyFirstLastName() {

		boolean displayed1 = driver.findElement(By.id("viewLead_companyName_sp")).isDisplayed();
		boolean displayed2 = driver.findElement(By.id("viewLead_firstName_sp")).isDisplayed();
		boolean displayed3 = driver.findElement(By.id("viewLead_lastName_sp")).isDisplayed();

		Assert.assertTrue(displayed1);
		Assert.assertTrue(displayed2);
		Assert.assertTrue(displayed3);

		String text1 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String leadID = text1.replaceAll("[^0-9]", "");
		System.out.println(leadID + " : Created Lead ID");
		return this;
	}

	public OpentapsCRM_Page clickEdit() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.linkText("Edit")).click();
		return new OpentapsCRM_Page(driver);
	}

	public ViewLead_Page getUpdatedCompanyNameToPrint() throws InterruptedException {
		Thread.sleep(7000);
		String updatedComapnyName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(updatedComapnyName + "  : updated company name");
		return this;
	}

	public OpentapsCRM_Page clickDuplicateButton() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new OpentapsCRM_Page(driver);
	}

	public ViewLead_Page getUpdatedCompanyName() throws InterruptedException {
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		String replaceAll = text.replaceAll("[^0-9 ()]", "");
		System.out.println(replaceAll + " Created Duplicate Lead ID");
		return this;
	}

	public MyLead_Page clickDeleteteButton() {

		String leadID = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		leadIDDelete = leadID.replaceAll("[^0-9]", "");
		driver.findElement(By.linkText("Delete")).click();
		return new MyLead_Page(driver);
	}

}
