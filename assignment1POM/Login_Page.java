package assignment1POM;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;



public class Login_Page extends Lead_BaseClass{

			public Login_Page(EdgeDriver driver) {
				this.driver=driver;
			}
			
			public Login_Page enterUsernamePassword(String userName, String password) {
				driver.findElement(By.id("username")).sendKeys(userName);
				driver.findElement(By.id("password")).sendKeys(password);
				return this;
			}
			
			public Welcome_Page clickLogin() {
				driver.findElement(By.className("decorativeSubmit")).click();
				return new Welcome_Page(driver);
			}
		}


