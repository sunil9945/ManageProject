package Com.Flo.Pages.jobseekers;

import org.openqa.selenium.WebDriver;

import Com.Flo.Data.ElementList;
import Com.Flo.Data.locators.jobseeker.JobSeekerHomePage_Locators;

public class Jobseekerhomepage extends ElementList{
	WebDriver driver;
	
	public Jobseekerhomepage(WebDriver driver) {
		super(driver);
	}
	
	public Jobseekerhomepage ClickOnHamburger(){
		this.waitForElement(JobSeekerHomePage_Locators.JOOBSEEKER_HAMBERGUR, "id");
		this.element(JobSeekerHomePage_Locators.JOOBSEEKER_HAMBERGUR, "id").click();		
		return this;
	}
	
	public Jobseekerhomepage ClickOnJobs(){
		this.waitForElement(JobSeekerHomePage_Locators.JOBS_LINK, "linkText");
		this.element(JobSeekerHomePage_Locators.JOBS_LINK, "linkText").click();
		return this;
	}

}
