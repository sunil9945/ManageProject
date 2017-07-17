package Com.Flo.Testclasses.Requirements.Login;

import org.testng.annotations.Test;

import Com.Flo.Pages.Loginpage_Functions;
import Com.Flo.configuration.Config.Basicconfig;

public class Login extends Basicconfig{
	
	@Test	
	public void Logintoapp() throws Exception{
		Loginpage_Functions login_functions = new Loginpage_Functions(this.driver);
		login_functions.clickonlogin();
		login_functions.enterusername();
		login_functions.enterpassword();
		login_functions.clickonsubmit();
	}
	
	

}
