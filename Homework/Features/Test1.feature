Feature: Search tab

   Scenario Outline: Search on site
     Given I am on the EPAM site
     When I enter word "<word>"
     Then I should see result "<result>"

     Examples:
       |    word    | result     | 
       | AUTOMATION | AUTOMATION |
       | BLOCKCHAIN | BLOCKCHAIN |