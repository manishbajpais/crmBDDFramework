package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/manishbajpai/Documents/workspace/CrmBDFramework/src/main/java/Features/dealsmap.feature"
		,glue={"StepDefinitions"}
		,format = {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}
		,dryRun = false
		,monochrome = true //display console output in proper readable format		
		)


public class TestRunner {
}
