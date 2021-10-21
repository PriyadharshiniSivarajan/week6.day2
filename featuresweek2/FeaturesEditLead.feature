Feature: To excecute edit lead



@smoke
Scenario: Test single scenario



Given Give the username 'demosalesmanager'
And Give the password 'crmsfa'
When Click on the login button 
Then "Leaftaps - TestLeaf Automation Platform" page is displayed
When Click on "CRM/SFA" link
Then "My Home | opentaps CRM" page is displayed
When Click on "Leads" link
Then "My Leads | opentaps CRM" page is displayed
When Click on "Find Leads" link
Then "Find Leads | opentaps CRM" page is displayed
When Click on phone
Given enter the phno '99'
When Click on findLeads button
When click on firstLeadid
Then "View Lead | opentaps CRM" page is displayed
When click on editbutton
Then "opentaps CRM" page is displayed
Given Add value to cmpname 'TCS'
When click on submitbutton
Then "View Lead | opentaps CRM" page is displayed

@functional
Scenario Outline: Test multiple inputs

Given Give the username <username>
And Give the password <pswd>
When Click on the login button 
Then "Leaftaps - TestLeaf Automation Platform" page is displayed
When Click on "CRM/SFA" link
Then "My Home | opentaps CRM" page is displayed
When Click on "Leads" link
Then "My Leads | opentaps CRM" page is displayed
When Click on "Find Leads" link
Then "Find Leads | opentaps CRM" page is displayed
When Click on phone
Given enter the phno <phno>
When Click on findLeads button
When click on firstLeadid
Then "View Lead | opentaps CRM" page is displayed
When click on editbutton
Then "opentaps CRM" page is displayed
Given Add value to cmpname <cmpname>
When click on submitbutton
Then "View Lead | opentaps CRM" page is displayed
Examples:
|username|pswd|phno|cmpname|
|'demosalesmanager'|'crmsfa'|'99'|'TCS'|
|'demosalesmanager'|'crmsfa'|'988'|'IBM'|