Feature: Updating service now incident
@progressive @smoke
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
When Select dropdown urgency as high
When Select dropdown state as inprogress
When Click update button
Then Check if status of "//td[text()='3 - Moderate']" is 'Moderate'
Then Check if status of "//td[text()='In Progress']" is 'In Progress'


Examples:
|uname|pswd|Incident|
|'admin'|'emGlPLL8a3jJ'|'INC0010021'|
|'admin'|'emGlPLL8a3jJ'|'INC0010022'|


