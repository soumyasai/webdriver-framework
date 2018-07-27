package com.ss.webdriverframework;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.ss.webdriverframework.pageobjects.StatsGuruPageObjects;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StatsGuruStepDefinitions {
	private DriverFactory driverFactory;
	private WebPage WebPage;
	private StatsGuruPageObjects statsGuruPageObjectsXpaths;
	public StatsGuruStepDefinitions(DriverFactory driverFactory)
	{
		this.driverFactory = driverFactory;
		WebPage=new WebPage();
		statsGuruPageObjectsXpaths = new StatsGuruPageObjects();
	}
	
	@Then("\"Welcome to the latest release of Statsguru, Cricinfo's searchable cricket statistics database\" is displayed")
	public void isWelcomeToTheLatestReleaseIsDisplayed() {
		boolean output = WebPage.isDisplayed(driverFactory.getDriver(), statsGuruPageObjectsXpaths.xpathOfWelcomeToTheLatestRelease);
		Assert.assertEquals(true, output);
	}

	@Then("\"Tests\" tab is displayed")
	public void isTestDisplayed() {
		WebDriverWait wait = new WebDriverWait(driverFactory.getDriver(), 300);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(statsGuruPageObjectsXpaths.xpathOfTestsInBelowOfStatsguruRecords)));
		boolean output = WebPage.isDisplayed(driverFactory.getDriver(), statsGuruPageObjectsXpaths.xpathOfTestsInBelowOfStatsguruRecords);
		Assert.assertEquals(true, output);
	}

	@And("\"ODIs\" tab is displayed")
	public void isODIsDisplayed() {
		boolean output = WebPage.isDisplayed(driverFactory.getDriver(), statsGuruPageObjectsXpaths.xpathOfODIsInBelowOfStatsguruRecords);
		Assert.assertEquals(true, output);
	}

	@And("\"T20Is\" tab is displayed")
	public void isT20IsDispayed() {
		boolean output = WebPage.isDisplayed(driverFactory.getDriver(), statsGuruPageObjectsXpaths.xpathofT20IsInBelowOfStatsguruRecords);
		Assert.assertEquals(true, output);
	}

	@And("\"All Test/ODI/T20I\" tab is displayed")
	public void isAllTestAndODIAndT20IisDisplayed() {
		boolean output = WebPage.isDisplayed(driverFactory.getDriver(),
				statsGuruPageObjectsXpaths.xpathofTestODIsT20IInBelowOfStatsguruRecords);
		Assert.assertEquals(true, output);
	}

	@When("Click on batting under tests")
	public void clickOnBattingUnderTest() {
		WebPage.click(driverFactory.getDriver(), statsGuruPageObjectsXpaths.xpathOfBattingUnderTest);
	}


}
