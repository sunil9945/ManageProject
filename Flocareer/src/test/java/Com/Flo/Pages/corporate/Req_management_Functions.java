package Com.Flo.Pages.corporate;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import Com.Flo.Data.ElementList;
import Com.Flo.Data.locators.corporate.Req_managementPage_Locators;
import WaitFunctions.WebDriverWait_Functions;

public class Req_management_Functions extends ElementList {
	WebDriver driver;
	public static String Req_Management_Text, Exp_Req_management = "My Job Openings";

	public Req_management_Functions(WebDriver driver) {
		super(driver);
	}

	public Req_management_Functions verify_Req_Managementpage() throws Exception {
		this.waitForElement(Req_managementPage_Locators.GET_REQ_MANAGEMENT_TEXT, "xpath");
		Req_Management_Text = this.element(Req_managementPage_Locators.GET_REQ_MANAGEMENT_TEXT, "xpath").getText();
		Assert.assertEquals(Req_Management_Text, Exp_Req_management);
		return this;
	}

	public Req_management_Functions Clickon_Create_New_requisiteicon() throws Exception {
		this.waitForElement(Req_managementPage_Locators.CRETAE_NEW_REQUIESITEICON, "id");
		this.element(Req_managementPage_Locators.CRETAE_NEW_REQUIESITEICON, "id").click();
		return this;

	}
}
