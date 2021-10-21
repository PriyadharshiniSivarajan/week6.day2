Feature: Assigning service now incident
@sanity @smoke
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
Given Give the incident number <Incidnet>
Then "Incidents | ServiceNow" page is displayed
Given Click on the incident number
When Click on Assignment group search button
When Get the window handles
Then Switch to window1
Then "Groups | ServiceNow" page is displayed
When Click on next page arrow
When Click on software
Then Switch to window0
Then Switch to frame0
Given Update the work notes 'Assigned'
When Click update button
Then "Incidents | ServiceNow" page is displayed


Examples:
|uname|pswd|Incidnet|
|'admin'|'emGlPLL8a3jJ'|'INC0010021'|
|'admin'|'emGlPLL8a3jJ'|'INC0010022'|
