package Com.Flo.configuration.Config.Common_Functions;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Common_Methods {
	WebDriver driver;
	
		
	public Common_Methods(WebDriver driver) {
		this.driver=driver;
	}

	public Actions Mouse_Hover() throws Exception{
		Thread.sleep(4000);		
		System.out.println(this.driver) ;
		Actions action = new Actions(this.driver);        
		return action;		
	}
	
	public Common_Methods Select_Functions(WebElement element, String category ) throws Exception{
		Select sel = new Select(element);
		Thread.sleep(2000);
		sel.selectByVisibleText(category);
		return this;
	}
	
	public Common_Methods Scroll_Functions(WebDriver driver1) throws Exception{
		JavascriptExecutor jse = (JavascriptExecutor)driver1;
		jse.executeScript("window.scrollBy(0,600)", "");
		return this;
}
}
