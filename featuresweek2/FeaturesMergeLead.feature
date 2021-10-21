Feature: To merage two leads 
@regression	
Scenario: 

	 And Give the username 'demosalesmanager' 
	And Give the password 'crmsfa' 
	When Click on the login button 
	Then "Leaftaps - TestLeaf Automation Platform" page is displayed 
	When Click on "CRM/SFA" link 
	Then "My Home | opentaps CRM" page is displayed 
	When Click on "Leads" link 
	Then "My Leads | opentaps CRM" page is displayed 
	When Click on "Merge Leads" link
	Then "Merge Leads | opentaps CRM" page is displayed 
	When Click on fromLeadWidget link
	Then Switch to windowhandle1
	Then "Find Leads" page is displayed
	Given Get name in firstName 'jenni'
	When Click on findLeads button
	Then get the value of leadid1
	When Click on firstLeadId
	Then Switch to windowhandle0
	Then "Merge Leads | opentaps CRM" page is displayed
	When Click on ToLeadWidget
	When Get windowHandles
	Then Switch to windowHandle2
	Then "Find Leads" page is displayed
	Given Type the firstName 'sheriba'
	When Click on findLeads
	Given Click on firstLead1
	When Switch to windowHandle3
	Then "Merge Leads | opentaps CRM" page is displayed
	When Click on mergeLeadbutton link
	Then Accept the alert
	Then "View Lead | opentaps CRM" page is displayed
	When Click on "Find Leads" link
	Then "Find Leads | opentaps CRM" page is displayed
	Given Enter the leadid
	When Click on findLeads button
	Then "Find Leads | opentaps CRM" page is displayed
	When Get the value of records
	Then Verify the text matches
	
	
	
	
	
  