$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/CheckBoxFeature.feature");
formatter.feature({
  "name": "Validation of Check Box demo on seleniumEasy website",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CheckBox"
    }
  ]
});
formatter.scenario({
  "name": "Single check box demo",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CheckBox"
    },
    {
      "name": "@MultiCheckBox"
    },
    {
      "name": "@Parallel"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on SeleniumEasy website",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.user_is_on_seleniumeasy_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on StartPracticing",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.click_on_startpracticing()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on \"Check Box Demo\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.click_on_something(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select check box under Single check box dem0 section",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.select_check_box_under_single_check_box_dem0_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get \"Success - Check box is checked\" message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.user_should_get_something_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Multiple Check box demo CheckAll",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CheckBox"
    },
    {
      "name": "@MultiCheckBox"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on SeleniumEasy website",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.user_is_on_seleniumeasy_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on StartPracticing",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.click_on_startpracticing()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on \"Check Box Demo\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.click_on_something(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check all under Multiple check box demo section",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.check_all_under_Multiple_check_box_demo_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "all option should be checked",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.all_option_should_be_checked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see the Uncheck button in enabled state",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.user_should_see_the_Uncheck_button_in_enabled_state()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Multiple Check box demo UnCheck All",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CheckBox"
    },
    {
      "name": "@MultiCheckBox"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on SeleniumEasy website",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.user_is_on_seleniumeasy_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on StartPracticing",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.click_on_startpracticing()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on \"Check Box Demo\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.click_on_something(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check all under Multiple check box demo section",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.check_all_under_Multiple_check_box_demo_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on uncheck all button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.click_on_uncheck_all_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "all option should be Unchecked",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.all_option_should_be_unchecked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see the checkall button in enabled state",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.user_should_see_the_checkall_button_in_enabled_state()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Multiple Check box demo UnCheck All with check all button validation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CheckBox"
    },
    {
      "name": "@MultiCheckBox"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on SeleniumEasy website",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.user_is_on_seleniumeasy_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on StartPracticing",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.click_on_startpracticing()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on \"Check Box Demo\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.click_on_something(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check all under Multiple check box demo section",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.check_all_under_Multiple_check_box_demo_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "unchecks option1 in the checkbox list",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.unchecks_option1_in_the_checkbox_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "button should change as checkAll",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.button_should_change_as_checkall()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/RadioButtonFeature.feature");
formatter.feature({
  "name": "Validation of Radio Buttons demo on seleniumEasy website",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@RadioButton"
    }
  ]
});
formatter.scenario({
  "name": "Single Radio button demo",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RadioButton"
    },
    {
      "name": "@Parallel"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on SeleniumEasy website",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.user_is_on_seleniumeasy_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on StartPracticing",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.click_on_startpracticing()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on \"Radio Buttons Demo\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.click_on_something(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on \"Male\" radio button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.clicks_on_something_radio_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on getCheckedValue button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.clicks_on_getcheckedvalue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get  message with \"Radio button \u0027Male\u0027 is checked\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.StepDefination01.user_should_get_message_with_something(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});