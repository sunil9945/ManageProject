package testClases;

import org.testng.annotations.Test;

import configurations.BasicConfig;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ServiceCenterPage;

public class LoginasTenant extends BasicConfig{
	
	@Test
	public void logintoAppasteneant() throws Exception{
		
		HomePage Objhomepage = new HomePage(driver);
		LoginPage Objloginpage = new LoginPage(driver);
		ServiceCenterPage ObjServiceCenterPage = new ServiceCenterPage(driver);
		Objhomepage.clickonsignin();
		Objloginpage.verifyloginpage();
		Objloginpage.EnterUsername("tenantusername");
		Objloginpage.EnterPassword("tenantpassword");
		Objloginpage.clickonloginbutton();
		ObjServiceCenterPage.Verifyadminsidebarpresence();
		ObjServiceCenterPage.ClickonLogoutDropdown();
		ObjServiceCenterPage.ClickonLogoutbutton();		
	}
}
