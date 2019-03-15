package configurations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BasicConfig {
	public WebDriver driver;
	String strBrowser = "chrome";

	@BeforeMethod
	public void tearup() throws Exception {

		if (strBrowser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Jars\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.get(ReadFileData.readdata("url"));
		}

		else if (strBrowser.equalsIgnoreCase("Firefox")) {
			System.setProperty("WebDriver.gecko.driver", "");
			driver = new ChromeDriver();
			driver.get(ReadFileData.readdata("url"));
		}

		else {
			System.setProperty("WebDriver.ie.driver", "");
			driver = new ChromeDriver();
			driver.get(ReadFileData.readdata("url"));
		}
	}

/*	@AfterMethod
	public void teardown() {
		driver.close();
		driver.quit();
	}
*/
}
