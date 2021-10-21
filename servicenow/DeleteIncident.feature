Feature: Deleting service now incident
@regressive
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
Given Give the incident number <Incident>
Then "Incidents | ServiceNow" page is displayed
Given Click on the incident number
When Click on delete button
Then Click ok button
Given Give the incident number <Incident>
Then "Incidents | ServiceNow" page is displayed
Then Check for records of incident

Examples:
|uname|pswd|Incident|
|'admin'|'emGlPLL8a3jJ'|'INC0010013'|
|'admin'|'emGlPLL8a3jJ'|'INC0010019'|