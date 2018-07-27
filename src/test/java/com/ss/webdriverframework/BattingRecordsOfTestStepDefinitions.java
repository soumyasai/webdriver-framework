package com.ss.webdriverframework;

import com.ss.webdriverframework.pageobjects.BattingRecordsUnderTestPageObjects;

import cucumber.api.java.en.And;

public class BattingRecordsOfTestStepDefinitions {
	private WebPage webPage;
	private DriverFactory driverFactory;
	private BattingRecordsUnderTestPageObjects battingRecordsUnderTestPageObjects;

	public BattingRecordsOfTestStepDefinitions(DriverFactory driverFactory)
	{
		this.driverFactory = driverFactory;
		webPage = new WebPage();
		battingRecordsUnderTestPageObjects = new BattingRecordsUnderTestPageObjects();
	}


	@And("select team \"(.*)\"")
	public void selectedTeam(String countryName) {
		webPage.selectVisibleTextFromDropDown(driverFactory.getDriver(), battingRecordsUnderTestPageObjects.xpathOfTeamUnderBatting,
				countryName);
	}

	@And("Select opposition team \"(.*)\"")
	public void selectedOppositionTeam(String oppistionCountryName) {
		webPage.selectVisibleTextFromDropDown(driverFactory.getDriver(),
				battingRecordsUnderTestPageObjects.xpathOfOppositionTeamUnderBatting, oppistionCountryName);
	}

	@And("Select \"home venue\" check box of Home or away")
	public void selectCheckBox() {
		webPage.selectCheckBox(driverFactory.getDriver(), battingRecordsUnderTestPageObjects.xpathOfHomeVenueCheckBoxUnderBatting);
	}

	@And("Select Host country \"(.*)\"")
	public void selectHostCountry(String hostCountry) {
		webPage.selectVisibleTextFromDropDown(driverFactory.getDriver(), battingRecordsUnderTestPageObjects.xpathOfHostCountryUnderBatting,
				hostCountry);
	}

	@And("Select ground \"(.*)\"")
	public void selectGround(String selectGround) {

		webPage.selectVisibleTextFromDropDown(driverFactory.getDriver(), battingRecordsUnderTestPageObjects.xpathOfGroundUnderBatting,
				selectGround);
	}

	@And("send keys Starting date of From \"24/07/2018\"")
	public void fromOfStartingDate() {
		webPage.sendKeys(driverFactory.getDriver(), "24/07/2018", battingRecordsUnderTestPageObjects.xpath_fromOfStartingDate);
	}

	@And("send keys of Starting date of to \"28/07/2018\"")
	public void toOfStartingDate() {
		webPage.sendKeys(driverFactory.getDriver(), "28/07/2018", battingRecordsUnderTestPageObjects.xpath_toOfStartingDate);
	}

	@And("select season \"(.*)\"")
	public void selectSeason(String season) {

		webPage.selectVisibleTextFromDropDown(driverFactory.getDriver(), battingRecordsUnderTestPageObjects.selectSeasonOfBattingTest,
				season);
	}

	@And("\"Won match\" checkBox is selected")
	public void selectMatchResultCheckBox() {
		webPage.selectCheckBox(driverFactory.getDriver(), battingRecordsUnderTestPageObjects.selectWonMatchCheckBoxOfBattingTest);
	}

	@And("\"Series averages\" radio buttion is selected from view format")
	public void selectViewFormateRadioButton() {
		webPage.selectRadioButton(driverFactory.getDriver(), battingRecordsUnderTestPageObjects.selectSeriesAverageOfBattingTest);
	}

	@And("Click on Submit Query")
	public void clickOnSubmitQuery() {
		webPage.click(driverFactory.getDriver(), battingRecordsUnderTestPageObjects.xpathOfSumbitQueryUnderBatting);
	}

}
