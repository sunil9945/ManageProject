package WaitFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.Flo.Data.ElementList;

public class WebDriverWait_Functions extends ElementList {
	WebDriver driver;
	
	public WebDriverWait_Functions(WebDriver driver) {
		super(driver);
	}
	
	
	
	public WebDriverWait_Functions WebDriverWait_Expectedcondition(WebDriver driver1) {
		System.out.println(driver1);
		System.out.println(driver);
		WebDriverWait wait = new WebDriverWait(driver1, 10);
		return this;		
	}
	}
