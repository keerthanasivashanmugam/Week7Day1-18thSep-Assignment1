package assignment1POM;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Lead_BaseClass {

	public EdgeDriver driver;
	public String fileName=null;
	public static String leadIDDelete;
	public static String leadIDMerge;
	
	@DataProvider()
	public String[][] LeadDetails() throws IOException   {
	return readingDataFromExcel1.readExcel1(fileName);
	}
	
	@BeforeMethod
	public void preCondition() {
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
}
