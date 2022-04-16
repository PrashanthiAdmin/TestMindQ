package mindq.runners;

import java.io.File;

import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions( features={"Features"},
                  glue={"mindq.stepdefinitions"},
                		 //plugin = { "pretty","html:target/cucumber-reports" },
                		  plugin = {"pretty","html:target/cucumber-reports","com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"}
                  ,tags = {"@logininvalid"},
                  monochrome = true
		
		
		
		)

public class Runner extends AbstractTestNGCucumberTests{
	
	
	@AfterClass
	public static void setup()
	{
	Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
	//Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
	Reporter.setSystemInfo("User Name", "Prashanthi");
	Reporter.setSystemInfo("Application Name", "Test App");
	Reporter.setSystemInfo("Operating System Type", "Windows 10");
	Reporter.setSystemInfo("Environment", "QA");
	Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
	}
	
	

}
