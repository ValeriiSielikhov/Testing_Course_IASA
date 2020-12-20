Feature: Video play 

   Scenario: open ABOUT tab
     Given I am on the EPAM site 
     When I click on ABOUT tab
     Then I should see ABOUT page
     
		Scenario: play
     Given I am on the ABOUT page
     When I click on video 
     Then EPAM: Engineering the Future video  playback