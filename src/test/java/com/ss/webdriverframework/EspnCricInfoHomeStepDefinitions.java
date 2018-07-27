package com.ss.webdriverframework;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ss.webdriverframework.pageobjects.EspnCricInfoHomePageObjects;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class EspnCricInfoHomeStepDefinitions {

	private DriverFactory driverFactory;
	private WebPage webPage;
	private EspnCricInfoHomePageObjects espnCricInfoPageObjectsxpaths;

	public EspnCricInfoHomeStepDefinitions(DriverFactory driverFactory) {
		this.driverFactory = driverFactory;
		webPage = new WebPage();
		espnCricInfoPageObjectsxpaths = new EspnCricInfoHomePageObjects();
	}

	@Before
	public void beforeScenario() {
		driverFactory.createChromDriver();
		webPage.maximize(driverFactory.getDriver());
	}

	@After
	public void afterScenario(Scenario scenario) {
		String scnearioName = scenario.getName();
		webPage.takeScreenShot(driverFactory.getDriver(), scnearioName);
		driverFactory.quitDriver();
	}

	@Given("Navigate to \"http://espncricinfo.com\"")
	public void navigateEspnCricInfo() {
		String url = "http://espncricinfo.com";
		webPage.navigate(driverFactory.getDriver(), url);

	}

	@When("Mouseover Stats header")
	public void mouseOverOnStats() {
		WebDriverWait wait = new WebDriverWait(driverFactory.getDriver(), 300);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(espnCricInfoPageObjectsxpaths.xpathOfStats)));
		webPage.mouseOver(driverFactory.getDriver(), espnCricInfoPageObjectsxpaths.xpathOfStats);
	}

	@And("Click on Statsguru")
	public void clickOnStatsguru() {
		WebDriverWait wait = new WebDriverWait(driverFactory.getDriver(), 300);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(espnCricInfoPageObjectsxpaths.xpathOfstatsguru)));
		webPage.click(driverFactory.getDriver(), espnCricInfoPageObjectsxpaths.xpathOfstatsguru);
	}

}
