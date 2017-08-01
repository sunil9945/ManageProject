package Com.Flo.Pages.corporate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import Com.Flo.Data.ElementList;
import Com.Flo.Data.locators.corporate.Create_Requisite_Locators;
import Com.Flo.configuration.Config.Common_Functions.Common_Methods;
import WaitFunctions.WebDriverWait_Functions;

public class Create_Requisite_Page_Functions extends ElementList {
	WebDriver driver;

	WebElement Req_Comp, Req_Owner, Req_Priority, Req_Skill, Req_Requirement, Req_Assessment, Req_Level,
			Requierement_Type, Salary_Type;
	public static String Create_Req_Text, Exp_Create_Req = "Create Requisite", Req_ID = "REQ_12345",
			COMPANY = "Accenture consultancy services Pvt. Ltd.", JOB_TITLE = "Automation testing",
			REQ_LOCATION = "Bangalore", REQ_OWNER = "Shivar Prasad", REQ_PRIORITY = "Medium",
			SKILLS = "Automation Engineer", REQ_LEVEL = "Professional", REQ_REQUIREMENT = "Mandatory",
			REQ_ASSESSMENT = "Java --- Intermediate", REQ_DESCRIPTION = "Job openings for automation testing",
			REQ_REQUIREMENT_TYPE1 = "Full time", NO_OF_OPENINGS="4", SALARYBY_TYPE="Per Month", REQ_COMMENTS1="Reply Back";

	public Create_Requisite_Page_Functions(WebDriver driver) {
		super(driver);
	}

	Common_Methods comnmeth = new Common_Methods(this.driver);
	WebDriverWait_Functions wait1 = new WebDriverWait_Functions(this.driver);

	public Create_Requisite_Page_Functions verify_Createrequisitepage() throws Exception {
		Thread.sleep(2000);
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
		Thread.sleep(2000);
		Req_Assessment.click();
		return this;
	}

	public Create_Requisite_Page_Functions Enter_Description(WebDriver driver1) throws Exception {
		driver1.switchTo().frame(0);
		this.waitForElement(Create_Requisite_Locators.REQ_DESCRIPTION, "xpath");
		this.element(Create_Requisite_Locators.REQ_DESCRIPTION, "xpath").sendKeys(REQ_DESCRIPTION);
		driver1.switchTo().defaultContent();
		return this;		
	}

	public Create_Requisite_Page_Functions Select_Requiement_Type() throws Exception {
		this.waitForElement(Create_Requisite_Locators.REQ_EMPLOYEMENT_TYPE, "xpath");
		Requierement_Type = this.element(Create_Requisite_Locators.REQ_EMPLOYEMENT_TYPE, "xpath");
		Requierement_Type.click();
		comnmeth.Select_Functions(Requierement_Type, REQ_REQUIREMENT_TYPE1);
		return this;
	}
	
	public Create_Requisite_Page_Functions Enter_No_Of_Openings() throws Exception {
		this.waitForElement(Create_Requisite_Locators.REQ_NO_OF_OPENINGS, "id");
		this.element(Create_Requisite_Locators.REQ_NO_OF_OPENINGS, "id").sendKeys(NO_OF_OPENINGS);
		return this;
	}
	
	public Create_Requisite_Page_Functions Select_Currency_Type() throws Exception {
		this.waitForElement(Create_Requisite_Locators.REQ_CURRENCY_TYPE, "xpath");
		this.element(Create_Requisite_Locators.REQ_CURRENCY_TYPE, "xpath").click();
		return this;
	}
	
	public Create_Requisite_Page_Functions Select_Salary_Type() throws Exception {
		this.waitForElement(Create_Requisite_Locators.REQ_SALARYBY_TYPE, "xpath");
		Salary_Type = this.element(Create_Requisite_Locators.REQ_SALARYBY_TYPE, "xpath");
		Salary_Type.click();
		comnmeth.Select_Functions(Salary_Type, SALARYBY_TYPE);
		return this;
	}
	
	public Create_Requisite_Page_Functions Enter_Comments(WebDriver driver1) throws Exception {
		driver1.switchTo().frame(1);
		this.waitForElement(Create_Requisite_Locators.REQ_COMMENTS, "xpath");
		this.element(Create_Requisite_Locators.REQ_COMMENTS, "xpath").sendKeys(REQ_COMMENTS1);
		driver1.switchTo().defaultContent();
		return this;		
	}
	
	public Create_Requisite_Page_Functions Clickon_Publish() throws Exception {
		this.waitForElement(Create_Requisite_Locators.REQ_PUBLISH, "id");
		this.element(Create_Requisite_Locators.REQ_PUBLISH, "id").click();
		return this;
	}
	
	
	

}
