package ToolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

import core.KDriver;
import core.Link;
import wrapper.G4Button;

public class GeneralPage {
	protected KDriver _driver;
	
	private final By _lnkHomePage = By.xpath("//div[@class='ccpanels']//span[contains(@onclick, 'openAddPanel')]");
	
	private Link lnkHomePage = new Link(_lnkHomePage);	
	private Link lnkInteractions = new Link("//a[contains(@href,'interactions')]");
	private Link lnkTooltipDoubleClick = new Link("//li[@class='menu-item']//a[contains(@href,'tooltip-and-double-click')]");
	private Link lnkWidgets = new Link("//a[contains(@href,'widgets')]");
	
	
	/*
	 * private final By _btnCreatePanel =
	 * By.xpath("//div[@class='ccpanels']//span[contains(@onclick, 'openAddPanel')]"
	 * ); private final By _btnHide =
	 * By.xpath("//div[@class='ccpanels']//span[@id='btnHidePanel']");
	 * 
	 * private final G4Button btnCreatePanel = new G4Button(_btnCreatePanel);
	 * private final G4Button btnHide = new G4Button(_btnHide);
	 */
	
	
	
	public HomePage gotoHomePage() {
		lnkHomePage.click();
		return new HomePage();
	}

	public InteractionsPage gotoInteractionsPage() {
		lnkInteractions.click();
		return new InteractionsPage(_driver);
	}
	
	public TooltipDoubleClickPage gotoToolTipDoubleClickPage() {
		lnkTooltipDoubleClick.click();
		return new TooltipDoubleClickPage();
	}
	
	public WidgetsPage gotoWidgetsPage() {
		lnkWidgets.click();
		return new WidgetsPage();
	}
}
