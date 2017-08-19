package Com.Flo.Testclasses.Requirements.Login;

import org.testng.annotations.Test;

import Com.Flo.Data.PropDatareadmethods;
import Com.Flo.Pages.Commonfunctions.Loginpage_Functions;
import Com.Flo.Pages.corporate.Corpdashboardpage_Functions;
import Com.Flo.configuration.Config.Basicconfig;

public class Login extends Basicconfig{
	
	@Test()
	public void LoginToApp() throws Exception{
		Loginpage_Functions login_functions = new Loginpage_Functions(this.driver);
		PropDatareadmethods propfiles= new PropDatareadmethods();
		login_functions.clickonlogin();
		login_functions.enterusername(propfiles.getusername("CORP_USERNAME"));
		login_functions.enterpassword(propfiles.getpassword("CORP_PASSWORD"));
		login_functions.clickonsubmit();
		Corpdashboardpage_Functions corporatepage_functions = new Corpdashboardpage_Functions(this.driver);
		corporatepage_functions.verifydashboardpage();
	}
	
	@Test()
	public void LogoutFromApp() throws Exception{
		Loginpage_Functions login_functions = new Loginpage_Functions(this.driver);
		PropDatareadmethods propfiles= new PropDatareadmethods();
		login_functions.clickonlogin();
		login_functions.enterusername(propfiles.getusername("CORP_USERNAME"));
		login_functions.enterpassword(propfiles.getpassword("CORP_PASSWORD"));
		login_functions.clickonsubmit();
		Corpdashboardpage_Functions corporatepage_functions = new Corpdashboardpage_Functions(this.driver);
		corporatepage_functions.verifydashboardpage();
		corporatepage_functions.ClickonHamburgerMenu_Functions();
		corporatepage_functions.ClickonLogout_Functions();
		login_functions.verifyloginlink();
	}
	
	

}
