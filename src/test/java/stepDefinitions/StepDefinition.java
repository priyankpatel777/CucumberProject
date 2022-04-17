package stepDefinitions;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import browser_Initialization.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.CoursesObjects;
import pageObjects.LoginPageObjects;

@RunWith(Cucumber.class)
public class StepDefinition extends Base{
	
	public WebDriver driver;
	public LoginPageObjects lpo;
	public CoursesObjects course;
	
    @Given("^User invoke the chrome browser$")
    public void user_invoke_the_chrome_browser() throws IOException{
    	
    	driver=browser_Initialization();
    	
    	
    }
    
    @And("^Navigate to the collegeBag Login Page$")
    public void navigate_to_the_collegebag_login_page() throws Throwable {
    	
    	driver.get(prop.getProperty("url"));
    }


    @When("^User enter \"([^\"]*)\" and \"([^\"]*)\" into the fields$")
    public void user_enter_something_and_something_into_the_fields(String strArg1, String strArg2) throws Throwable {
    	
    	lpo=new LoginPageObjects(driver);
    	lpo.enter_Username().sendKeys(prop.getProperty("username"));
    	lpo.enter_password().sendKeys(prop.getProperty("password"));
    }
    
    @And("^Click on Signin Button$")
    public void click_on_signin_button() throws Throwable {
    	
    
    	lpo.singIn_Button().click();
    	
    }


    @Then("^Dashboard is displayed for valid users$")
    public void dashboard_is_displayed_for_valid_users() throws Throwable {
    	
    	WebElement dashboard=driver.findElement(By.xpath("//a[@id='nav-dashboard']"));
    	
    	Assert.assertTrue(dashboard.isDisplayed());
    	
    }

   
    
    @And("^User click on signout and close the browser$")
    public void user_click_on_signout_and_close_the_browser() throws Throwable {

    	
    	lpo.singOut_Button().click();
    	Thread.sleep(2000L);
    	driver.close();
    	
    }
    
    
    @When("^User enter email \"([^\"]*)\" and password \"([^\"]*)\" into the fields$")
    public void user_enter_email_something_and_password_something_into_the_fields(String username, String password) throws Throwable {
    	
    	lpo=new LoginPageObjects(driver);
    	lpo.enter_Username().sendKeys(username);
    	lpo.enter_password().sendKeys(password);
    }
    
    @Then("^error message is displayed$")
    public void error_message_is_displayed(){
    	
    	WebElement errormsg=driver.findElement(By.xpath("//p[contains(text(),'Invalid Cr')]"));
    	
    	Assert.assertEquals(errormsg.getText(), "Invalid Credentials");
    }

    
    @And("^User close the browser$")
    public void user_close_the_browser() throws InterruptedException{
    	
    	Thread.sleep(2000L);
    	driver.close();
    }
    @And("^students and courses tables are also displayed in Dashboard option$")
    public void students_and_courses_tables_are_also_displayed_in_dashboard_option(){
    	
    	String studenttab=driver.findElement(By.className("boxHeader1")).getText();
    	String coursestab=driver.findElement(By.xpath("//div[contains(text(),'Cour')]")).getText();
    	
    	Assert.assertEquals(studenttab, "Students");
    	Assert.assertEquals(coursestab, "Courses");
    }

    @When("^User click on Courses tab on to the page$")
    public void user_click_on_courses_tab_on_to_the_page() throws Throwable {
    	
    	course=new CoursesObjects(driver);
    	course.courses_Tab().click();
    	
    }

    @Then("^filter box and add button is displayed on the page$")
    public void filter_box_and_add_button_is_displayed_on_the_page() throws Throwable {
    	
    	WebElement filter=driver.findElement(By.id("input-filter"));
    	WebElement addbtn=driver.findElement(By.id("button-add"));
    	Assert.assertTrue(filter.isDisplayed());
    	Assert.assertTrue(addbtn.isDisplayed());
    }

    @And("^Course name also displayed along with acronym and actions options$")
    public void course_name_also_displayed_along_with_acronym_and_actions_options() throws Throwable {
    	
    	WebElement coursename=driver.findElement(By.xpath("//table[@class='table'] /thead/tr/th[2]"));
    	WebElement acronym=driver.findElement(By.xpath("//table[@class='table'] /thead/tr/th[3]"));
    	WebElement actions=driver.findElement(By.xpath("//table[@class='table'] /thead/tr/th[4]"));
    	
    	Assert.assertEquals(coursename.getText(), "COURSE NAME");
    	Assert.assertEquals(acronym.getText(), "ACRONYM");
    	Assert.assertEquals(actions.getText(), "ACTIONS");
    }
    
    
    @When("^User click on Add button on the page$")
    public void user_click_on_add_button_on_the_page(){
    	
    	course.add_Button().click();
    	
    }
    
    
    @Then("^New Courses Page is displayed$")
    public void new_courses_page_is_displayed(){
    	
    	WebElement newcourse=driver.findElement(By.cssSelector("div.boxHeader1"));
    	Assert.assertEquals(newcourse.getText(), "New Course");
    	
    }

    @When("^User enter coursename and acronym into the box$")
    public void user_enter_coursename_and_acronym_into_the_box(){
    	
    	course.courseName_Textbox().sendKeys("Master In Computer Application");
    	course.acronym_Textbox().sendKeys("MCA");
    	
    	
    }


    @And("^click on save button$")
    public void click_on_save_button() throws Throwable {
    	
    	course.save_Button().click();
    	
    }

    @Then("^new course should be added into the course list$")
    public void new_course_should_be_added_into_the_course_list() throws Throwable {
    	
    	driver.close();
    	
    }

    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
