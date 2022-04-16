package mindq.runners;

import cucumber.api.CucumberOptions;

@CucumberOptions( features={"Features"},
glue={"mindq.stepdefinitions"},
tags = {"@smoke"},
monochrome = true



)
public class SmokeRunner {

}
