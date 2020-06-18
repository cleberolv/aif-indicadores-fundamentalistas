package application.aif.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	private static WebDriver driver;

	// Check session or create a new.
	public static WebDriver getDriver() {
		if (driver == null) {
			createChromeDriver();
		}
		return driver;
	}

	// Set here your Chrome Driver location
	private static void createChromeDriver() {
		try {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Set here your Firefox Driver location
	private static void createFirefoxDriver() {
		try {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/geckodriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Set here your Chromium Driver location
		private static void createChromiumDriver() {
			try {
				System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromium-browser");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	// Close the session after tests
	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}