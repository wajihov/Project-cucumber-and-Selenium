package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/featuresWithTags", 
glue = { "runner" }, 
tags = {"@mustRun"
		//"(@regression or @smoke) and not @important"
		}

		)
public class Runner_tags {

}
