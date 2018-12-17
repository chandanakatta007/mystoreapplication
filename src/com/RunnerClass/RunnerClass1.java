package com.RunnerClass;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
 features="Features/CaseStudy.feature",
 glue={"com.EmailIdTestcase"},
 plugin={"html:TestResults","json:jsonResult/cucumber1.json"},
 monochrome=true
 		)
public class RunnerClass1 {
	
}
