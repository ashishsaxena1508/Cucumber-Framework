Feature: Free CRM Login feature

#Scenario: Free CRM login test scenario

#Given User is already on Login page
#When title of page is Free CRM
#Then User enters "ashish1508" and "abc@123"
#And User clicks on Login button
#And User is on home page

# with Examples keyword

Scenario Outline: Free CRM login test scenario

Given User is already on Login page
When title of page is Free CRM
Then User enters "<username>" and "<password>"
And User clicks on Login button
And User is on home page

Examples: 
 | username   |    | password  | 
 | ashish1508 |    | abc@123   |
 | tom        |    |  abc456   |

