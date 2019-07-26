package ToolsQA;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import core.Constant;
import core.KDriver;
import core.KDriverBase;

public class BaseTests {
	//protected LogHelper logHelper = new LogHelper(this.getClass());
	//protected KDriver driver = new KDriver();
	public KDriver driver;
	public HomePage homepage = new HomePage();

	@BeforeMethod
	public void setUp() {
	//	driver.webDriverDefinition();
		KDriverBase.createDriver("Chrome");
		driver = KDriverBase.getDriver();
		driver.maximize();
		driver.get(Constant.TOOLSQA_URL);
		//homepage.openRailway();
	}

	@AfterMethod
	public void afterMethod() {
		//driver.quit();
	}
}
