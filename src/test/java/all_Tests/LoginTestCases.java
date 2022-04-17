package all_Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import browser_Initialization.Base;




public class LoginTestCases extends Base{

	public WebDriver driver;
	
	@Test
	public void invoking_Browser() throws IOException{
		
		driver=browser_Initialization();
		driver.get(prop.getProperty("url"));
		
	}
	
	
	
	
	
}
