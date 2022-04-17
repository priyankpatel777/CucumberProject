Feature: Courses tab validation in CollegeBag Application

Scenario: Validate Courses tab for Valid User
Given User invoke the chrome browser
And Navigate to the collegeBag Login Page
When User enter "email" and "password" into the fields
And Click on Signin Button
Then Dashboard is displayed for valid users
When User click on Courses tab on to the page
Then filter box and add button is displayed on the page
And Course name also displayed along with acronym and actions options
And User click on signout and close the browser


Scenario: Validate Add button into courses tab for Valid User
Given User invoke the chrome browser
And Navigate to the collegeBag Login Page
When User enter "email" and "password" into the fields
And Click on Signin Button
Then Dashboard is displayed for valid users
When User click on Courses tab on to the page
Then filter box and add button is displayed on the page
When User click on Add button on the page
Then New Courses Page is displayed
When User enter coursename and acronym into the box 
And click on save button
Then new course should be added into the course list

