package runnerHooks;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/hooksDemo/hooksDemo.feature", 
glue = { "runnerHooks" }, 
monochrome = true,
plugin = { "pretty","junit:target/JunitReports/JunitReports.xml",
		"json:target/JsonReports/JsontReports.json",
		"html:target/HtmlReports/htmlReports"},
tags = {//"@mustRun"
		//"(@regression or @smoke) and not @important"
		}

		)
public class RunnerHokks {

}
