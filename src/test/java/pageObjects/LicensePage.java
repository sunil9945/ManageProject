package pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LicensePage {

	WebDriver driver;

	public LicensePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//table[@id='licenceGroupList']/tbody[2]/tr[2]/td[4]/select")
	WebElement servicelicensedropdown; 
	
	@FindBy(xpath="//table[@id='licenceGroupList']/tbody[2]/tr[3]/td[4]/select")
	WebElement billinglicensedropdown;
	
	@FindBy(xpath="//table[@id='licenceGroupList']/tbody[2]/tr[4]/td[4]/select")
	WebElement inventorylicensedropdown;
	
	@FindBy(id="buyLicence")
	WebElement buylicense;
	
	@FindBy(id="confirmPayment")
	WebElement MakePayment;
	
	
	public void verifylicensepage(){
		assertEquals(driver.getTitle(), "Buy License");
	}
	
	public void Selectservicelicensedropdown() throws Exception {
		servicelicensedropdown.click();
		Select sl =new Select(servicelicensedropdown);
		sl.selectByIndex(1);
	}
	
	public void Selectbillinglicensedropdown() throws Exception {
		servicelicensedropdown.click();
		Select sl =new Select(servicelicensedropdown);
		sl.selectByIndex(1);
	}
	
	public void Selectinventorylicensedropdown() throws Exception {
		servicelicensedropdown.click();
		Select sl =new Select(servicelicensedropdown);
		sl.selectByIndex(1);
	}
	
	public void clickonBuyLicense() throws Exception {
		buylicense.click();		
	}
	
	public void clickonMakePayment() {
		MakePayment.click();		
	}
	
}
