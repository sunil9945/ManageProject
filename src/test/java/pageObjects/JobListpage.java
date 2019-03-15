package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobListpage {

	WebDriver driver;

	public JobListpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "storeNameLink")
	WebElement centernamelink;

	@FindBy(xpath = "//div/span[2][@id='jobSheetNo']")
	WebElement getjobsheetno;

	@FindBy(xpath = "//div[@id='storeNameLink']/span")
	WebElement findfirstname;

	@FindBy(xpath = "//tbody[@id='jobListsBoday']/tr/td[3]")
	List<WebElement> jobsheetnumberslist;

	public void clickonCenternamelink() {
		centernamelink.click();
	}

	public String getjobsheetno() {
		return getjobsheetno.getText();
	}

	public void findnewjobsheet(String jobsheetNo) throws Exception {
		List<WebElement> jbsheetnos = jobsheetnumberslist;
		for (int i = 0; i <= jbsheetnos.size()-1; i++) {
			if (jbsheetnos.get(i).getText().equalsIgnoreCase(jobsheetNo)) {
				Thread.sleep(200);
				driver.findElement(By.xpath("//tbody[@id='jobListsBoday']/tr[" + i+1 +"]/td[12]")).click();
			}

		}

	}

}
