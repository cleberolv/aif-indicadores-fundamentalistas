package application.aif.pages;

import org.openqa.selenium.By;

import application.aif.core.BasePage;

public class AccessPage extends BasePage {

	By fieldFill		=		By.id("completar");
	By btnFind	 		=		By.className("botao"); 
	By actual			=		By.className("atual");

	public void searchTicker(String search) {
		write(fieldFill, search);
		click(btnFind);
	}

	public Object checkSearch() {
		return getText(actual);
	}
}