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
		for(int i=3;i<=10;i++){
		String a= "BlueJeans_03_.Net";
		String value = driver1.findElement(By.xpath("//table[@id='dataTables-example']/tbody/tr["+i+"]/td[1]")).getText();
		if(value==a){
		System.out.println(value);
		}
		else{
			System.out.println("NOT FOUND");
		}
		}
	
		
		return this;
	}
}
