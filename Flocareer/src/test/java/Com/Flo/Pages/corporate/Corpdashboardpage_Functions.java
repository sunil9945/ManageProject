package Com.Flo.Pages.corporate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import Com.Flo.Data.ElementList;
import Com.Flo.Data.locators.corporate.CorpDashboardPage_Locators;

public class Corpdashboardpage_Functions extends ElementList {
	WebDriver driver;
	String DashBoard_Text, ExpDashboard_Text = "Carporate Dashboard";

	public Corpdashboardpage_Functions(WebDriver driver) {
		super(driver);
	}

	public Corpdashboardpage_Functions verifydashboardpage() throws Exception {
		this.waitForElement(CorpDashboardPage_Locators.GET_DASHBOARD_TEXT, "xpath");
		DashBoard_Text = this.element(CorpDashboardPage_Locators.GET_DASHBOARD_TEXT, "xpath").getText();
		Assert.assertEquals(ExpDashboard_Text, DashBoard_Text);
		return this;

	}

	public Corpdashboardpage_Functions ClickonHamburgerMenu_Functions() throws Exception {
		this.waitForElement(CorpDashboardPage_Locators.CLICK_CORP_HAMBURGER, "xpath");
		this.element(CorpDashboardPage_Locators.CLICK_CORP_HAMBURGER, "xpath").click();
		return this;
	}

	public Corpdashboardpage_Functions ClickonLogout_Functions() throws Exception {
		Thread.sleep(2000);
		this.waitForElement(CorpDashboardPage_Locators.CLICK_LOGOUT, "id");
		this.element(CorpDashboardPage_Locators.CLICK_LOGOUT, "id").click();
		return this;
	}

	public Corpdashboardpage_Functions Clickon_Requisite_Management(WebDriver driver1) throws Exception {
		this.waitForElement(CorpDashboardPage_Locators.CORP_ADMIN_LIST, "id");
		WebElement Corp_Menu = this.element(CorpDashboardPage_Locators.CORP_ADMIN_LIST, "id");
		Actions action = new Actions(driver1);
		action.moveToElement(Corp_Menu).build().perform();
		return this;
	}

	public Corpdashboardpage_Functions Clickonon_Req_Management() throws Exception {
		this.waitForElement(CorpDashboardPage_Locators.CORP_REQ_MANAGEMENT, "linkText");
		this.element(CorpDashboardPage_Locators.CORP_REQ_MANAGEMENT, "linkText").click();
		return this;
	}

}
