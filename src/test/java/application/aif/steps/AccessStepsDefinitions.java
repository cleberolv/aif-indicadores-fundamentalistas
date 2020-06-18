package application.aif.steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import application.aif.core.BaseTest;
import application.aif.core.DriverFactory;
import application.aif.pages.AccessPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class AccessStepsDefinitions{

	AccessPage access = new AccessPage();
	BaseTest base = new BaseTest();
	
	@Dado("^que acesso a pagina do site fundamentus$")
	public void acessarPagina() throws Throwable {
		access.accessURL();
	}

	@Quando("^realizo a busca por \"([^\"]*)\"$")
	public void realizoBusca(String Busca) throws Throwable {
		access.searchTicker("ITSA4");
	}
	
	@Então("^valido a busca foi efetuada com exito$")
	public void validoABuscaFoiEfetuadaComExito() throws Throwable {
		Assert.assertEquals("VOCÊ ESTÁ VENDO\nITSA4", access.checkSearch());
	}
	
	@After(order = 1, value = { "@Tickers" })
	public void screenshot(Scenario cenario) {
		File file = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("target/screenshots/" + cenario.getName() +".png"));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Verify screenshoots");
		}
	}
	
	@After(order = 0, value = { "@Tickers" })
	public void killDriver() throws InterruptedException {
			DriverFactory.killDriver();
			System.out.println("Browser closed");
	}
}