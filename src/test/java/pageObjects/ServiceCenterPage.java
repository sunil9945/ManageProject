package pageObjects;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceCenterPage {

	WebDriver driver;

	String strverifybusipage;

	public ServiceCenterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='top-hdr-name']")
	WebElement Logoutdropdown;

	@FindBy(id = "logout")
	WebElement Logoutbutton;

	@FindBy(xpath = "//ul[@class='header-items']/li/a")
	List<WebElement> Verifyadminsidebar;

	@FindBy(id = "addNewBC")
	WebElement Verifystorebutton;

	@FindBy(id = "noBCWrprAddStore")
	WebElement Verifycreatestorebutton;

	@FindBy(xpath = "//ul[@id='licenseGroupList']/li/div[1]/h4")
	WebElement Verifybusincenterpage;

	@FindBy(xpath = "//div/div[1]/ul[1]/li[1]/a[@class='admin-link active']")
	WebElement adminLink;
	
	@FindBy(xpath = "//div[8]/div[4]/div[2]/ul/li[2]/a")
	WebElement ClickonReports;	
	
	@FindBy(xpath = "//ul[@id='licenseGroupList']/li/div[3]/table/tbody/tr/td[1]")
	List<WebElement> listofcentername;
	
	@FindBy(xpath = "//ul[@id='licenseGroupList']/li/div[3]/table/tbody/tr[1]/td[4]/a/input")
	WebElement SelectEnter;
	
	
	

	public void ClickonLogoutDropdown() throws Exception {
		Logoutdropdown.click();
	}

	public void ClickonLogoutbutton() throws Exception {
		Logoutbutton.click();
	}

	public void Verifyadminsidebarpresence() throws Exception {
		List<WebElement> sidebar = Verifyadminsidebar;
		for (WebElement getlinktext : sidebar) {
			if (getlinktext.getText().equalsIgnoreCase("Admin")) {
				assertEquals(getlinktext.getText(), "Admin");
			} else if (getlinktext.getText().equalsIgnoreCase("Pricing")) {
				assertEquals(getlinktext.getText(), "Pricing");
			} else if (getlinktext.getText().equalsIgnoreCase("Manage Profile")) {
				assertEquals(getlinktext.getText(), "Manage Profile");
			} else if (getlinktext.getText().equalsIgnoreCase("Payments")) {
				assertEquals(getlinktext.getText(), "Payments");
			} /*else {
				getlinktext.getText().equalsIgnoreCase("Taxes New!");
				assertEquals(getlinktext.getText(), "Taxes New!");
			}*/
		}
	}

	public void Verifyaddstorebutton() throws Exception {
		if (Verifystorebutton.isDisplayed()) {
			Verifystorebutton.click();

		} else if (Verifycreatestorebutton.isDisplayed()) {
			Verifycreatestorebutton.click();
		}
	}

	public void Verifybusinesscenterpage() {
		strverifybusipage = Verifybusincenterpage.getText();
		assertEquals(strverifybusipage, "LICENSE GROUP 1");
	}

	public void Verifycreatedstore(String BCenterName, String straddress1, String straddress2) throws Exception {
		List<WebElement> center = listofcentername;
		
		for (int i = 0; i <= center.size(); i++) {
			if (center.get(i).getText().equalsIgnoreCase(BCenterName)) {
				assertEquals(driver.findElement(By.xpath("//ul[@id='licenseGroupList']/li/div[3]/table/tbody/tr["+i+"+"+1+"]/td[2]")).getText(), straddress1+""+straddress2);
				driver.findElement(By.xpath("//ul[@id='licenseGroupList']/li/div[3]/table/tbody/tr["+i+"+"+1+"]/td[5]/span[@class='icon-list2']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//ul[@id='licenseGroupList']/li/div[3]/table/tbody/tr["+i+"+"+1+"]/td[5]/div/ul/li[2]/a")).click();
				}
				
			}

		}
		
	public void Clickonadmin() throws Exception {
		adminLink.click();
	}
	
	public void ClickonReports() throws Exception {
		ClickonReports.click();
	}
	
	public void selectEnterbusinesscenter(){		
		SelectEnter.click();
	}
	
}
