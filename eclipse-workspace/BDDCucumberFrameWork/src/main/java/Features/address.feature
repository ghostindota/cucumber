Feature: OpenCart Add Address Feature 
Scenario Outline: OpenCart User Adds Address Scenario
Given  user is present on Login Page 
When  title of the page is Account Login 
Then  user enters "<username>" and "<password>" 
Then  user click on login button 
Then  user is on Account Page 
Then user clicks on address book link
Then user is present on address book page
Then user double clicks on new address button
Then user enters "<name>" , "<lastname>" ,"<address>", "<city>", and "<postal code>" 
Then user selects "<country>" from dropdown list
Then he chooses "<zone>" from the list
Then user clicks on continue and check if new address is created
And close the browser 

Examples:
|username|password|name|lastname|address|city|postal code|country|zone|
|m1000@gmail.com|ghost10|mohammad|nouri|westminster|richmond|vt32f3|Afghanistan|Kabul|
|ghost@gmail.com|ghost10|ali|nouri|melbourn|sydney|g2t4st|United States|California|