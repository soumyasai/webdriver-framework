package com.ss.webdriverframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.ss.webdriverframework.pageobjects.PrimaryTeamOfBattingRecordsUnderTestPageObjects;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;

public class PrimaryTeamOfBattingRecordsUnderTestStepDefinitions {
	private WebPage webPage;
	private DriverFactory driverFactory;
	private PrimaryTeamOfBattingRecordsUnderTestPageObjects primaryTeamOfBattingRecordsUnderTestPageObjects;
	
	public PrimaryTeamOfBattingRecordsUnderTestStepDefinitions(DriverFactory driverFactory)
	{
		this.driverFactory = driverFactory;
		webPage=new WebPage();
		primaryTeamOfBattingRecordsUnderTestPageObjects = new PrimaryTeamOfBattingRecordsUnderTestPageObjects();
	}
	
	@Then("Records related to (.*) are displayed")
	public void selectedteamRecordsAreDisplayed(String country) {
		boolean output = webPage.isDisplayed(driverFactory.getDriver(),
				primaryTeamOfBattingRecordsUnderTestPageObjects.xpathOfPrimaryTeam);
		Assert.assertEquals(true, output);

}
}
