package com.ss.webdriverframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	private WebDriver driver;
	
	public void createChromDriver()
	{
		System.setProperty("webdriver.chrome.driver",
				"F:\\Sowmya-Agile Training\\Venus\\Documents\\webdriver-framework\\src\\test\\resources\\drivers\\chromedriver.exe");
		this.driver = new ChromeDriver();
	}
	
	public WebDriver getDriver()
	{
		return this.driver;
	}
	
	public void quitDriver()
	{
		this.driver.quit();
	}
}
