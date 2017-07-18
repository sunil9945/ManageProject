package Com.Flo.Pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Com.Flo.Data.ElementList;
import Com.Flo.Data.locators.login.LoginPage_Locators;

public class Loginpage_Functions extends ElementList {
	WebDriver driver;
	String Login_LinkText, Expected_Text = "Login";

	public Loginpage_Functions(WebDriver driver) {
		super(driver);
	}

	public Loginpage_Functions clickonlogin() {
		this.waitForElement(LoginPage_Locators.LOGIN_LINK, "linkText");
		this.element(LoginPage_Locators.LOGIN_LINK, "linkText").click();
		return this;
	}
	
	public Loginpage_Functions enterusername(String username){
		this.waitForElement(LoginPage_Locators.USER_NAME, "id");
		this.element(LoginPage_Locators.USER_NAME, "id").sendKeys(username);
		return this;		
	}
	
	public Loginpage_Functions enterpassword(String password){
		this.waitForElement(LoginPage_Locators.PASS_WORD, "id");
		this.element(LoginPage_Locators.PASS_WORD, "id").sendKeys(password);
		return this;		
	}
	
	public Loginpage_Functions clickonsubmit(){
		this.waitForElement(LoginPage_Locators.SUBMIT_BUTTON, "id");
		this.element(LoginPage_Locators.SUBMIT_BUTTON, "id").click();
		return this;		
	}
	
	public Loginpage_Functions verifyloginlink() {
		this.waitForElement(LoginPage_Locators.LOGIN_LINK, "linkText");
		Login_LinkText = this.element(LoginPage_Locators.LOGIN_LINK, "linkText").getText();
		Assert.assertEquals(Expected_Text, Login_LinkText);
		return this;
	}
	

}
