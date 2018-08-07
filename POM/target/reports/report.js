$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login Form",
  "description": "I want to use this template for my feature file",
  "id": "login-form",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3343075168,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Login with username and password",
  "description": "",
  "id": "login-form;login-with-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag:"
    },
    {
      "line": 5,
      "name": "@execute"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I have a login form",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Username and password matches",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Login successfull",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.i_have_a_login_form()"
});
formatter.result({
  "duration": 867041276,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.username_and_password_matches()"
});
formatter.result({
  "duration": 149772699,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.login_successfull()"
});
formatter.result({
  "duration": 68369641,
  "status": "passed"
});
});