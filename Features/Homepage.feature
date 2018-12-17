Feature: Home page is the first page of the application
all the functionalities are described in the below scenarios
	
	Scenario: This Scenrio is to validate the Home Display
	    Given launch the firefox browser and application link is opened and maximize it
	    |http://automationpractice.com|
	   When verify T-shirts clicked
	    Then verify num og checkboxes present and clicked
	    
	    
	   Scenario: This scenario is to validate dresses page and get sections
	       Given dresses page opened
	       When dresses page should be opened 
	       Then verify sections in dresses page