Feature: Mercury page -> Testing Register link functionlaity
Scenario: Check Register link on page 
    Given I Open Mercury Flight Application
    When Click on the Register link in the Home page
    Then Register page should displayed 
 		And Close the browser
 		
Scenario Outline: Testing the user Registration
Given I Open Mercury Flight Application
When Click on the Register link in the Home page
And Enter "<username>" ,"<password>" and "<confirmPassword>"
Then I verify the "<username>" created sucessfully
And Close the browser

Examples:
   	  | username  |password | confirmPassword |
  		| test123   |  test   | test            |
   	  |test789    |cucumber |cucumber         | 	