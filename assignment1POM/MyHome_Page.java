package assignment1POM;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class MyHome_Page extends Lead_BaseClass{

		public  MyHome_Page(EdgeDriver driver)
		{
			this.driver=driver;
		}
		
		public MyLead_Page  clickLead() {
			
			driver.findElement(By.linkText("Leads")).click();
			return new MyLead_Page(driver);
		}
		
	}

	

