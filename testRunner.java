package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\ashish_saxena\\eclipse\\anbtx\\src\\main\\java\\Features\\login.feature",
		glue= {"stepDefinition"},
		plugin={"pretty", "html:test-output", "json:json.output/cucumber.json", "junit: junit_xml/cucumber.xml"},
		monochrome= true,
		dryRun= true,
		strict= true
		
		)

public class testRunner {

}
