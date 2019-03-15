package testClases;

import org.testng.annotations.Test;

import configurations.BasicConfig;
import pageObjects.BusinessCenterDetailsPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ReportsPage;
import pageObjects.ServiceCenterPage;
import testdata.BusinessCenterTestdata;

public class CreateStore extends BasicConfig{
	String BCenterName, strcenterName,straddress1,straddress2,strcity,strcontactnum,straddcontactnum,
	strminservicecharge,strdate;
	//calculation
	@Test(priority=1)
	public void CretenewStore() throws Exception{
		
		HomePage Objhomepage = new HomePage(driver);
		LoginPage Objloginpage = new LoginPage(driver);
		ServiceCenterPage ObjServiceCenterPage = new ServiceCenterPage(driver);
		BusinessCenterDetailsPage objBusinessCenterDetailsPage = new BusinessCenterDetailsPage(driver);
		ReportsPage objReportsPage= new ReportsPage(driver);
		Objhomepage.clickonsignin();
		Objloginpage.verifyloginpage();
		Objloginpage.EnterUsername("tenantusername");
		Objloginpage.EnterPassword("tenantpassword");
		Objloginpage.clickonloginbutton();
		ObjServiceCenterPage.Verifyaddstorebutton();
		BCenterName = objBusinessCenterDetailsPage.EnterName(BusinessCenterTestdata.strCenterName);
		straddress1 = objBusinessCenterDetailsPage.EnterAddress1(BusinessCenterTestdata.strAddress1);
		straddress2 = objBusinessCenterDetailsPage.EnterAddress2(BusinessCenterTestdata.strAddress2);
		strcity = objBusinessCenterDetailsPage.EnterCity(BusinessCenterTestdata.strCity);
		strcontactnum = objBusinessCenterDetailsPage.EnterContactnumber(BusinessCenterTestdata.strContactnumber);
		straddcontactnum = objBusinessCenterDetailsPage.EnteraddContactnumber(BusinessCenterTestdata.straddContactnumber);
		strminservicecharge = objBusinessCenterDetailsPage.EnterminimumCharge(BusinessCenterTestdata.strminimumCharge);
		//objBusinessCenterDetailsPage.Entersignature();
		strdate = objBusinessCenterDetailsPage.GetcurrentDate();
		objBusinessCenterDetailsPage.SelectLicenseGroup();		
		objBusinessCenterDetailsPage.ClickonSave();
		ObjServiceCenterPage.Verifybusinesscenterpage();
		ObjServiceCenterPage.Verifycreatedstore(BCenterName, straddress1, straddress2);
		objBusinessCenterDetailsPage.VerifyBCenterspage();	
		objBusinessCenterDetailsPage.verifystorename(BCenterName);
		objBusinessCenterDetailsPage.verifyRegdate(strdate);
		objBusinessCenterDetailsPage.verifycity(strcity);
		objBusinessCenterDetailsPage.Verifyaddress1(straddress1, straddress2);
		objBusinessCenterDetailsPage.verifylandline1(strcontactnum);
		objBusinessCenterDetailsPage.verifylandline2(straddcontactnum);
		objBusinessCenterDetailsPage.verifyminServChrge(strminservicecharge);
		ObjServiceCenterPage.Clickonadmin();
		ObjServiceCenterPage.ClickonReports();
		objReportsPage.ClickonBusinesscenterdropdown(BCenterName);
		ObjServiceCenterPage.ClickonLogoutDropdown();
		ObjServiceCenterPage.ClickonLogoutbutton();			
		
	}
}
