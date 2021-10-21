Feature: Creating a lead id 
@regression
Scenario: To test positive credential 
	Given Give the username 'demosalesmanager' 
	And Give the password 'crmsfa' 
	When Click on the login button 
	Then "Leaftaps - TestLeaf Automation Platform" page is displayed 
	When Click on "CRM/SFA" link 
	Then "My Home | opentaps CRM" page is displayed 
	When Click on "Create Lead" link 
	Then "Create Lead | opentaps CRM" page is displayed 
	Given Give the company 'testleaf' 
	And Give the first name 'priya' 
	And Give the last name 'S' 
	And Give the phone no '99' 
	When Click on the submit button 
	Then "View Lead | opentaps CRM" page is displayed 
	
@functional	@smoke
Scenario Outline: To give multiple outputs 
	Given Give the username <uname> 
	And Give the password <pswd> 
	When Click on the login button 
	Then "Leaftaps - TestLeaf Automation Platform" page is displayed 
	When Click on "CRM/SFA" link 
	Then "My Home | opentaps CRM" page is displayed 
	When Click on "Create Lead" link 
	Then "Create Lead | opentaps CRM" page is displayed 
	Given Give the company <cmpname> 
	And Give the first name <fname> 
	And Give the last name <lname> 
	And Give the phone no <phno> 
	When Click on the submit button 
	Then "View Lead | opentaps CRM" page is displayed
	
	Examples: 
		|uname|pswd|cmpname|fname|lname|phno|
		|'demosalesmanager'|'crmsfa'|'TestLeaf'|'Hari'|'R'|'99'|
		|'demosalesmanager'|'crmsfa'|'TestLeaf'|'Sheriba'|'T'|'99'|