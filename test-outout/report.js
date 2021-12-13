$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Features/Amazon.feature");
formatter.feature({
  "line": 1,
  "name": "Login to Amazon",
  "description": "",
  "id": "login-to-amazon",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "User login to amazon",
  "description": "",
  "id": "login-to-amazon;user-login-to-amazon",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is on amazon login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enter username as \"email_id\" and password as \"password\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "amazonStepDefinitions.user_is_on_amazon_login_page()"
});
formatter.result({
  "duration": 31827771500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "email_id",
      "offset": 24
    },
    {
      "val": "password",
      "offset": 51
    }
  ],
  "location": "amazonStepDefinitions.user_enter_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 1134169200,
  "status": "passed"
});
formatter.match({
  "location": "amazonStepDefinitions.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 40113934100,
  "status": "passed"
});
});