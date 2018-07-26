Feature: Espn Cricinfo StatsGuru
		This feature contains scenairos related to espn cricifno statsguru page

Scenario: Veify Navigation to statsguru page is successful
	Given Navigate to "http://espncricinfo.com"
	When Mouseover Stats header
	And Click on Statsguru
	Then "Welcome to the latest release of Statsguru, Cricinfo's searchable cricket statistics database" is displayed
	
Scenario: Verify Tests, ODIS, T20Is, All Test,ODI,T20I tabs are displayed
	Given Navigate to "http://espncricinfo.com"
	When Mouseover Stats header
	And Click on Statsguru
	Then "Tests" tab is displayed 
	And "ODIs" tab is displayed 
	And "T20Is" tab is displayed 
	And "All Test/ODI/T20I" tab is displayed
@edookati
Scenario: Submit a query for test batting records for team India
	Given Navigate to "http://espncricinfo.com"
	When Mouseover Stats header
	And Click on Statsguru
	Then "Tests" tab is displayed
	When Click on batting under tests 
	And select team "India"
	And Select opposition team "New Zealand" 
	And Select "home venue" check box of Home or away 
	And Select Host country "England"
	And Select ground "INDIA: Rajiv Gandhi International Stadium, Uppal, Hyderabad"   
	And send keys Starting date of From "24/07/2018" 
	And send keys of Starting date of to "28/07/2018"  
	And select season "2017/18" 
	And "Won match" checkBox is selected
	And "Series averages" radio buttion is selected from view format
	And Click on Submit Query
	Then Records related to India are displayed
	

Scenario: Submit a query for test batting records for a team Australia
	Given Navigate to "http://espncricinfo.com"
	When Mouseover Stats header
	And Click on Statsguru
	Then "Tests" tab is displayed
	When Click on batting under tests 
	And select team "Australia"
	And Select opposition team "New Zealand" 
	And Select "home venue" check box of Home or away 
	And Select Host country "England"
	And Select ground "INDIA: Rajiv Gandhi International Stadium, Uppal, Hyderabad"   
	And send keys Starting date of From "24/07/2018" 
	And send keys of Starting date of to "28/07/2018"  
	And select season "2017/18" 
	And "Won match" checkBox is selected
	And "Series averages" radio buttion is selected from view format
	And Click on Submit Query 
	And Click on Submit Query
	Then Records related to Australia are displayed
	
