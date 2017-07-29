package Com.Flo.Testclasses.Requirements.Corporate;

import org.testng.annotations.Test;

import Com.Flo.Data.PropDatareadmethods;
import Com.Flo.Pages.Loginpage_Functions;
import Com.Flo.Pages.corporate.Corpdashboardpage_Functions;
import Com.Flo.Pages.corporate.Create_Requisite_Page_Functions;
import Com.Flo.Pages.corporate.Req_management_Functions;
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
		createnewrequisite.Select_Skill_Requirement();
		createnewrequisite.Select_Assessment();
		
		
		
		
	}
	

}
