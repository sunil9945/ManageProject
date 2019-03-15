package pageObjects;



import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateJobSheetPage {
	
	WebDriver driver;
	Actions act; WebDriverWait wait; WebElement element;
	String ctitle, mobType, Deleverydate, expdeltime, strDeleverydate;
	
	
	public CreateJobSheetPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	/*********************************************************************************************************************************
	 Customer Information Methods
	 
	 *********************************************************************************************************************************/
	
	@FindBy(id="createJobSheetBtn")
	WebElement createJobSheet; 
	
	@FindBy(id="searchTypeVal")
	WebElement CustormermobNo; 
	
	@FindBy(id="searchListBtn")
	WebElement searchBtn; 
	
	@FindBy(id="createNewCustJs")
	WebElement Createjobbtn;
	
	@FindBy(id="customerTitle")
	WebElement Customernametitle;
	
	@FindBy(id="firstName")
	WebElement firstName;
	
	@FindBy(id="lastName")
	WebElement lastName;
	
	@FindBy(id="emailId")
	WebElement emailId;	
	
	@FindBy(id="address1")
	WebElement address1;
	
	@FindBy(id="address2")
	WebElement address2;
	
	@FindBy(id="productType")
	WebElement productType;
	
	@FindBy(id="brand")
	WebElement brand;
	
	@FindBy(id="modelName")
	WebElement modelName;
	
	@FindBy(id="modelNumber")
	WebElement modelNumber;
	
	@FindBy(id="imeaNo")
	WebElement imeaNo;
	
	@FindBy(id="imeaNo1")
	WebElement imeaNo1;
	
	@FindBy(xpath="//span/span/span/ul/li")
	WebElement reportfault1;	
	
	@FindBy(xpath="//span/span/span/ul/li[2]")
	WebElement reportfault;	

	@FindBy(xpath="//form/ul//textarea[@id='physicalCondition']")
	WebElement physicalcondition;
	
	@FindBy(id="frontDeskExec")
	WebElement frontDeskExec;
	
	@FindBy(id="estimatedCost")
	WebElement estimatedCost;
	
	@FindBy(id="advancePaid")
	WebElement advancePaid;	
	
	@FindBy(xpath="//div[@id='ui-datepicker-div']/table/tbody/tr/td[@data-event='click']")
	WebElement expectedDeliveryDate;
	
	@FindBy(id="expectedDeliveryDate")
	WebElement expectedDelDate;
	
	@FindBy(xpath="//div[5]/ul/li[1]")
	WebElement expectedDeliveryTime;
	
	@FindBy(id="expectedDeliveryTime")
	WebElement expectedDelTime;
	
	@FindBy(xpath="//form/ul/li[3]/ul[3]/li/label/span[2]")
	WebElement sendSms;
	
	@FindBy(id="createJobSheetBtn")
	WebElement createJobSheetBtn;
	
	@FindBy(id="createJobSheetBtn")
	WebElement serviceTypeBtn;
	
	@FindBy(id="expectedDeliveryTime")
	WebElement expectedDelivryTime;
	
	
	public void selectserviceTypebtn(){
		if(serviceTypeBtn.isSelected()){
		//serviceTypeBtn.click();
		}else{
			serviceTypeBtn.click();
		}
	}
	
	public void clickcreatenewJobSheet(){
		createJobSheet.click();
	}
	
	public void enterCustomermobileNo(String strcustomermobno){
		CustormermobNo.sendKeys(strcustomermobno);
	}
	
	public void clickonsearchbtn(){
		searchBtn.click();
	}
	
	public void clickonCreatejobbtn() throws Exception{
		wait = new WebDriverWait(driver, 100);
		element = wait.until(ExpectedConditions.elementToBeClickable(Createjobbtn));
		Createjobbtn.click();
	}
	
	public void selectcustomerTitle(){
		Customernametitle.click();
		Select sl =new Select(Customernametitle);
		sl.selectByIndex(1);
	}
	
	public void entercustomerfirstname(String strFirstName){
		firstName.sendKeys(strFirstName);
	}
	
	public void entercustomerlastname(String strlastname){
		lastName.sendKeys(strlastname);
	}
	
	public void enteremailid(String strEmailid){
		emailId.sendKeys(strEmailid);
	}
	
	public void enteraddress1(String strAddress1){
		address1.sendKeys(strAddress1);
	}
	
	public void enteraddress2(String strAddress2){
		address2.sendKeys(strAddress2);
	}
	
	public String selectmobiletype(){
		productType.click();
		Select sl =new Select(productType);
		sl.selectByIndex(0);
		return mobType = sl.getFirstSelectedOption().getText();
	}
	
	public void enterbrandname(String strbrand){
		brand.sendKeys(strbrand);
	}
	
	public void entermodel(String strmodel){
		modelName.sendKeys(strmodel);
	}
	
	public void entermodelno(String strmodelnumber){
		modelNumber.sendKeys(strmodelnumber);
	}
	
	public void enterimeaNo1(String stremia1){
		imeaNo.sendKeys(stremia1);
	}
	
	public void enterimeaNo2(String stremia2){
		imeaNo1.sendKeys(stremia2);
	}
	
	public void enterreportfault(String strfault){
		act = new Actions(driver);
		reportfault1.click();		
		act.moveToElement(reportfault).click().build().perform();
		
	}
	
	public void enterphysicalcondition(String strphysicalstate){
		physicalcondition.sendKeys(strphysicalstate);
	}
	
	public void enterFrontEndExecutive(String strfrontexecutive){
		frontDeskExec.sendKeys(strfrontexecutive);
	}
	
	public String eneterEstimatedCost(String strestimatedcost){
		estimatedCost.sendKeys(strestimatedcost);
		return Deleverydate = estimatedCost.getText();
		
	}
	
	public void EnterAdvancePaid(){
		advancePaid.sendKeys("");
	}
	
	public String selectExpecteddeliveryDate() throws Exception{
		expectedDelDate.click();
		expectedDeliveryDate.click();
		return strDeleverydate = expectedDelDate.getAttribute("value");
		
	}
	
	
	public String selectExpecteddeliverytime(){
		Select sl =new Select(productType);
		sl.selectByIndex(0);
		expectedDelTime.click();
		act.moveToElement(expectedDeliveryTime).click().build().perform();
		return expdeltime = expectedDelTime.getAttribute("value");
	}
	
	public void selectrestrictsmsalert(){
		if(sendSms.isSelected()){
	//	sendSms.click();
		}else{
			sendSms.click();
		}
	}
	
	public void clickonsavebtn(){
		createJobSheetBtn.click();
	}
	
		
/*************************************************************************************************************************************
 * ##JobSheet data verification methods##
 * 
 * **********************************************************************************************************************************/	
	
	
	@FindBy(id="firstNameConfirm")
	WebElement verifyfirstname;
	
	@FindBy(id="lastNameConfirm")
	WebElement verifylaststname;
	
	@FindBy(id="phoneNumberConfirm")
	WebElement verifyphoneNumber;
	
	@FindBy(id="emailIdConfirm")
	WebElement verifyemail;
	
	@FindBy(id="address1Confirm")
	WebElement verifyaddress1;
	
	@FindBy(id="address2Confirm")
	WebElement verifyaddress2;
	
	@FindBy(id="productTypeConfirm")
	WebElement verifyproductType;
	
	@FindBy(id="brandConfirm")
	WebElement verifybrand;
	
	@FindBy(id="modelNameConfirm")
	WebElement verifymodelName;
	
	@FindBy(id="modelNumberConfirm")
	WebElement verifymodelnumber;
	
	@FindBy(id="imeaNoConfirm")
	WebElement verifyimeaNo1;
	
	@FindBy(id="imeaNo1Confirm")
	WebElement verifyimeaNo2;
	
	@FindBy(id="reportedFaultConfirm")
	WebElement verifyreportedFault;
	
	@FindBy(id="physicalConditionConfirm")
	WebElement verifyphysicalCondition;
	
	@FindBy(id="frontDeskExecConfirm")
	WebElement verifyfrontDeskExec;
	
	@FindBy(id="estimatedCostConfirm")
	WebElement verifyestimatedCost;
	
	@FindBy(id="expectedDeliveryDateValConfirm")
	WebElement verifyexpectedDeliveryDate;
	
	@FindBy(id="expectedDeliveryTimeValConfirm")
	WebElement verifyexpectedDeliverytime;
	
	@FindBy(id="createJobSheetBtnConfirm")
	WebElement clickonconfirm;
	

	public void verifyfirstname(String strFirstName){
		assertEquals(verifyfirstname.getText().substring(4), strFirstName);
	}
	
	public void verifylaststname(String strlastname){
		assertEquals(verifylaststname.getText(), strlastname);
	}
	
	public void verifymobileno(String strcustomermobno){
		assertEquals(verifyphoneNumber.getText(), strcustomermobno);
	}
	
	public void verifyemail(String strEmailid){
		assertEquals(verifyemail.getText(), strEmailid);
	}
	
	public void verifyaddress1(String strAddress1){
		assertEquals(verifyaddress1.getText(), strAddress1);
	}
	
	public void verifyaddress2(String strAddress2){
		assertEquals(verifyaddress2.getText(), strAddress2);
	}
	
	public void verifyproductType(String mobtype2){
		assertEquals(verifyproductType.getText(), mobtype2);
	}
	
	public void verifybrand(String strbrand){
		assertEquals(verifybrand.getText(), strbrand);
	}
	
	public void verifymodelName(String strmodel){
		assertEquals(verifymodelName.getText(), strmodel);
	}
	
	public void verifymodelnumber(String strmodelnumber){
		assertEquals(verifymodelnumber.getText(), strmodelnumber);
	}
	
	public void verifyimeaNo1(String stremia1){
		assertEquals(verifyimeaNo1.getText(), stremia1);
	}
	
	public void verifyimeaNo2(String stremia2){
		assertEquals(verifyimeaNo2.getText(), stremia2);
	}
	
	public void verifyfault(String strfault){
		assertEquals(verifyreportedFault.getText(), strfault);
	}
	
	public void verifyphysicalstate(String strphysicalstate){
		assertEquals(verifyphysicalCondition.getText(), strphysicalstate);
	}
	
	public void verifyfrontDeskExec(String strfrontexecutive){
		assertEquals(verifyfrontDeskExec.getText(), strfrontexecutive);
	}
	
	public void verifyestimatedCost(String strestimatedcost){
		assertEquals(verifyestimatedCost.getText(), strestimatedcost);
	}
	
	public void verifyexpdelleverydate(String deleverydate){
		assertEquals(verifyexpectedDeliveryDate.getText(), deleverydate);
	}
	
	public void verifyexpectedDeliverytime(String expdeleverytime){
		assertEquals(verifyexpectedDeliverytime.getText(), expdeleverytime);
	}
	
	public void clickonconfirmbtn(){
		clickonconfirm.click();
	}
	
	/*********************************************************************************************************************************
	 InitialCheck information Methods
	 
	 *********************************************************************************************************************************/
	@FindBy(xpath="//span[1][@id='jsNumber']")
	WebElement verifyjobsheetno;
	
	@FindBy(id="initialCheckDate")
	WebElement clickoninitialCheckDatefield;
	
	@FindBy(xpath="//div[@id='ui-datepicker-div']/table/tbody/tr/td[@data-event='click']")
	WebElement selectinitialCheckDate;
	
	@FindBy(id="initialIncharge")
	WebElement EnterinitialIncharge;
	
	@FindBy(id="problemDiagonasied")
	WebElement EnterProblemDiagnosed;
	
	public void verifyjobsheetno(String jobsheetNo) throws Exception{
		assertEquals(verifyjobsheetno.getText().replaceAll("\\s", ""), jobsheetNo);
		
	}
	
	public String selectInitialCheckDate() throws Exception{
		clickoninitialCheckDatefield.click();
		selectinitialCheckDate.click();
		return  clickoninitialCheckDatefield.getAttribute("value");
		
	}
	
	public void Enterincharge(String strinitialIncharge){
		EnterinitialIncharge.sendKeys(strinitialIncharge);
	}
	
	public void EnterProblemDiagnosed(String strProblemDiagnosed){
		EnterProblemDiagnosed.sendKeys(strProblemDiagnosed);
	}
	

	/*********************************************************************************************************************************
	 Service Information Methods
	 
	 *********************************************************************************************************************************/
	
	@FindBy(id="serviceDate")
	WebElement clickonserviceDatefield;
	
	@FindBy(xpath="//div[@id='ui-datepicker-div']/table/tbody/tr/td[@data-event='click']")
	WebElement selectserviceDate;
	
	@FindBy(id="serviceIncharge")
	WebElement eneterserviceincharge;
	
	@FindBy(id="serviceRemark")
	WebElement enterserviceincharge;
	
	@FindBy(id="addItem")
	WebElement clickonaddcomponentfrominventory;
	
	@FindBy(id="addNonInventoryItem")
	WebElement clickonaddcomponent;
	
	@FindBy(id="addNonInventoryItem")
	WebElement EnterComponentname;
	
	@FindBy(id="addNonInventoryItem")
	WebElement EnterHSNno;
	
	@FindBy(id="addNonInventoryItem")
	WebElement EnterRate;
	
	@FindBy(id="addNonInventoryItem")
	WebElement EnterSLno;
	
	@FindBy(id="addNonInventoryItem")
	WebElement EnterWarranty;
	
	@FindBy(id="addNonInventoryItem")
	WebElement Enterquantity;
	
	public String selectserviceDate() throws Exception{
		clickonserviceDatefield.click();
		selectserviceDate.click();
		return  clickonserviceDatefield.getAttribute("value");
		
	}
	
	public void Enterserviceincharge(String strselectserviceincharge){
		eneterserviceincharge.sendKeys(strselectserviceincharge);
	}
	
	public void Enterserviceremark(String strselectserviceremark){
		enterserviceincharge.sendKeys(strselectserviceremark);
	}
		
	public void selectcompnentfrominventory(){
		clickonaddcomponentfrominventory.click();
	}
	
	public void selectaddCompnent(){
		clickonaddcomponent.click();
	}
	
	public void EnetercompnentName(){
		EnterComponentname.sendKeys("");
	}
	
	public void EneterHSNcodeNO(){
		EnterHSNno.sendKeys("");
	}
	
	public void EneterRate(){
		EnterRate.sendKeys("");
	}
	
	public void EneterSerialNo(){
		EnterSLno.sendKeys("");
	}
	
	public void EneterWarranty(){
		EnterWarranty.sendKeys("");
	}
	
	public void EneterQuantity(){
		Enterquantity.click();
	}
	
}
