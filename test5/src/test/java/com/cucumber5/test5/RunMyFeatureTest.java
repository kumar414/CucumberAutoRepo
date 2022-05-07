package com.cucumber5.test5;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		//dryRun=true,
	//	tags= "@Smoke or @Regression",
		features = {"src/test/resources/features"},
	//	glue= {"src/test/java/cucumberpractise"},
		plugin= {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report.json",
	//			"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
				}
		)

public class RunMyFeatureTest {

}
