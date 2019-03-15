package pageObjects;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ReportsPage {

	WebDriver driver;

	public ReportsPage(WebDriver driver) {
//		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "storesDrpDown")
	WebElement ClickonBusinesscenterdropdown;	
	
	public void ClickonBusinesscenterdropdown(String BCenterName) throws Exception{
		Thread.sleep(3000);
		ClickonBusinesscenterdropdown.click();
		Select sl = new Select(ClickonBusinesscenterdropdown);
		List<WebElement> listoptions = sl.getOptions();
		for(int i=0;i<=listoptions.size()-1;i++){	
			if(listoptions.get(i).getText().equalsIgnoreCase(BCenterName)){
				assertEquals(listoptions.get(i).getText(), BCenterName);
				
			}
			
		}
	}
	
	
	
}
