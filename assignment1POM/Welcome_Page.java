package assignment1POM;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Welcome_Page extends Lead_BaseClass{

		public Welcome_Page(EdgeDriver driver)
		{
			this.driver=driver;
		}
		
		public MyHome_Page clickCRMSFA() {
			driver.findElement(By.linkText("CRM/SFA")).click();
			return new MyHome_Page(driver);
		}
	}

	

