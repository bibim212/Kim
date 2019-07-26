package core;

import java.util.List;
import core.KElement;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KDriver implements WebDriver {
	protected WebDriver _driver;

	public KDriver() {
	}

	public KDriver(WebDriver d) {
		super();
		this._driver = d;
	}

	public KDriver(String browser) {
		if (_driver == null) {
			String chromePath = "\\drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", PathHelper.getProjectPath() + chromePath);
			_driver = new ChromeDriver();
		}
	}

	protected WebDriver getDriver() {
		return _driver;
	}

	public void get(String url) {
		this._driver.get(url);
	}

	public void close() {
		_driver.close();
	}

	public void quit() {
		_driver.quit();
	}

	public void maximize() {
		this._driver.manage().window().maximize();
	}

	/**
	 * This method makes the driver wait implicitly
	 **/
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	/**
	 * This method makes the driver wait till the web element is located
	 **/
	public void explicitWait(WebElement wb, WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(wb));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method handles alert windows
	 **/
	public void handleAlert(String status, WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		if (status.equalsIgnoreCase("Y")) {
			alert.accept();
		} else if (status.equalsIgnoreCase("N")) {
			alert.dismiss();
		}
	}

	public KElement findElement(By _by) {
		WebDriverWait waiter = new WebDriverWait(this._driver, Constant.TIME_OUT_IN_SECOND);
		return new KElement(waiter.until(ExpectedConditions.presenceOfElementLocated(_by)));
	}

	public String getCurrentUrl() {
		return _driver.getCurrentUrl();
	}

	public String getTitle() {
		return _driver.getTitle();
	}

	public List<WebElement> findElements(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return null;
	}

	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}

	public Navigation navigate() {
		// TODO Auto-generated method stub
		return null;
	}

	public Options manage() {
		// TODO Auto-generated method stub
		return null;
	}
}
