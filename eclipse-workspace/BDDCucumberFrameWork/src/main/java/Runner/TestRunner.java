package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
/**
 * Cucumber Options: DryRun: checks if mapping is complete between feature file
 * and step definition file. if true only checks if false, test cases will be
 * executed. features: the path of feature file strict: will return
 * pendingExeption if there is any undefined step. plugin: to generate types of
 * reporting and also we can use pretty keyword for more better info on cosole.
 * glue:the path of step definition file tags: monochrome:display output in
 * readable format
 * 
 * @author Mohammad
 *
 */
//only tags is defined in feature file. rest of the options are defined in runner class.
@CucumberOptions(features = "\\Users\\Mohammad\\eclipse-workspace\\BDDCucumberFrameWork\\src\\main\\java\\Features\\tagging.feature", glue = {
		"StepDefinitions" }, plugin = { "pretty", "html:test-output", "json:json_output/cucumber.json",
				"junit:junit_xml/cucumber.xml" }, dryRun = false, tags = {
						"~@SmokeTest" , "~@RegressionTest","~@End2End"}, monochrome = true)
//operators in tagging
//, in taggin means Or.
//And in taggin is when u put ur tags in different quotations and coma between em.
//Ignore in taggin is ~. you should put it before at sign.
public class TestRunner {

}
