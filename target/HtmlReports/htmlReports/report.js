$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/hooksDemo/hooksDemo.feature");
formatter.feature({
  "name": "Check login fonctionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "runnerHooks.HooksSteps.user_is_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "runnerHooks.HooksSteps.user_enters_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login botton",
  "keyword": "And "
});
formatter.match({
  "location": "runnerHooks.HooksSteps.clicks_on_login_botton()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user navigated to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "runnerHooks.HooksSteps.user_navigated_to_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "runnerHooks.HooksSteps.user_is_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "runnerHooks.HooksSteps.user_enters_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login botton",
  "keyword": "And "
});
formatter.match({
  "location": "runnerHooks.HooksSteps.clicks_on_login_botton()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user navigated to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "runnerHooks.HooksSteps.user_navigated_to_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.close()\" because \"this.driver\" is null\r\n\tat runnerHooks.HooksSteps.teardown(HooksSteps.java:40)\r\n",
  "status": "failed"
});
});