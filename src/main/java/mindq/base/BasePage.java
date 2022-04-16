package mindq.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	public static WebDriver driver;

	
	public static void launchApplication(String browser) {

		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().version("99.0").setup();
			driver = new ChromeDriver();
			driver.get("https://studio.cucumber.io/users/sign_in");
			

		} else if (browser.equals("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://studio.cucumber.io/users/sign_in");
			

		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


		
	}

	
	public static void closeBrowser() {
		driver.close();
	}

}
