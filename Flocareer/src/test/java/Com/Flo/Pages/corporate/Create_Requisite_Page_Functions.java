package Com.Flo.Pages.corporate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import Com.Flo.Data.ElementList;
import Com.Flo.Data.locators.corporate.Create_Requisite_Locators;
import Com.Flo.configuration.Config.Common_Functions.Common_Methods;
import WaitFunctions.WebDriverWait_Functions;

public class Create_Requisite_Page_Functions extends ElementList{
	WebDriver driver;
	
	WebElement Req_Comp, Req_Owner, Req_Priority,Req_Skill,Req_Requirement,Req_Assessment,Req_Level;
	public static String Create_Req_Text,
	Exp_Create_Req = "Create Requisite",	
	Req_ID = "REQ_12345",
	COMPANY = "Accenture consultancy services Pvt. Ltd.",
	JOB_TITLE = "Automation testing",
	REQ_LOCATION = "Bangalore",
	REQ_OWNER = "Shivar Prasad",
	REQ_PRIORITY = "Medium",
	SKILLS = "Automation Engineer",
	REQ_LEVEL="Professional",
	REQ_REQUIREMENT="Mandatory",
	REQ_ASSESSMENT="Java --- Intermediate";
			
	
	
		
	public Create_Requisite_Page_Functions(WebDriver driver) {
		super(driver);
	}
	
	Common_Methods comnmeth = new Common_Methods(this.driver);
	WebDriverWait_Functions wait1 = new WebDriverWait_Functions(this.driver) ;
	
	public Create_Requisite_Page_Functions verify_Createrequisitepage() throws Exception {
		this.waitForElement(Create_Requisite_Locators.CREATE_REQ_Page_TEXT, "xpath");
		Create_Req_Text = this.element(Create_Requisite_Locators.CREATE_REQ_Page_TEXT, "xpath").getText();
		Assert.assertEquals(Create_Req_Text, Exp_Create_Req);
		return this;
	}
	
	public Create_Requisite_Page_Functions Enter_Requisite_ID() throws Exception {
		this.waitForElement(Create_Requisite_Locators.REQ_ID, "id");
		this.element(Create_Requisite_Locators.REQ_ID, "id").sendKeys(Req_ID);
		return this;
	}
	
	public Create_Requisite_Page_Functions Select_Requisite_Company() throws Exception {
		this.waitForElement(Create_Requisite_Locators.REQ_COMPANY, "id");
		Req_Comp = this.element(Create_Requisite_Locators.REQ_COMPANY, "id");
		Req_Comp.click();
		comnmeth.Select_Functions(Req_Comp, COMPANY);
		return this;
	}
	
	public Create_Requisite_Page_Functions Enter_Job_Title() throws Exception {
		this.waitForElement(Create_Requisite_Locators.REQ_TITLE, "id");
		this.element(Create_Requisite_Locators.REQ_TITLE, "id").sendKeys(JOB_TITLE);
		return this;
	}
	
	public Create_Requisite_Page_Functions Select_Requisite_Owner() throws Exception {
		this.waitForElement(Create_Requisite_Locators.REQ_OWNER, "id");
		Req_Owner = this.element(Create_Requisite_Locators.REQ_OWNER, "id");
		Req_Owner.click();
		comnmeth.Select_Functions(Req_Owner, REQ_OWNER);
		return this;
	}
	
	public Create_Requisite_Page_Functions Enter_Location() throws Exception {
		this.waitForElement(Create_Requisite_Locators.REQ_LOCATION, "id");
		this.element(Create_Requisite_Locators.REQ_LOCATION, "id").sendKeys(REQ_LOCATION);
		return this;
	}
	
	public Create_Requisite_Page_Functions Select_Requisite_Priority() throws Exception {
		this.waitForElement(Create_Requisite_Locators.REQ_PRIORITY, "id");
		Req_Priority = this.element(Create_Requisite_Locators.REQ_PRIORITY, "id");
		Req_Priority.click();
		comnmeth.Select_Functions(Req_Priority, REQ_PRIORITY);
		return this;
	}
	
	public Create_Requisite_Page_Functions Enter_Skills() throws Exception {
		this.waitForElement(Create_Requisite_Locators.REQ_SKILLS, "id");
		this.element(Create_Requisite_Locators.REQ_SKILLS, "id").sendKeys(SKILLS);
		return this;
	}
	
	public Create_Requisite_Page_Functions Select_Skill_Level() throws Exception {
		this.waitForElement(Create_Requisite_Locators.REQ_LEVEL, "id");
		Req_Level = this.element(Create_Requisite_Locators.REQ_LEVEL, "id");
		Req_Level.click();
		comnmeth.Select_Functions(Req_Level, REQ_LEVEL);
		Req_Level.isSelected();
		return this;
	}
	
	public Create_Requisite_Page_Functions Select_Skill_Requirement() throws Exception {
		this.waitForElement(Create_Requisite_Locators.REQ_REQUIREMENT, "xpath");
		Req_Requirement = this.element(Create_Requisite_Locators.REQ_REQUIREMENT, "xpath");
		Req_Requirement.click();
		comnmeth.Select_Functions(Req_Requirement, REQ_REQUIREMENT);
		return this;
	}
	
	public Create_Requisite_Page_Functions Select_Assessment() throws Exception {
		this.waitForElement(Create_Requisite_Locators.REQ_ASSESSMENT, "id");
		this.element(Create_Requisite_Locators.REQ_ASSESSMENT, "id").click();	
		this.waitForElement(Create_Requisite_Locators.ASSESSMENT_CAT, "xpath");
		Req_Assessment = this.element(Create_Requisite_Locators.ASSESSMENT_CAT, "xpath");
		Req_Assessment.click();
		return this;
	}
	
	

}
