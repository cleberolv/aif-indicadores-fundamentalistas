package application.aif.core;

import static application.aif.core.DriverFactory.getDriver;

public class BaseTest {
	private final String BaseURL = "https://www.fundamentus.com.br/";

	public void accessURL() {
		getDriver().get(BaseURL);
	}
}
