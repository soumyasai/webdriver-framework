package com.ss.webdriverframework;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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

	public void quit(WebDriver driver) {
		driver.quit();
	}

	public void selectCheckBox(WebDriver driver, String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		if (!element.isSelected()) {
			element.click();
		}
	}

	public void deSelectCheckBox(WebDriver driver, String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		if (element.isSelected()) {
			element.click();
		}
	}

	public void acceptAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void dismissAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public void selectValueFromDropDown(WebDriver driver, String xpath, String value) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Select s = new Select(element);
		s.selectByVisibleText(value);

	}

	public void dragAndDrop(WebDriver driver, String sourceXpath, String targetXpath) {
		WebElement sourceElement = driver.findElement(By.xpath(sourceXpath));
		WebElement targetElement = driver.findElement(By.xpath(targetXpath));
		Actions a = new Actions(driver);
		a.dragAndDrop(sourceElement, targetElement).build().perform();

	}

	public void mouseOver(WebDriver driver, String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
	}

	public void doubleClick(WebDriver driver, String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Actions a = new Actions(driver);
		a.doubleClick(element).build().perform();
	}
	public boolean isSelected(WebDriver driver, String xpathvalue) {
		WebElement element = driver.findElement(By.xpath(xpathvalue));
		return element.isSelected();
	}

	public boolean isDisplayed(WebDriver driver, String xpathvalue) {
		WebElement element = driver.findElement(By.xpath(xpathvalue));
		boolean d = element.isDisplayed();
		return d;
	}

	public boolean isEnabled(WebDriver driver, String xpathvalue) {
		WebElement element = driver.findElement(By.xpath(xpathvalue));
		boolean d = element.isEnabled();
		return d;
	}

	public void takeScreenShot(WebDriver driver, String fileName) {
		TakesScreenshot takeScreenShot = ((TakesScreenshot) driver);
		File getScreenShotAsFile = takeScreenShot.getScreenshotAs(OutputType.FILE);
		String completeFilePath = "D:\\screenShot\\" + fileName + ".jpg";
		try {
			FileUtils.copyFile(getScreenShotAsFile, new File(completeFilePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void implicitWait(WebDriver driver, int value) {
		driver.manage().timeouts().implicitlyWait(value, TimeUnit.SECONDS);
	}

	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void switchToOtherWindow(WebDriver driver) {
		String mainWindow = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String handle : allWindowHandles) {
			if (!mainWindow.equalsIgnoreCase(handle)) {
				driver.switchTo().window(handle);
				break;
			}
		}
	}
	

}
