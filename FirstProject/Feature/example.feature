@examples
Feature: background test for common scenario


Scenario Outline:

Given User able to go home page
When Click on Singinbutton
And put user as "<username>"and password as "<password>"
And Click on submit button
Then login should be successully done
 Examples:
|username                	|Password|
|login_paratice@yahoo.com  	|sumon1765|
|sumonbd63@gmail.comn    	|sheik1765|


