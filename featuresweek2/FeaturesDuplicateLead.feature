Feature: Create Duplicate Lead 

@sanity
Scenario: 

	And Give the username 'demosalesmanager' 
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
	Then Give the phone number1 '99'
	When Click on findLeads button
	When Click on firstLead link
	Then "View Lead | opentaps CRM" page is displayed
	When Click on duplicateLead button
	Then "Duplicate Lead | opentaps CRM" page is displayed 
	When Click on submitButton link
	Then "View Lead | opentaps CRM" page is displayed
	