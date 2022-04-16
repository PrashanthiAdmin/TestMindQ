package mindq.runners;

import cucumber.api.CucumberOptions;

@CucumberOptions( features={"Features"},
glue={"mindq.stepdefinitions"},
tags = {"@regression"},
monochrome = true



)
public class RegressionRunner {

}
