Feature: Login Validation for CollegeBag Application

Scenario: Validate Login Page for Valid User
Given User invoke the chrome browser
And Navigate to the collegeBag Login Page
When User enter "email" and "password" into the fields
And Click on Signin Button
Then Dashboard is displayed for valid users
And User click on signout and close the browser

Scenario: Validate Login Page for Invalid User
Given User invoke the chrome browser
And Navigate to the collegeBag Login Page
When User enter email "admin@gmail.com" and password "admin@123" into the fields
And Click on Signin Button
Then error message is displayed 
And User close the browser

