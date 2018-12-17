package com.RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features="Features",
glue={"com.TestCases"},
plugin={"html:TestResult","json:jsonResult/cucumber.json"},
monochrome=true
		)
public class RunnerClass {


}

