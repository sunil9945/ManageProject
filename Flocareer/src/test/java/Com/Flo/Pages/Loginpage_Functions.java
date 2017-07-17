package Com.Flo.Pages;

import org.openqa.selenium.WebDriver;

import Com.Flo.Data.ElementList;
import Com.Flo.Data.locators.login.LoginPage_Locators;

public class Loginpage_Functions extends ElementList {
	WebDriver driver;

	public Loginpage_Functions(WebDriver driver) {
		super(driver);
	}

	public Loginpage_Functions clickonlogin() {
		this.waitForElement(LoginPage_Locators.LOGIN_LINK, "linkText");
		this.element(LoginPage_Locators.LOGIN_LINK, "linkText").click();
		return this;
	}
	
	public Loginpage_Functions enterusername(){
		this.waitForElement(LoginPage_Locators.USER_NAME, "id");
		this.element(LoginPage_Locators.USER_NAME, "id").sendKeys("shivajainapure11@gmail.com");
		return this;		
	}
	
	public Loginpage_Functions enterpassword(){
		this.waitForElement(LoginPage_Locators.PASS_WORD, "id");
		this.element(LoginPage_Locators.PASS_WORD, "id").sendKeys("123");
		return this;		
	}
	
	public Loginpage_Functions clickonsubmit(){
		this.waitForElement(LoginPage_Locators.SUBMIT_BUTTON, "id");
		this.element(LoginPage_Locators.SUBMIT_BUTTON, "id").click();
		return this;		
	}

}
