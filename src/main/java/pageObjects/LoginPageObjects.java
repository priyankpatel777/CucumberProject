package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	public WebDriver driver;
	public LoginPageObjects(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
     
   private  By username=By.id("input-userName");
   private  By password=By.id("input-password");
   private  By signin=By.id("button-submit");
   private By signout=By.id("nav-signout");
	
   
   public WebElement enter_Username() {
	   
	  return driver.findElement(username);
   	   }
   
   public WebElement enter_password() {
	   
		  return driver.findElement(password);
	   }
   
   public WebElement singIn_Button() {
	   
		  return driver.findElement(signin);
	   }
   
   public WebElement singOut_Button() {
	   
		  return driver.findElement(signout);
	   }
   
   
   
}
