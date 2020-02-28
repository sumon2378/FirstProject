package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features="Feature",
		glue="com.stefdef"
		
		
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
