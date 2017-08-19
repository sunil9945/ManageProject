package Com.Flo.Pages.jobseekers;

import org.openqa.selenium.WebDriver;

import Com.Flo.Data.ElementList;
import Com.Flo.Data.locators.jobseeker.Jobs_Locators;
import Com.Flo.Pages.corporate.Create_Requisite_Page_Functions;

public class Jobs_page_Functions extends ElementList {

	public static String GETJOBTITLE;

	public Jobs_page_Functions(WebDriver driver) {
		super(driver);
	}

	public Jobs_page_Functions ClockOnMore_Opertunitieslink() {
		this.waitForElement(Jobs_Locators.MORE_OPORTUNITIES, "linkText");
		this.element(Jobs_Locators.MORE_OPORTUNITIES, "linkText").click();
		return this;

	}

	public Jobs_page_Functions VerifyJob_Title() {
		this.waitForElement(Jobs_Locators.JOBTITLE, "xpath");
		int pagenav = 20;
		for (int j = 0; j <= pagenav; j++) {
			GETJOBTITLE = this.element(Jobs_Locators.JOBTITLE, "xpath").getText();
			if (GETJOBTITLE.equalsIgnoreCase(Create_Requisite_Page_Functions.JOB_TITLE)) {
				j = pagenav + 1;
				break;
			}

		}
		return this;
	}
	
	public Jobs_page_Functions ClockOn_Hamburger() {
		this.waitForElement(Jobs_Locators.HAMBURGER, "xpath");
		this.element(Jobs_Locators.HAMBURGER, "xpath").click();
		return this;
	}
	
	public Jobs_page_Functions ClockOn_Logout() throws Exception {
		Thread.sleep(2000);
		this.waitForElement(Jobs_Locators.LOGOUT, "linkText");
		this.element(Jobs_Locators.LOGOUT, "linkText").click();
		return this;
	}
	
}
