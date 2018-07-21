package com.ss.webdriverframework;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.ss.webdriverframework.pageobjects.EspnCricInfoPageObjects;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EspnCricInfoStepDefinitions {

	WebDriver driver;
	WebPage webPage;
	EspnCricInfoPageObjects espnCricInfoPageObjectsxpaths;

	public EspnCricInfoStepDefinitions() {
		webPage = new WebPage();
		espnCricInfoPageObjectsxpaths = new EspnCricInfoPageObjects();
		System.setProperty("webdriver.chrome.driver",
				"F:\\Sowmya-Agile Training\\Venus\\Documents\\webdriver-framework\\src\\test\\resources\\drivers\\chromedriver.exe");

	}

	@Before
	public void beforeScenario() {
		driver = new ChromeDriver();
		webPage.maximize(driver);
	}

	@After
	public void afterScenario(Scenario scenario) {
		String scnearioName = scenario.getName();
		webPage.takeScreenShot(driver, scnearioName);
		driver.quit();
	}

	@Given("Navigate to \"http://espncricinfo.com\"")
	public void navigateEspnCricInfo() {
		String url = "http://espncricinfo.com";
		webPage.navigate(driver, url);

	}

	@When("Mouseover Stats header")
	public void mouseOverOnStats() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(espnCricInfoPageObjectsxpaths.xpathOfStats)));
		webPage.mouseOver(driver, espnCricInfoPageObjectsxpaths.xpathOfStats);
	}

	@And("Click on Statsguru")
	public void clickOnStatsguru() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(espnCricInfoPageObjectsxpaths.xpathOfstatsguru)));
		webPage.click(driver, espnCricInfoPageObjectsxpaths.xpathOfstatsguru);
	}

	@Then("\"Welcome to the latest release of Statsguru, Cricinfo's searchable cricket statistics database\" is displayed")
	public void isWelcomeToTheLatestReleaseIsDisplayed() {
		boolean output = webPage.isDisplayed(driver, espnCricInfoPageObjectsxpaths.xpathOfWelcomeToTheLatestRelease);
		Assert.assertEquals(true, output);
	}

	@Then("\"Tests\" tab is displayed")
	public void isTestDisplayed() {
		boolean output = webPage.isDisplayed(driver,
				espnCricInfoPageObjectsxpaths.xpathOfTestsInBelowOfStatsguruRecords);
		Assert.assertEquals(true, output);
	}

	@And("\"ODIs\" tab is displayed")
	public void isODIsDisplayed() {
		boolean output = webPage.isDisplayed(driver,
				espnCricInfoPageObjectsxpaths.xpathOfODIsInBelowOfStatsguruRecords);
		Assert.assertEquals(true, output);
	}

	@And("\"T20Is\" tab is displayed")
	public void isT20IsDispayed() {
		boolean output = webPage.isDisplayed(driver,
				espnCricInfoPageObjectsxpaths.xpathofT20IsInBelowOfStatsguruRecords);
		Assert.assertEquals(true, output);
	}

	@And("\"All Test/ODI/T20I\" tab is displayed")
	public void isAllTestAndODIAndT20IisDisplayed() {
		boolean output = webPage.isDisplayed(driver,
				espnCricInfoPageObjectsxpaths.xpathofTestODIsT20IInBelowOfStatsguruRecords);
		Assert.assertEquals(true, output);
	}

	@When("Click on batting under tests")
	public void clickOnBattingUnderTest() {
		webPage.click(driver, espnCricInfoPageObjectsxpaths.xpathOfBattingUnderTest);
	}

	@And("select team \"India\"")
	public void selectedTeam() {
		webPage.selectValueFromDropDown(driver, espnCricInfoPageObjectsxpaths.xpathOfTeamUnderBatting, "India");
	}

	@And("Click on Submit Query")
	public void clickOnSubmitQuery() {
		webPage.click(driver, espnCricInfoPageObjectsxpaths.xpathOfSumbitQueryUnderBatting);
	}

	@Then("Records related to India are displayed")
	public void selectedteamRecordsAreDisplayed() {
		boolean output = webPage.isDisplayed(driver, espnCricInfoPageObjectsxpaths.xpathOfPrimaryTeam);
		Assert.assertEquals(true, output);
	}

}
