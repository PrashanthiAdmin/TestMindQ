package mindq.utils;

import java.io.File;

import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import mindq.base.BasePage;

public class ReportingManager {

	//public static String screenshotName;

	public static String captureScreenshot() throws IOException {

	//	Date d = new Date();

	//	screenshotName = "Screenshot_TestCase" + d.toString();

		String screenshotPath = "";

		//1. take screenshot object
		TakesScreenshot scrShot = (TakesScreenshot) BasePage.driver;

		//2. store the file in soruce file
		File sourceFile = scrShot.getScreenshotAs(OutputType.FILE);

		
		//3. creating the destination path to store the file
		File destinationPath = new File("C://Users//PRASHANTHI//MyJavaWorkSpace//NewWorkspace//MindQCucumberFramework//Screenshots//"
				+ "ScreenCapture" + System.currentTimeMillis() + ".png");

		
		// 4. copy the source file into destination path
		FileUtils.copyFile(sourceFile, destinationPath);

		
		//5. capturing the destinationpath in string
		screenshotPath = destinationPath.getAbsolutePath();

		return screenshotPath;
	}

}
