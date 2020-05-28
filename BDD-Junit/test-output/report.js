$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/ALL SELENIUM/WorkSpace/WeekEnd/BDD-Junit/src/main/java/com/BDD_Junit_Feature/CreateOrganization.feature");
formatter.feature({
  "line": 1,
  "name": "Organization feature test",
  "description": "",
  "id": "organization-feature-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "verify user is able to create Organization",
  "description": "",
  "id": "organization-feature-test;verify-user-is-able-to-create-organization",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enters username and password and click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "user click on Organization link",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user click on Create organization button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters necessary details and click on save button",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateOrganization.user_is_in_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateOrganization.user_enters_username_and_password_and_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateOrganization.user_click_on_Organization_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateOrganization.user_click_on_Create_organization_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateOrganization.user_enters_necessary_details_and_click_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
});