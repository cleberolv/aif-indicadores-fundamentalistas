package application.aif.steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
//import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import application.aif.core.BaseTest;
import application.aif.core.DriverFactory;
import application.aif.pages.ValuationPage;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValuationStepsDefinitions {

	ValuationPage valuation = new ValuationPage();
	BaseTest base = new BaseTest();

	@Given("^validar os indicadores informados$")
	public void validar_os_indicadores_informados() throws Throwable {

		String tickerName = valuation.checkTicker();
		System.out.println("\nTikcer: " + tickerName);

		String valueTicker = valuation.checkPrice();
		float value = Float.parseFloat(valueTicker);
		System.out.println("Actual price: " + value);
	}

	@When("^realizar um comparativo com os parametros definidos$")
	public void realizar_um_comparativo_com_os_parametros_definidos() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^eu verifico se o ativo possui margem para uma melhor analise$")
	public void eu_verifico_se_o_ativo_possui_margem_para_uma_melhor_analise() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@After(order = 1, value = { "@Valuation" })
	public void screenshot(Scenario cenario) {
		File file = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("target/screenshots/" + cenario.getName() + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			for (int i = 0; i <= 100; i++) {
				System.out.printf("-");
			}
			System.out.println("\nLOG: Verify screenshoots");
		}
	}

	@After(order = 0, value = { "@Valuation" })
	public void killDriver() throws InterruptedException {
		DriverFactory.killDriver();
		System.out.println("LOG: Browser closed");
	}
}