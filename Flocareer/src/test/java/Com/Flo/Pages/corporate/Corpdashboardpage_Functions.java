package Com.Flo.Pages.corporate;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Com.Flo.Data.ElementList;
import Com.Flo.Data.locators.corporate.CorpDashboardPage_Locators;


public class Corpdashboardpage_Functions extends ElementList{
	WebDriver driver;
	String DashBoard_Text;
	String ExpDashboard_Text = "FloCareer Dashboard";
	
	
	public Corpdashboardpage_Functions(WebDriver driver) {
		super(driver);
	}
	
	public Corpdashboardpage_Functions verifydashboardpage() throws Exception{
		this.waitForElement(CorpDashboardPage_Locators.GET_DASHBOARD_TEXT, "xpath");
		Thread.sleep(4000);
		DashBoard_Text = this.element(CorpDashboardPage_Locators.GET_DASHBOARD_TEXT, "xpath").getText();
		Assert.assertEquals(ExpDashboard_Text, DashBoard_Text);
		return this;
		
	}
	
}
