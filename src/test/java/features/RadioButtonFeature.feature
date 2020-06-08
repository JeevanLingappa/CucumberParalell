@RadioButton
Feature: Validation of Radio Buttons demo on seleniumEasy website

@Parallel
  Scenario: Single Radio button demo
    Given user is on SeleniumEasy website
    And click on StartPracticing 
	When click on "Radio Buttons Demo"
	And clicks on "Male" radio button
	And clicks on getCheckedValue button 
	Then user should get  message with "Radio button 'Male' is checked"