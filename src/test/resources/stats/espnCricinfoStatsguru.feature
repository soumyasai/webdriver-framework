Feature: Espn Cricinfo StatsGuru
		This feature contains scenairos related to espn cricifno statsguru page

Scenario: Veify Navigation to statsguru page is successful
	Given Navigate to "http://espncricinfo.com"
	When Mouseover Stats header
	And Click on Statsguru
	Then "Welcome to the latest release of Statsguru, Cricinfo's searchable cricket statistics database" is displayed
@edookati	
Scenario: Verify Tests, ODIS, T20Is, All Test,ODI,T20I tabs are displayed
	Given Navigate to "http://espncricinfo.com"
	When Mouseover Stats header
	And Click on Statsguru
	Then "Tests" tab is displayed 
	And "ODIs" tab is displayed 
	And "T20Is" tab is displayed 
	And "All Test/ODI/T20I" tab is displayed

Scenario: Submit a query for test batting records for a team India
	Given Navigate to "http://espncricinfo.com"
	When Mouseover Stats header
	And Click on Statsguru
	Then "Tests" tab is displayed
	When Click on batting under tests 
	And select team "India"
	And Click on Submit Query
	Then Records related to India are displayed
	
	
Scenario: Submit a query for test batting records for a team Australia
	Given Navigate to "http://espncricinfo.com"
	When Mouseover Stats header
	And Click on Statsguru
	Then "Tests" tab is displayed
	When Click on batting under tests 
	And select team "Australia"
	And Click on Submit Query
	Then Records related to Australia are displayed