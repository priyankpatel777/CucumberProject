package browser_Initialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public WebDriver driver;
	public FileInputStream fis;
	public Properties prop;
	
	public WebDriver browser_Initialization() throws IOException {
		
		fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\utils\\data.properties");
		prop=new Properties();
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.contains("chrome")) {
			
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\utils\\chromedriver.exe");
		driver=new ChromeDriver();
		
		}
		
		else if(browserName.contains("firefox")) {
			
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\main\\java\\utils\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
			
		else if(browserName.contains("edge")) {
			
			System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"\\src\\main\\java\\utils\\msedgedriver.exe");
			driver=new EdgeDriver();
			
			}
			
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		return driver;
		
		
	}
	
	
	
	
	
	
}
