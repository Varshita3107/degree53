@tag 
Feature: Navigate to thetrainline website and search trains details for booking.Fill in all the fields in search criteria.
 
Background: 
	Given that I navigates to "www.thetrainline.com" website in Chrome browser 
	
Scenario: To search the trains booking details 
	When I enter "Manchester Airport" into the From field 
	And I enter "London Bridge" into the To field 
	And I select Return option 
	And I enter today's date into OUT date field 
	And I enter RETURN date of 3 days later from today’s date 
	And I enter departure and arival time 
	And I select railcards 
	Then I should redirected to trainline booking results after submitting details
	