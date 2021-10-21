Feature: To delete the lead id 

@regresssion
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
	Given Give the phone number '99' 
	When Click on findLeads button 
	Then Get the first leadId 
	When Click the first leadid 
	Then "View Lead | opentaps CRM" page is displayed
	When Click on delete button 
	Then "My Leads | opentaps CRM" page is displayed
	When Click on "Find Leads" link
	Then "Find Leads | opentaps CRM" page is displayed
	Given Give input id 
	When Click on find button 
	Then Get the record value
	
	
	
	