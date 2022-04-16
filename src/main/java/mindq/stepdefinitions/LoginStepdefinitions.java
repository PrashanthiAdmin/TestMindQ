package mindq.stepdefinitions;

import org.testng.asserts.SoftAssert;


import com.cucumber.listener.ExtentCucumberFormatter;
import com.cucumber.listener.Reporter;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import mindq.pageobjects.LoginPage;
import mindq.utils.ReportingManager;

public class LoginStepdefinitions extends LoginPage{
	
	
	SoftAssert sa = new SoftAssert();
	@Before
	public void launchapp() {
		launchApplication("Chrome");
	}
	
	@After
	public void closeWindow() {
		closeBrowser();
	}
	
	@Given("^User is in login page$")
    public void user_is_in_login_page() throws Throwable {
        launchApplication("Chrome");
        
    }

	 @When("^User enters email id \"([^\"]*)\"$")
    public void user_enters_email_id(String strArg1) throws Throwable {
       enterEmailID(strArg1);
       Reporter.addStepLog("Entered email id "+strArg1);
    }

    @Then("^User should see the error message$")
    public void user_should_see_the_error_message() throws Throwable {
       
    	
    	String actual = captureInvalidErrorMessage();

		String expected = "Invalid email or password";
		
		
			
			
			if(expected.equals(actual)) {
				Reporter.addStepLog("Validation is successfull");
			}else {
				sa.assertEquals(actual, expected);
				Reporter.addScreenCaptureFromPath(ReportingManager.captureScreenshot());
			}
		
			

		
    
    	sa.assertAll();
    }

    @Then("^User should be able to login successfully$")
    public void user_should_be_able_to_login_successfully() throws Throwable {
        
    }

    @And("^User enters password \"([^\"]*)\"$")
    public void user_enters_password(String strArg1) throws Throwable {
    	
    	
    	
       enterPassword(strArg1);
       Reporter.addStepLog("Entered password "+strArg1);
    }

    @And("^User clicks signin button$")
    public void user_clicks_login_button() throws Throwable {
       
    	clickSignin();
    	Reporter.addStepLog("clicked signin button");
    }
    
    

}
