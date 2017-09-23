package Com.Flo.Pages.corporate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import Com.Flo.Data.ElementList;
import Com.Flo.Data.locators.corporate.Req_managementPage_Locators;

public class Req_management_Functions extends ElementList {
	WebDriver driver;

	public static String Req_Management_Text, Exp_Req_management = "My Job Openings";

	public Req_management_Functions(WebDriver driver) {
		super(driver);
	}

	public Req_management_Functions verify_Req_Managementpage() throws Exception {
		Thread.sleep(1000);
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

	public Req_management_Functions Verify_Created_Requisite(WebDriver driver1) throws Exception {
		this.waitForElement(Req_managementPage_Locators.TABLE_XPATH, "xpath");
		int pagenav = 20;
		for (int j=0;j<=pagenav;j++) {					
		List<WebElement> value = driver1.findElements(By.xpath("//table[@id='dataTables-example']/tbody/tr"));			
			for (int i = 3; i <= value.size(); i++) {
				Thread.sleep(500);
				String value1 = driver1.findElement(By.xpath("//table[@id='dataTables-example']/tbody/tr[" + i + "]/td[1]")).getText();
				if (value1.equalsIgnoreCase(Create_Requisite_Page_Functions.Req_ID)) {
					System.out.println(value1);
					System.out.println(Create_Requisite_Page_Functions.Req_ID);
					j=pagenav+1;
					break;
				} 
				}
			Thread.sleep(500);
			this.element(Req_managementPage_Locators.CLICK_NEXTPAGE, "xpath").click();
		}				
			

		return this;
}
}