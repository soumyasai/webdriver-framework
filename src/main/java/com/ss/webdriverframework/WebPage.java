package com.ss.webdriverframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebPage {
	public void click(WebDriver driver, String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		element.click();
	}

	public void navigate(WebDriver driver, String url) {
		driver.navigate().to(url);
	}

	public void sendKeys(WebDriver driver, String enterText, String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		element.sendKeys(enterText);
	}

	public void selectRadioButton(WebDriver driver, String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		element.click();
	}

	public void close(WebDriver driver) {

		driver.close();
	}
	public void quit(WebDriver driver)
	{
		driver.quit();
	}
	public void selectCheckBox(WebDriver driver,String xpath)
	{
		WebElement element=driver.findElement(By.xpath(xpath));
		if(!element.isSelected())
		{
			
		}
	}

}
