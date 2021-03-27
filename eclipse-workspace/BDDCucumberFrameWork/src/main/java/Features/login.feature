Feature: OpenCart Login Feature 
#Scenario: OpenCart Login Test Scenario

#DataDriven without example keyword:
#Given  user is present on Login Page 
#When  title of the page is Account Login 
#Then  user enters "m1000@gmail.com" and "ghost10" 
#Then  user click on login button 
#And  user is on Account Page 

#DataDriven with example keyword:
Scenario Outline: OpenCart Login Test Scenario

Given  user is present on Login Page 
When  title of the page is Account Login 
Then  user enters "<username>" and "<password>" 
Then  user click on login button 
Then  user is on Account Page 
Then close the browser

Examples: 
|username|password|
|m1000@gmail.com|ghost10|
|ghost@gmail.com|ghost10|

#Scenario: user is able to search an item
#Given user is already on Account Page
#When title of the page is My Account
#Then user search for an item 
#Then user clicks on search button
#And user is on ProductInfoPage
