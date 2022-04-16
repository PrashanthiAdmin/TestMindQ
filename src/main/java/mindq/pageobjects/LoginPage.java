package mindq.pageobjects;

import org.openqa.selenium.By;

import mindq.base.BasePage;

public class LoginPage extends BasePage{
	
	
	public static By loginButton = By.xpath("//a[@title='Login']");
	
	public static By emailIdTextBox = By.id("user_email");
	
	public static By userPasswordTextBox = By.id("user_password");
	
	public static By signinButton = By.name("commit");
	
	
	public static By invalidErrorMessage = By.xpath("//p[text()='Invalid email or password.']");
	
	
	
	
	
	
	public static void clickLoginButton() {
		
		try {
		driver.findElement(loginButton).click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void clickSignin() {
		driver.findElement(signinButton).click();
	}
	
	public static void enterEmailID(String emailid) {
		try {
		driver.findElement(emailIdTextBox).clear();
		driver.findElement(emailIdTextBox).sendKeys(emailid);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("No element identified");
		}
	}
	
	public static void enterPassword(String password) {
		driver.findElement(userPasswordTextBox).clear();
		driver.findElement(userPasswordTextBox).sendKeys(password);
	}
	
	public static String captureInvalidErrorMessage() {
		
		String text = "";
		
		text = driver.findElement(invalidErrorMessage).getText();
		
		return text;
		
		
	}
	
	

}
