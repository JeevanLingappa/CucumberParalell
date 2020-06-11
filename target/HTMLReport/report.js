$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/RadioButtonFeature.feature");
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