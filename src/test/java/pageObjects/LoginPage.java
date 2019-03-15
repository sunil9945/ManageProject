package pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configurations.ReadFileData;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	String Login = "Login";
	
	@FindBy(id = "loginId")
	WebElement Username;
	
	@FindBy(id = "loginPassword")
	WebElement Password;
	
	@FindBy(id = "loginBtn")
	WebElement submitbutton;
	
	
	
	public void verifyloginpage(){
		String title = driver.getTitle();
		assertEquals(title, Login);
	}
	
	public void EnterUsername(String username) throws Exception {
		Username.sendKeys(ReadFileData.readdata(username));
	}
	
	public void EnterPassword(String password) throws Exception {
		Password.sendKeys(ReadFileData.readdata(password));
	}
	
	public void clickonloginbutton() throws Exception {
		submitbutton.click();
	}
}
