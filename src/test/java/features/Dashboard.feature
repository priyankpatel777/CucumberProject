Feature: Dashboard Validation for CollegeBag Application

Scenario: Validate the Dashboard for valid user
Given User invoke the chrome browser
And Navigate to the collegeBag Login Page
When User enter "email" and "password" into the fields
And Click on Signin Button
Then Dashboard is displayed for valid users
And students and courses tables are also displayed in Dashboard option
And User click on signout and close the browser
