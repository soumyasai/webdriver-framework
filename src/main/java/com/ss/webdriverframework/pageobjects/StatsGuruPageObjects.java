package com.ss.webdriverframework.pageobjects;

public class StatsGuruPageObjects {
	public String xpathOfWelcomeToTheLatestRelease = "//b[contains(text(),'Welcome to the latest release of Statsguru')]";
	public String xpathOfTestsInBelowOfStatsguruRecords = "//li[@class='current']/child::a";
	public String xpathOfODIsInBelowOfStatsguruRecords = "//a[text()='ODIs']";
	public String xpathofT20IsInBelowOfStatsguruRecords = "//a[text()='T20Is']";
	public String xpathofTestODIsT20IInBelowOfStatsguruRecords = "(//a[contains(@href,'javascript:showBoxDiv')])[4]";
	public String xpathOfBattingUnderTest = "//a[text()='Batting']";

}
