package core;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;


public class KElement implements WebElement{
	protected WebElement webE;
	protected By _by;
	
	public KElement(By b) {
		this._by = b;
	}
	public KElement() {
		super();
	}
	
	
	
	public KElement(String s) {
		_by = By.xpath(s);
	}
	
	public KElement(WebElement webE) {
		super();
		this.webE = webE;
	}
	/*
	 * protected WebElement findElementBy() { return driver.findElement(_by); }
	 */
	public void click() {
		try {
			webE.click();
			}catch(StaleElementReferenceException e) {
				this.click();
			}
	}

	public boolean isDisplayed() {
		return webE.isDisplayed();
	}

	public String getAttribute(String value) {
		return webE.getAttribute(value);
	}

	/*
	 * public void waitControlDisplayed(WebElement e, int time_out) { new
	 * WebDriverWait(driver, time_out).until(ExpectedConditions.visibilityOf(e)); }
	 */

	public boolean isElementDisplay(WebElement e) {
		boolean isPresent = false;
		if (e.isDisplayed()) {
			isPresent = true;
		}
		return isPresent;
	}

	public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
		// TODO Auto-generated method stub
		return null;
	}

	public void submit() {
		// TODO Auto-generated method stub
		
	}

	public void sendKeys(CharSequence... keysToSend) {
		// TODO Auto-generated method stub
		
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public String getTagName() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isSelected() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<WebElement> findElements(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement findElement(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	public Point getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	public Dimension getSize() {
		// TODO Auto-generated method stub
		return null;
	}

	public Rectangle getRect() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCssValue(String propertyName) {
		// TODO Auto-generated method stub
		return null;
	}
}
