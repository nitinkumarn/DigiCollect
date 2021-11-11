package com.digicollect.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"classpath:FeatureFiles/login.feature","classpath:FeatureFiles/Newcompany.feature"},
glue= {"classpath:com.digicollect.automation.stepdef"},
plugin= {"html:target/cucumber_html_report"},
tags= {"@All"}
)
public class TestRunner {
	
	
	

}
