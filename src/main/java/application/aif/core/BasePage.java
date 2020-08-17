package application.aif.core;

import static application.aif.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class BasePage extends BaseTest{
	
	public String checkURL(String link) {
		return getDriver().getCurrentUrl();
	}
	
	public void click(By by) {
		getDriver().findElement(by).click();
	}

	public String getText(By by) {
		return getDriver().findElement(by).getText();
	}
	
	public void write(By by, String texto) {
		getDriver().findElement(by).sendKeys(texto);
	}
	
	public String replaceDecimals(By indicator) {
		String value = getText(indicator);
		if (!value.matches(".*[a-z].*")) {
			if (value.contains(",")) {
				value = value.replace(",", ".");
			}
		}
		return value;
	}
}