package testClases;

import org.testng.annotations.Test;

import configurations.BasicConfig;
import pageObjects.CreateJobSheetPage;
import pageObjects.HomePage;
import pageObjects.JobListpage;
import pageObjects.LoginPage;
import pageObjects.ServiceCenterPage;
import pageObjects.ServicePage;
import testdata.JobsheetTestData;

public class Createjobsheet extends BasicConfig {
	String mobtype, deleverydate, expdeleverytime, jobsheetNo, strinitialcheckdate, strservicedate;

	@Test
	public void createjobsheets() throws Exception {
		HomePage Objhomepage = new HomePage(driver);
		LoginPage Objloginpage = new LoginPage(driver);
		ServiceCenterPage ObjServiceCenterPage = new ServiceCenterPage(driver);
		ServicePage objServicePage = new ServicePage(driver);
		CreateJobSheetPage objCreateJobSheetPage = new CreateJobSheetPage(driver);
		JobListpage objJobListpage = new JobListpage(driver);
		Objhomepage.clickonsignin();
		Objloginpage.EnterUsername("tenantusername");
		Objloginpage.EnterPassword("tenantpassword");
		Objloginpage.clickonloginbutton();
		ObjServiceCenterPage.selectEnterbusinesscenter();
		objServicePage.verifyservicepage();
		objServicePage.clickonCreatejobsheetbtn();
		objCreateJobSheetPage.enterCustomermobileNo(JobsheetTestData.strcustomermobno);
		objCreateJobSheetPage.clickonsearchbtn();
		objCreateJobSheetPage.clickonCreatejobbtn();
		objCreateJobSheetPage.selectcustomerTitle();
		objCreateJobSheetPage.selectserviceTypebtn();
		objCreateJobSheetPage.entercustomerfirstname(JobsheetTestData.strFirstName);
		objCreateJobSheetPage.entercustomerlastname(JobsheetTestData.strlastname);
		objCreateJobSheetPage.enteremailid(JobsheetTestData.strEmailid);
		objCreateJobSheetPage.enteraddress1(JobsheetTestData.strAddress1);
		objCreateJobSheetPage.enteraddress2(JobsheetTestData.strAddress2);
		mobtype = objCreateJobSheetPage.selectmobiletype();
		objCreateJobSheetPage.enterbrandname(JobsheetTestData.strbrand);
		objCreateJobSheetPage.entermodel(JobsheetTestData.strmodel);
		objCreateJobSheetPage.entermodelno(JobsheetTestData.strmodelnumber);
		objCreateJobSheetPage.enterimeaNo1(JobsheetTestData.stremia1);
		objCreateJobSheetPage.enterimeaNo2(JobsheetTestData.stremia2);
		objCreateJobSheetPage.enterreportfault(JobsheetTestData.strfault);
		objCreateJobSheetPage.enterphysicalcondition(JobsheetTestData.strphysicalstate);
		objCreateJobSheetPage.enterFrontEndExecutive(JobsheetTestData.strfrontexecutive);
		objCreateJobSheetPage.eneterEstimatedCost(JobsheetTestData.strestimatedcost);
		objCreateJobSheetPage.EnterAdvancePaid();
		deleverydate = objCreateJobSheetPage.selectExpecteddeliveryDate();
		expdeleverytime = objCreateJobSheetPage.selectExpecteddeliverytime();
		objCreateJobSheetPage.selectrestrictsmsalert();
		objCreateJobSheetPage.clickonsavebtn();
		objCreateJobSheetPage.verifyfirstname(JobsheetTestData.strFirstName);
		objCreateJobSheetPage.verifylaststname(JobsheetTestData.strlastname);
		objCreateJobSheetPage.verifymobileno(JobsheetTestData.strcustomermobno);
		objCreateJobSheetPage.verifyemail(JobsheetTestData.strEmailid);
		objCreateJobSheetPage.verifyaddress1(JobsheetTestData.strAddress1);
		objCreateJobSheetPage.verifyaddress2(JobsheetTestData.strAddress2);
		objCreateJobSheetPage.verifyproductType(mobtype);
		objCreateJobSheetPage.verifybrand(JobsheetTestData.strbrand);
		objCreateJobSheetPage.verifymodelName(JobsheetTestData.strmodel);
		objCreateJobSheetPage.verifymodelnumber(JobsheetTestData.strmodelnumber);
		objCreateJobSheetPage.verifyimeaNo1(JobsheetTestData.stremia1);
		objCreateJobSheetPage.verifyimeaNo2(JobsheetTestData.stremia2);
		objCreateJobSheetPage.verifyfault(JobsheetTestData.strfault);
		objCreateJobSheetPage.verifyphysicalstate(JobsheetTestData.strphysicalstate);
		objCreateJobSheetPage.verifyfrontDeskExec(JobsheetTestData.strfrontexecutive);
		objCreateJobSheetPage.verifyestimatedCost(JobsheetTestData.strestimatedcost);
		objCreateJobSheetPage.verifyexpdelleverydate(deleverydate);
		objCreateJobSheetPage.verifyexpectedDeliverytime(expdeleverytime);
		objCreateJobSheetPage.clickonconfirmbtn();
		jobsheetNo=objJobListpage.getjobsheetno();
		objJobListpage.clickonCenternamelink();
		objJobListpage.findnewjobsheet(jobsheetNo);
		objCreateJobSheetPage.verifyjobsheetno(jobsheetNo);
		strinitialcheckdate =  objCreateJobSheetPage.selectInitialCheckDate();
		objCreateJobSheetPage.Enterincharge(JobsheetTestData.strinitialIncharge);
		objCreateJobSheetPage.EnterProblemDiagnosed(JobsheetTestData.strProblemDiagnosed);
		strservicedate = objCreateJobSheetPage.selectserviceDate();
		
		System.out.println("Executed successfully");
	}
}
