$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Home page is the first page of the application",
  "description": "all the functionalities are described in the below scenarios",
  "id": "home-page-is-the-first-page-of-the-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "This Scenrio is to validate the Home Display",
  "description": "",
  "id": "home-page-is-the-first-page-of-the-application;this-scenrio-is-to-validate-the-home-display",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "launch the firefox browser and application link is opened and maximize it",
  "rows": [
    {
      "cells": [
        "http://automationpractice.com"
      ],
      "line": 6
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "verify T-shirts clicked",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "verify num og checkboxes present and clicked",
  "keyword": "Then "
});
formatter.match({
  "location": "Dresses_Summerdresses.LaunchBrowser2(DataTable)"
});
formatter.result({
  "duration": 0,
  "error_message": "cucumber.runtime.AmbiguousStepDefinitionsException: ✽.Given launch the firefox browser and application link is opened and maximize it(Features/Homepage.feature:5) matches more than one step definition:\n  launch the firefox browser and application link is opened and maximize in Dresses_Summerdresses.LaunchBrowser2(DataTable)\n  launch the firefox browser and application link is opened and maximize it in TC2_ValidateTshirtsPage.LaunchBrowser1(DataTable)\n\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatch(RuntimeGlue.java:71)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:266)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:678)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TC2_ValidateTshirtsPage.TshirtsAvail()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 11,
  "name": "This scenario is to validate dresses page and get sections",
  "description": "",
  "id": "home-page-is-the-first-page-of-the-application;this-scenario-is-to-validate-dresses-page-and-get-sections",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "dresses page opened",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "dresses page should be opened",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "verify sections in dresses page",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_Dresses.Dresses()"
});
formatter.result({
  "duration": 364363110,
  "error_message": "java.lang.NullPointerException\r\n\tat com.TestCases.TC_Dresses.Dresses(TC_Dresses.java:17)\r\n\tat ✽.Given dresses page opened(Features/Homepage.feature:12)\r\n",
  "status": "failed"
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