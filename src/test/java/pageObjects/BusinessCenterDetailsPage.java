package pageObjects;

import static org.testng.Assert.assertEquals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BusinessCenterDetailsPage {

	WebDriver driver;

	String BCenterName, strcenterName, straddress1, straddress2, strcity, strcontactnum, straddcontactnum,
			strminservicecharge, strdate;

	public BusinessCenterDetailsPage(WebDriver driver) {
//		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(id = "bcName")
	WebElement Name;

	@FindBy(id = "bcAddress1")
	WebElement Address;

	@FindBy(id = "bcAddress2")
	WebElement address2;

	@FindBy(id = "bcCity")
	WebElement City;

	@FindBy(id = "bcContactNo")
	WebElement ContactNumber;

	@FindBy(id = "addtnlBCContactNo")
	WebElement AdditionalContactNumber;
	
	@FindBy(id = "minServiceCharge")
	WebElement MinimumServiceCharge;

	@FindBy(id = "smsSignature")
	WebElement SMSSignature;

	@FindBy(id = "saveBusinessCenter")
	WebElement Save;

	@FindBy(xpath = "//span[@id='storeName']")
	WebElement verifyStorename;

	@FindBy(xpath = "//span[@id='storeRegNo']")
	WebElement verifystoreRegNodate;

	@FindBy(xpath = "//span[@id='tenentEmailId']")
	WebElement verifytenentEmailId;

	@FindBy(xpath = "//span[@id='city']")
	WebElement verifycity;

	@FindBy(xpath = "//span[@id='landline1']")
	WebElement verifylandline1;

	@FindBy(xpath = "//span[@id='landline2']")
	WebElement verifylandline2;

	@FindBy(xpath = "//span[@id='minServChrge']")
	WebElement verifyminServChrge;
	
	@FindBy(xpath = "//div[@class='row']/div/div/h1")
	WebElement VerifyBCenterDetailspage;
	
	@FindBy(xpath = "//span[@id='address']")
	WebElement Verifyaddress1;
	
	@FindBy(id = "tenentMobNo")
	WebElement VerifymobileNO;
	
	@FindBy(xpath = "//div/select[@id='licenceGroup']")
	WebElement LicenseGroupdropdown;
	

	
	
	public String EnterName(String strCenterName) throws Exception {
		Name.sendKeys(strCenterName);
		return strcenterName = Name.getAttribute("value");
	}

	public String EnterAddress1(String strAddress1) {
		Address.sendKeys(strAddress1);
		return straddress1 = Address.getAttribute("value");
	}

	public String EnterAddress2(String strAddress2) {
		address2.sendKeys(strAddress2);
		return straddress2 = address2.getAttribute("value");
	}

	public String EnterCity(String strCity) {
		City.sendKeys(strCity);
		return strcity = City.getAttribute("value");
	}

	public String EnterContactnumber(String strContactnumber) {
		ContactNumber.sendKeys(strContactnumber);
		return strcontactnum = ContactNumber.getAttribute("value");
	}

	public String EnteraddContactnumber(String straddContactnumber) {
		AdditionalContactNumber.sendKeys("12345");
		return straddcontactnum = AdditionalContactNumber.getAttribute("value");
	}

	public String EnterminimumCharge(String strminimumCharge) {
		MinimumServiceCharge.sendKeys(strminimumCharge);
		return strminservicecharge = MinimumServiceCharge.getAttribute("value");
	}

	public void Entersignature() throws Exception {
		SMSSignature.sendKeys("TestSignature");
	}
	
	public void SelectLicenseGroup() throws Exception {
		LicenseGroupdropdown.click();
		Select sl =new Select(LicenseGroupdropdown);
		sl.selectByIndex(1);
	}

	public String GetcurrentDate() {
		DateFormat dateFormat = new SimpleDateFormat("d-MMM-yyyy");
		Date date = new Date();
		return strdate = dateFormat.format(date);
	}

	public void ClickonSave() throws Exception {
		Save.click();
		Thread.sleep(1000);
	}
	
	public void VerifyBCenterspage() throws Exception {
		
		assertEquals(VerifyBCenterDetailspage.getText(), "Business Center Details");
	}

	public void verifystorename(String BCenterName) {
		assertEquals(verifyStorename.getText(), BCenterName);
	}

	public void verifyRegdate(String strdate) {
		assertEquals(verifystoreRegNodate.getText(), strdate);
	}
	
	public void Verifyaddress1(String straddress1, String straddress2) {
		assertEquals(Verifyaddress1.getText(), straddress1+" "+straddress2);
	}
	
	public void VerifymobileNO(String straddress1) {
		assertEquals(VerifymobileNO.getText(), straddress1);
	}
	
	public void verifycity(String strcity) {
		assertEquals(verifycity.getText(), strcity);
	}

	public void verifylandline1(String strcontactnum) {
		assertEquals(verifylandline1.getText(), strcontactnum);
	}

	public void verifylandline2(String straddcontactnum) {
		assertEquals(verifylandline2.getText(), straddcontactnum);
	}

	public void verifyminServChrge(String strminservicecharge) {
		assertEquals(verifyminServChrge.getText(), strminservicecharge);
	}
	
}
