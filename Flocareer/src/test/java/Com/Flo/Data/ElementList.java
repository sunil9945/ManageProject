package Com.Flo.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementList {

	public WebDriver driver;
	WebDriverWait wait;
	WebElement element;
	boolean elementpresent;
	int i = 0;

	public ElementList(WebDriver driver1) {
		this.driver = driver1;
	}

	public WebElement element(String locator, String locatorStrategy) {
		switch (locatorStrategy) {

		case "id":
			element = driver.findElement(By.id(locator));
			break;

		case "name":
			element = driver.findElement(By.name(locator));
			break;

		case "className":
			element = driver.findElement(By.className(locator));
			break;

		case "cssSelector":
			element = driver.findElement(By.cssSelector(locator));
			break;

		case "xpath":
			element = driver.findElement(By.xpath(locator));
			break;

		case "tagName":
			element = driver.findElement(By.tagName(locator));
			break;

		case "linkText":
			element = driver.findElement(By.linkText(locator));
			break;
		}

		return element;

	}

	public boolean waitForElement(String locator, String locatorstrategy) {

		do {
			if (locatorstrategy.equals("id")) {
				elementpresent = driver.findElement(By.id(locator)).isDisplayed();
				i++;
			}

			else if (locatorstrategy.equals("name")) {
				elementpresent = driver.findElement(By.name(locator)).isDisplayed();
				i++;
			}

			else if (locatorstrategy.equals("className")) {
				elementpresent = driver.findElement(By.className(locator)).isDisplayed();
				i++;
			}

			else if (locatorstrategy.equals("cssSelector")) {
				elementpresent = driver.findElement(By.cssSelector(locator)).isDisplayed();
				i++;
			}

			else if (locatorstrategy.equals("xpath")) {
				elementpresent = driver.findElement(By.xpath(locator)).isDisplayed();
				i++;
			}

			else if (locatorstrategy.equals("tagName")) {
				elementpresent = driver.findElement(By.tagName(locator)).isDisplayed();
				i++;
			}

			else if (locatorstrategy.equals("linkText")) {
				elementpresent = driver.findElement(By.linkText(locator)).isDisplayed();
				i++;
			}
		} while (elementpresent && i < 3);
		return elementpresent;

	}

}
