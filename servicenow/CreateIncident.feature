Feature: Creating service now incident
@regression
Scenario Outline: To test positive credential


Then Switch to frame0
And Give the username <uname>
And Give the password <pswd>
When Click on login button 
Then "ServiceNow" page is displayed
Given Give "Incident" in filter navigator
When Click on Incidents
Then Switch to frame0
Then "Incidents | ServiceNow" page is displayed
When Click on New button
When Click on search in caller
Given Get the window handles
When Switch to window1
Then "Users | ServiceNow" page is displayed
When Click on the name that appears first
Then Switch to window0
Then Switch to frame0
Given Give the shortdescription "Incident updated"
Given Get the value of Incident number
Then Print the incident number
When Click on Submit button
Then switch to default content
Then Switch to frame0
When Search incident number
Then Get the screenshot

Examples:
|uname|pswd|
|'admin'|'emGlPLL8a3jJ'|
|'admin'|'emGlPLL8a3jJ'|
|'admin'|'emGlPLL8a3jJ'|
|'admin'|'emGlPLL8a3jJ'|
|'admin'|'emGlPLL8a3jJ'|





