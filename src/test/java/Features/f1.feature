Feature: Validation of ORM HRM Website

Background: pre requisite steps
Given user is on the login page "https://rpwebsite-trials6518.orangehrmlive.com/auth/login"


Scenario: Verify the Title of page
When checks for the Title
Then "OrangeHRM" is present as title

Scenario Outline: Verify the login feature for different login id and pwd
When user enter user name as "<uname>" and password as "<pwd>" 
And clicks on login button 
Then homepage is displayed with title as "Dashboard"
Examples:
|uname | pwd |
|Admin|zK43@JTckW|
