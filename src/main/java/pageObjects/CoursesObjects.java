package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CoursesObjects {
	
	public WebDriver driver;
	public CoursesObjects(WebDriver driver) {
		
		this.driver=driver;
	}
	
	private By coursestab=By.id("nav-courses");
	private By addbtn=By.id("button-add");
	private By coursename=By.id("input-courseName");
	private By acronym=By.id("input-acronym");
	private By savebtn=By.id("button-save");
	
	
	public WebElement courses_Tab() {
		
		return driver.findElement(coursestab);
	}
	
	public WebElement add_Button() {
		
		return driver.findElement(addbtn);
	}

	public WebElement courseName_Textbox() {
		
		return driver.findElement(coursename);
	}

	public WebElement acronym_Textbox() {
	
	return driver.findElement(acronym);
	}
	public WebElement save_Button() {
	
	return driver.findElement(savebtn);
	}
}
