$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author : Prashanthi"
    }
  ],
  "line": 2,
  "name": "Login functionality testing",
  "description": "",
  "id": "login-functionality-testing",
  "keyword": "Feature"
});
formatter.before({
  "duration": 36125116100,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should not be able to login with invalid credentials",
  "description": "",
  "id": "login-functionality-testing;user-should-not-be-able-to-login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@logininvalid"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User enters email id \"prashanthi@gmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User enters password \"test123\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User clicks signin button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User should see the error message",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "prashanthi@gmail.com",
      "offset": 22
    }
  ],
  "location": "LoginStepdefinitions.user_enters_email_id(String)"
});
formatter.result({
  "duration": 2025759700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test123",
      "offset": 22
    }
  ],
  "location": "LoginStepdefinitions.user_enters_password(String)"
});
formatter.result({
  "duration": 143863600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefinitions.user_clicks_login_button()"
});
formatter.result({
  "duration": 1164637300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefinitions.user_should_see_the_error_message()"
});
formatter.result({
  "duration": 7016621000,
  "error_message": "java.lang.AssertionError: The following asserts failed:\n\texpected [Invalid email or password] but found [Invalid email or password.]\r\n\tat org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:43)\r\n\tat mindq.stepdefinitions.LoginStepdefinitions.user_should_see_the_error_message(LoginStepdefinitions.java:67)\r\n\tat ✽.Then User should see the error message(Login.feature:13)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 383668600,
  "status": "passed"
});
});