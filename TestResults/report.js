$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/CaseStudy.feature");
formatter.feature({
  "line": 1,
  "name": "This casestudy is by using BDD frameworks for http://automationpractice.com/",
  "description": "",
  "id": "this-casestudy-is-by-using-bdd-frameworks-for-http://automationpractice.com/",
  "keyword": "Feature"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "launch the firefox browser and application link is opened and maximize it",
  "rows": [
    {
      "cells": [
        "http://automationpractice.com"
      ],
      "line": 4
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "EmailCaseStudy.LaunchBrwsr(DataTable)"
});
formatter.result({
  "duration": 16405217154,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should be able to register using a valid email address",
  "description": "",
  "id": "this-casestudy-is-by-using-bdd-frameworks-for-http://automationpractice.com/;user-should-be-able-to-register-using-a-valid-email-address",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "verify signin link is present in homepage if exists click and navigate to page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "verify  email address  under create an account and enter valid emailid",
  "rows": [
    {
      "cells": [
        "chandu@gmail.com"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#And if email id entered is already exist it should display error message"
    },
    {
      "line": 10,
      "value": "#And if email id entered and doesnot exist then create account"
    }
  ],
  "line": 11,
  "name": "verify you entered into your personal information page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "verify \u0027First name\u0027 \u0027Last name\u0027 and \u0027Password\u0027",
  "rows": [
    {
      "cells": [
        "chandu"
      ],
      "line": 13
    },
    {
      "cells": [
        "k"
      ],
      "line": 14
    },
    {
      "cells": [
        "123456"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "verify \u0027signup for newsletter\u0027and \u0027Receive special offers from our partners\u0027 buttons present and click on the desired button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "verify in \u0027YOUR ADDRESS\u0027\u0027First name\u0027 \u0027Last name\u0027 \u0027Company\u0027 \u0027Address\u0027 \u0027Address (Line 2)\u0027 \u0027City\u0027 \u0027Zip/Postal Code\u0027 \u0027Additional information\u0027 \u0027Home phone\u0027 \u0027Mobile phone\u0027 \u0027Assign an address alias for future reference\u0027 textboxes should present and enter text",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "verify \u0027state\u0027 and \u0027country\u0027 dropdown is present and enter select if thet exist",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "verify \u0027Register\u0027 button is present and submit after filling all details",
  "keyword": "And "
});
formatter.match({
  "location": "EmailCaseStudy.SignIn()"
});
formatter.result({
  "duration": 2496991556,
  "status": "passed"
});
formatter.match({
  "location": "EmailCaseStudy.emailId(DataTable)"
});
formatter.result({
  "duration": 5103271087,
  "status": "passed"
});
formatter.match({
  "location": "EmailCaseStudy.resigtrationPage()"
});
formatter.result({
  "duration": 5308017946,
  "status": "passed"
});
formatter.match({
  "location": "EmailCaseStudy.Fields(DataTable)"
});
formatter.result({
  "duration": 513374120,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});