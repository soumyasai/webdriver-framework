package com.ss.webdriverframework.pageobjects;

public class EspnCricInfoPageObjects {
	public String xpathOfStats = "//span[text()='Stats']/ancestor::li[1]";
	public String xpathOfstatsguru = "(//span[text()='Statsguru'])[1]";
	public String xpathOfWelcomeToTheLatestRelease = "//b[contains(text(),'Welcome to the latest release of Statsguru')]";
	public String xpathOfTestsInBelowOfStatsguruRecords = "//a[text()='Tests']";
	public String xpathOfODIsInBelowOfStatsguruRecords = "//a[text()='ODIs']";
	public String xpathofT20IsInBelowOfStatsguruRecords = "//a[text()='T20Is']";
	public String xpathofTestODIsT20IInBelowOfStatsguruRecords = "(//a[contains(@href,'javascript:showBoxDiv')])[4]";
	public String xpathOfBattingUnderTest = "(//a[text()='Batting'])[1]";
	public String xpathOfTeamUnderBatting = "//select[@name='team']";
	public String xpathOfSumbitQueryUnderBatting = "(//input[@type='submit'])[2]";
	public String xpathOfPrimaryTeam="//b[text()='Primary team']/parent::td";
	
}
