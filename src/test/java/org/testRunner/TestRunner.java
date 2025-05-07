package org.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\USER\\eclipse-worknew\\Maven11AMSample\\Feature\\cucumber.feature",
glue="org.stepDefinition",dryRun = false,monochrome = true,plugin = {"pretty",
		"html:C:\\Users\\USER\\eclipse-worknew\\Maven11AMSample\\target\\newhtml.html",
		"json:C:\\Users\\USER\\eclipse-worknew\\Maven11AMSample\\target\\newjson.json",
		"junit:C:\\Users\\USER\\eclipse-worknew\\Maven11AMSample\\target\\newxml.xml"
})
public class TestRunner {

}
