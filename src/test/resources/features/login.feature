#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login to CNET and do deployment order flow

Scenario: Login to Service Now application and perform End to End order flow

	Given User launch the application url
	Then Switch to mainframeone
	When Login Page title is ServiceNow
	Then User enters the username and password
	Then User clicks on login button
	Then User is on homepage
	Then User navigates to Filter Navigator search box and searches the Order Guides
	Then Switch to mainframetwo
	Then User clicks on the Order Guides link
	And User clicks on the End to End Deployment link
	Then User clicks on the Try It button.
	Then Verify the user is in Describe Needs page
	And Switch to mainframethree
	And User selects the project
	And User selects the Environment Information and Environment Type
	And User selects the Environment Name
	And User selects the Cloud Platform
	And User selects the existing key pair radio button and enter the keypair
	Then User selects the containerized platform for web server and container platform and Application type
	Then User selects the containerized platform for Database server and container platform
	And Click Choose options button
	Then Verify user is in webserver deployment page
	And User entered service Requested
	And user entered cluster name
	And user entered operating system to be installed and server size requested
	And User selects the additional storage
	And user enters the Storage type and Bucket name and EC2 Mount path
	And User selects the  use existing network and enters the network
	And user selects the security group and enters the security group
	And user selects the Monitoring
	And User selects the Auto Scaling
	And User selects the Metric Type and Units
	Then user clicks the Next tab button
	Then Verify the Database environment tab is displayed
	And user selects the service Requested
	And user enter the cluster name
	And user enters the server size requested and operating system installed
	And user selects the additional storage for database
	And user enters the Storage type and Bucket name and EC2 Mount path
	And User selects the  use existing network and enters the network
	And user selects the security group and enters the security group
	And user selects the Monitoring
	And User selects the Auto Scaling
	And User selects the Metric Type and Units
	Then user clicks the Next tab button
	Then verify the Application deployment tab is displayed
	And user enters the Application Name
	And user selects the Build from repo radio button
	Then User clicks checkout button
	Then verify the user is in shopping cart page
	Then user click order now button
	Then verify the user is in order status page
	And click on request number link
	And verify the request is approved
	Then User clicks on first RITM Number 
	And click on Approvers tab
	Then Click on Requested link against qa user and click approve button-repeats 4 times
	And verify the state is changed to closed complete
	Then user click on back arrow icon
	And click on second RITM number
	And click on Approvers tab
	Then Click on Requested link against qa user and click approve button-repeats 4 times
	And verify the state is changed to closed complete
	Then user click on back arrow icon
	And click on Third RITM number
	And click on Approvers tab
	Then Click on Requested link against qa user and click approve button-repeats 4 times
	And verify the state is changed to closed complete
	Then user clicks the filter navigator and enters the cmdb_ci_server and press enter
	Then user verify the webserver is displayed
	Then user verify the Database server is displayed
	Then User verify the application server is displayed
	Then User clicks logout button
	Then user click on back arrow icon
	
	
	
	
	
	
	
	
	
	
	
	
	