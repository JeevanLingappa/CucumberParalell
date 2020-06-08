@CheckBox
Feature: Validation of Check Box demo on seleniumEasy website

@MultiCheckBox @Parallel 
  Scenario: Single check box demo
    Given user is on SeleniumEasy website
    And click on StartPracticing 
	When click on "Check Box Demo"
	And select check box under Single check box dem0 section
	Then user should get "Success - Check box is checked" message
	
@MultiCheckBox	
  Scenario: Multiple Check box demo CheckAll
    Given user is on SeleniumEasy website
    And click on StartPracticing 
	When click on "Check Box Demo"
	And check all under Multiple check box demo section
	Then all option should be checked 
	And user should see the Uncheck button in enabled state	
	
@MultiCheckBox	
  Scenario: Multiple Check box demo UnCheck All
    Given user is on SeleniumEasy website
    And click on StartPracticing 
	When click on "Check Box Demo"
	And check all under Multiple check box demo section
	And click on uncheck all button
	Then all option should be Unchecked 
	And user should see the checkall button in enabled state 
	
@MultiCheckBox	
  Scenario: Multiple Check box demo UnCheck All
    Given user is on SeleniumEasy website
    And click on StartPracticing 
	When click on "Check Box Demo"	
	And check all under Multiple check box demo section
	And unchecks option1 in the checkbox list
	Then button should change as checkAll	
	
	