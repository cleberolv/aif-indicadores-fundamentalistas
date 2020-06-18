package application.aif.tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false,
		features = "src/test/resources/features/access.feature",
		glue = "application.aif.steps",
		monochrome = true,
		plugin =  {"pretty", "html:target/reports/report-html", "json:target/reports/report-json/report.json"},
		snippets = SnippetType.CAMELCASE,
		strict = false,
		tags = {"@Tickers"}
		)
public class AccessTestRunner {

}