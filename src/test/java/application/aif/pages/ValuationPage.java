package application.aif.pages;

import org.openqa.selenium.By;

import application.aif.core.BasePage;

public class ValuationPage extends BasePage{
	
	//String prices			=			"By.xpath(\"//table[1]/tbody/tr[1]/td[4]/span\")";
	
	/*	 							*** FIELD STOCKS *** 							*/

	By ticker				=			By.xpath("//table[1]/tbody/tr[1]/td[2]/span");
	By sector				=			By.xpath("//table[1]/tbody/tr[4]/td[2]/span");
	By subSector			=			By.xpath("//table[1]/tbody/tr[5]/td[2]/span");
	By price				=			By.xpath("//table[1]/tbody/tr[1]/td[4]/span");
	By min52w				=			By.xpath("//table[1]/tbody/tr[3]/td[4]/span");
	By max52w				=			By.xpath("//table[1]/tbody/tr[4]/td[4]/span");
	
	/*	 							*** FIELD INDICATORS *** 						*/

	By indPL				=			By.xpath("//table[3]/tbody/tr[2]/td[4]/span");
	By indPVP				=			By.xpath("//table[3]/tbody/tr[3]/td[4]/span");
	By indDY				=			By.xpath("//table[3]/tbody/tr[9]/td[4]/span");
	By inIncome5y			=			By.xpath("//table[3]/tbody/tr[12]/td[4]/span");
	By indLPA				=			By.xpath("//table[3]/tbody/tr[2]/td[6]/span");
	By indVPA				=			By.xpath("//table[3]/tbody/tr[3]/td[6]/span");
	By indROIC				=			By.xpath("//table[3]/tbody/tr[8]/td[6]/span");
	By indROE				=			By.xpath("//table[3]/tbody/tr[9]/td[6]/span");
	By liquidityRatio		=			By.xpath("//table[3]/tbody/tr[10]/td[6]/span");

	/*	 							*** DEBT AND PARTRIMONY *** 					*/
	
	By grossDebts			=			By.xpath("//table[3]/tbody/tr[2]/td[4]/span");
	By netDebt				=			By.xpath("//table[3]/tbody/tr[3]/td[4]/span");
	By netWorth				=			By.xpath("//table[3]/tbody/tr[4]/td[4]/span");
	
	/*	 								*** PROFITS *** 							*/
	
	By netProfit			=			By.xpath("//table[5]/tbody/tr[3]/td[2]/span");
	By indEBIT				=			By.xpath("//table[5]/tbody/tr[4]/td[2]/span");
	By netRevenue			=			By.xpath("//table[5]/tbody/tr[5]/td[2]/span");
	By netProfit3m			=			By.xpath("//table[5]/tbody/tr[3]/td[4]/span");
	By indEBIT3m			=			By.xpath("//table[5]/tbody/tr[4]/td[4]/span");
	By netRevenue3m			=			By.xpath("//table[5]/tbody/tr[5]/td[4]/span");
	
	public String checkTicker() {
		return getText(ticker);
	}
	
	public String checkPrice() {
		replaceDecimals(price);
		return getText(price);
	}
	
										/* STOCK RULES VALIDATIONS */
	
	//Change to boolean 
	public void validatePL() {
		String indicatorPL = replaceDecimals(indPL);
		float indPL = Float.parseFloat(indicatorPL);
		
		if (indPL < 15) {
			System.out.println("\nPL = " + indicatorPL + " < 15 - PL Ok");
		}
		else {
			System.out.println("\nPL = " + indicatorPL + " > 15 - PL NOK");
		}
	}
}

