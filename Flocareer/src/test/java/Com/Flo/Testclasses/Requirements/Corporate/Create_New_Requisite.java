package Com.Flo.Testclasses.Requirements.Corporate;

import org.testng.annotations.Test;

import Com.Flo.Data.PropDatareadmethods;
import Com.Flo.Pages.Commonfunctions.Loginpage_Functions;
import Com.Flo.Pages.corporate.Corpdashboardpage_Functions;
import Com.Flo.Pages.corporate.Create_Requisite_Page_Functions;
import Com.Flo.Pages.corporate.Req_management_Functions;
import Com.Flo.Pages.jobseekers.Jobs_page_Functions;
import Com.Flo.Pages.jobseekers.Jobseekerhomepage;
import Com.Flo.configuration.Config.Basicconfig;
import Com.Flo.configuration.Config.Common_Functions.Common_Methods;

public class Create_New_Requisite extends Basicconfig {
	
	@Test()
	public void Create_Requisite() throws Exception{
		Loginpage_Functions login_functions = new Loginpage_Functions(this.driver);
		PropDatareadmethods propfiles= new PropDatareadmethods();
		login_functions.clickonlogin();
		login_functions.enterusername(propfiles.getusername("CORP_USERNAME"));
		login_functions.enterpassword(propfiles.getpassword("CORP_PASSWORD"));
		login_functions.clickonsubmit();
		Corpdashboardpage_Functions corporatepage_functions = new Corpdashboardpage_Functions(this.driver);
		corporatepage_functions.verifydashboardpage();
		corporatepage_functions.Clickon_Requisite_Management(this.driver);
		corporatepage_functions.Clickonon_Req_Management();
		Req_management_Functions reqmanagement = new Req_management_Functions(this.driver);
		reqmanagement.verify_Req_Managementpage();
		reqmanagement.Clickon_Create_New_requisiteicon();
		Create_Requisite_Page_Functions createnewrequisite = new Create_Requisite_Page_Functions(this.driver);
		createnewrequisite.verify_Createrequisitepage();
		createnewrequisite.Enter_Requisite_ID();
		createnewrequisite.Select_Requisite_Company();
		createnewrequisite.Enter_Job_Title();
		createnewrequisite.Select_Requisite_Owner();
		createnewrequisite.Enter_Location();
		Common_Methods comanmeth = new Common_Methods(this.driver);
		comanmeth.Scroll_Functions(this.driver);
		createnewrequisite.Select_Requisite_Priority();
		createnewrequisite.Enter_Skills();
		createnewrequisite.Select_Skill_Level();		
		comanmeth.Scroll_Functions(this.driver);
		createnewrequisite.Select_Skill_Requirement();
		comanmeth.Scroll_Functions(this.driver);
		createnewrequisite.Select_Assessment();
		createnewrequisite.Enter_Description(this.driver);
		comanmeth.Scroll_Functions(this.driver);		
		createnewrequisite.Select_Requiement_Type();
		createnewrequisite.Enter_No_Of_Openings();
		createnewrequisite.Select_Currency_Type();
		createnewrequisite.Select_Salary_Type();
		createnewrequisite.Enter_Comments(this.driver);
		createnewrequisite.Clickon_Publish();
		reqmanagement.Verify_Created_Requisite(this.driver);
		corporatepage_functions.ClickonHamburgerMenu_Functions();
		corporatepage_functions.ClickonLogout_Functions();
		Common_Methods commonfunc = new Common_Methods(this.driver);
		commonfunc.dynamic_logout();
		login_functions.clickonlogin();
		login_functions.enterusername(propfiles.getusername("JOBS_USERNAME"));
		login_functions.enterpassword(propfiles.getpassword("JOBSEK_PASSWORD"));
		login_functions.clickonsubmit();
		Jobseekerhomepage jobseeker=new Jobseekerhomepage(this.driver);
		jobseeker.ClickOnHamburger();
		jobseeker.ClickOnJobs();
		Jobs_page_Functions jogspage = new Jobs_page_Functions(this.driver);
		jogspage.ClockOnMore_Opertunitieslink();
		jogspage.VerifyJob_Title();
		jogspage.ClockOn_Hamburger();
		jogspage.ClockOn_Logout();
		

		
	}
	

}
