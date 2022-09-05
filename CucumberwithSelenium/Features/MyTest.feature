Here we update the feature file with 'Scenario Outline' and  'examples' syntax.

Feature: Reset functionality on login page of Application				


Scenario Outline: Verification of reset button with numbers of credential


Given Open the GoogleChrome and launch the application				


When Enter the UserID <Username>and Password <password>				


Then Reset the credential						

Examples:                      		

|UserID  |password         |		

|User1     |password1        |		

|User2     |password2        |		

|User3     |password3        |

