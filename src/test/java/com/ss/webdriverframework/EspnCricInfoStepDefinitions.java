package com.ss.webdriverframework;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.ss.webdriverframework.pageobjects.BattingRecordsUnderTestPageObjects;
import com.ss.webdriverframework.pageobjects.EspnCricInfoHomePageObjects;
import com.ss.webdriverframework.pageobjects.PrimaryTeamOfBattingRecordsUnderTestPageObjects;
import com.ss.webdriverframework.pageobjects.StatsGuruPageObjects;

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
	EspnCricInfoHomePageObjects espnCricInfoPageObjectsxpaths;
	StatsGuruPageObjects statsGuruPageObjectsXpaths;
	BattingRecordsUnderTestPageObjects battingRecordsUnderTestPageObjectsXpaths;
	PrimaryTeamOfBattingRecordsUnderTestPageObjects primaryTeamOfBattingRecordsUnderTestPageObjectsXpaths;

	public EspnCricInfoStepDefinitions() {
		webPage = new WebPage();
		espnCricInfoPageObjectsxpaths = new EspnCricInfoHomePageObjects();
		statsGuruPageObjectsXpaths = new StatsGuruPageObjects();
		battingRecordsUnderTestPageObjectsXpaths = new BattingRecordsUnderTestPageObjects();
		primaryTeamOfBattingRecordsUnderTestPageObjectsXpaths = new PrimaryTeamOfBattingRecordsUnderTestPageObjects();
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
		WebDriverWait wait = new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(espnCricInfoPageObjectsxpaths.xpathOfstatsguru)));
		webPage.click(driver, espnCricInfoPageObjectsxpaths.xpathOfstatsguru);
	}

	@Then("\"Welcome to the latest release of Statsguru, Cricinfo's searchable cricket statistics database\" is displayed")
	public void isWelcomeToTheLatestReleaseIsDisplayed() {
		boolean output = webPage.isDisplayed(driver, statsGuruPageObjectsXpaths.xpathOfWelcomeToTheLatestRelease);
		Assert.assertEquals(true, output);
	}

	@Then("\"Tests\" tab is displayed")
	public void isTestDisplayed() {
		WebDriverWait wait = new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(statsGuruPageObjectsXpaths.xpathOfTestsInBelowOfStatsguruRecords)));
		boolean output = webPage.isDisplayed(driver, statsGuruPageObjectsXpaths.xpathOfTestsInBelowOfStatsguruRecords);
		Assert.assertEquals(true, output);
	}

	@And("\"ODIs\" tab is displayed")
	public void isODIsDisplayed() {
		boolean output = webPage.isDisplayed(driver, statsGuruPageObjectsXpaths.xpathOfODIsInBelowOfStatsguruRecords);
		Assert.assertEquals(true, output);
	}

	@And("\"T20Is\" tab is displayed")
	public void isT20IsDispayed() {
		boolean output = webPage.isDisplayed(driver, statsGuruPageObjectsXpaths.xpathofT20IsInBelowOfStatsguruRecords);
		Assert.assertEquals(true, output);
	}

	@And("\"All Test/ODI/T20I\" tab is displayed")
	public void isAllTestAndODIAndT20IisDisplayed() {
		boolean output = webPage.isDisplayed(driver,
				statsGuruPageObjectsXpaths.xpathofTestODIsT20IInBelowOfStatsguruRecords);
		Assert.assertEquals(true, output);
	}

	@When("Click on batting under tests")
	public void clickOnBattingUnderTest() {
		webPage.click(driver, statsGuruPageObjectsXpaths.xpathOfBattingUnderTest);
	}

	@And("select team \"(.*)\"")
	public void selectedTeam(String countryName) {
		webPage.selectVisibleTextFromDropDown(driver, battingRecordsUnderTestPageObjectsXpaths.xpathOfTeamUnderBatting,
				countryName);
	}

	@And("Select opposition team \"(.*)\"")
	public void selectedOppositionTeam(String oppistionCountryName) {
		webPage.selectVisibleTextFromDropDown(driver,
				battingRecordsUnderTestPageObjectsXpaths.xpathOfOppositionTeamUnderBatting,oppistionCountryName );
	}

	@And("Select \"home venue\" check box of Home or away")
	public void selectCheckBox() {
		webPage.selectCheckBox(driver, battingRecordsUnderTestPageObjectsXpaths.xpathOfHomeVenueCheckBoxUnderBatting);
	}

	@And("Select Host country \"(.*)\"")
	public void selectHostCountry(String hostCountry) {
		webPage.selectVisibleTextFromDropDown(driver, battingRecordsUnderTestPageObjectsXpaths.xpathOfHostCountryUnderBatting,
				hostCountry);
	}

	@And("Select ground \"(.*)\"")
	public void selectGround(String selectGround) {
		
		webPage.selectVisibleTextFromDropDown(driver, battingRecordsUnderTestPageObjectsXpaths.xpathOfGroundUnderBatting, selectGround);
	}

	@And("send keys Starting date of From \"24/07/2018\"")
	public void fromOfStartingDate() {
		webPage.sendKeys(driver, "24/07/2018", battingRecordsUnderTestPageObjectsXpaths.xpath_fromOfStartingDate);
	}

	@And("send keys of Starting date of to \"28/07/2018\"")
	public void toOfStartingDate() {
		webPage.sendKeys(driver, "28/07/2018", battingRecordsUnderTestPageObjectsXpaths.xpath_toOfStartingDate);
	}

	@And("select season \"(.*)\"")
	public void selectSeason(String season) {
		
		webPage.selectVisibleTextFromDropDown(driver, battingRecordsUnderTestPageObjectsXpaths.selectSeasonOfBattingTest, season);
	}
	
	@And("\"Won match\" checkBox is selected")
	public void selectMatchResultCheckBox()
	{
		webPage.selectCheckBox(driver, battingRecordsUnderTestPageObjectsXpaths.selectWonMatchCheckBoxOfBattingTest);
	}
	
	@And("\"Series averages\" radio buttion is selected from view format")
	public void selectViewFormateRadioButton(){
	webPage.selectRadioButton(driver, battingRecordsUnderTestPageObjectsXpaths.selectSeriesAverageOfBattingTest);
	}
	@And("Click on Submit Query")
	public void clickOnSubmitQuery() {
		webPage.click(driver, battingRecordsUnderTestPageObjectsXpaths.xpathOfSumbitQueryUnderBatting);
	}

	@Then("Records related to (.*) are displayed")
	public void selectedteamRecordsAreDisplayed(String country) {
		boolean output = webPage.isDisplayed(driver,
				primaryTeamOfBattingRecordsUnderTestPageObjectsXpaths.xpathOfPrimaryTeam);
		Assert.assertEquals(true, output);
	}
	

}
