package pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicePage {
	WebDriver driver;

	public ServicePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//div[7]//div/h1")
	WebElement servicepagetext; 
	
	@FindBy(id="createJobSheetBtn")
	WebElement createJobSheetBtn; 
	
	@FindBy(xpath="//div[4]/div[2]/a/input")
	WebElement Buylicensebtn; 
	
	
	
	
	public void verifyservicepage(){
		assertEquals(servicepagetext.getText(), "Service");
	}
	
	public void clickonCreatejobsheetbtn() throws Exception{
		LicensePage license = new LicensePage(driver);
		if(createJobSheetBtn.isDisplayed()){
			createJobSheetBtn.click();
		}else{
			Buylicensebtn.click();
			license.verifylicensepage();
			license.Selectservicelicensedropdown();
			license.Selectbillinglicensedropdown();
			license.Selectinventorylicensedropdown();
			license.clickonBuyLicense();
			license.clickonMakePayment();
		}
	}
}
