package com.BDD_Juni_Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\ALL SELENIUM\\WorkSpace\\WeekEnd\\BDD-Junit\\src\\main\\java\\com\\BDD_Junit_Feature\\CreateOrganization.feature",
		glue= {"com/BDD_Junit_StepDefinition"},
		format= {"pretty","html:test-output", "json:json-output/cucumberJson.json","junit:junit-output/cucumber.xml"},
		monochrome = true,
		dryRun = false,
		strict = true
		)

public class Runner {

}
