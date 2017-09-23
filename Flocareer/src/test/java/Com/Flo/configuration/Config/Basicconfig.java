package Com.Flo.configuration.Config;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Com.Flo.Data.PropDatareadmethods;
import Com.Flo.Data.Readpropertiesfile;

public class Basicconfig extends Readpropertiesfile {
	public WebDriver driver;

	@BeforeMethod
	public void tearup() throws Exception {
		PropDatareadmethods prop = new PropDatareadmethods();

		if (prop.readbrowser().equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:/Automation files/Browser exe/geckodriver-v0.14.0-win64/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(prop.readURL());
		}

		else if (prop.readbrowser().equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:/Automation files/Browser exe/chromedriver_win32/chromedriver.exe");
			/*
			 * ChromeOptions options = new ChromeOptions();
			 * options.addArguments("-disable-extensions");
			 */
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(prop.readURL());
		}

		else {
			throw new Exception("Browser is not correct");
		}
	}

	@AfterMethod
	public void teardown(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus())
		{
		try 
		{
		// Create refernce of TakesScreenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		 
		// Call method to capture screenshot
		File source=ts.getScreenshotAs(OutputType.FILE);
		 
		// Copy files to specific location here it will save all screenshot in our project home directory and
		// result.getName() will return name of test case so that screenshot name will be same
		FileUtils.copyFile(source, new File("./Screenshots/"+result.getName()+".png"));
		 
		System.out.println("Screenshot taken");
		} 
		catch (Exception e)
		{
		 
		System.out.println("Exception while taking screenshot "+e.getMessage());
		} 
		 
		 
		 
		}
		driver.close();
		driver.quit();
	}

}
