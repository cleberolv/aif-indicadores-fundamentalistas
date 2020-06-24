package application.aif.pages;

import org.openqa.selenium.By;

import application.aif.core.BasePage;

public class FundamentusPage extends BasePage{
	
	//Stock
	
	By ticker				=			By.xpath("//table[1]/tbody/tr[1]/td[2]/span");
	By sector				=			By.xpath("//table[1]/tbody/tr[4]/td[2]/span");
	By subSector			=			By.xpath("//table[1]/tbody/tr[5]/td[2]/span");
	By price				=			By.xpath("//table[1]/tbody/tr[1]/td[4]/span");
	By min52w				=			By.xpath("//table[1]/tbody/tr[3]/td[4]/span");
	By max52w				=			By.xpath("//table[1]/tbody/tr[4]/td[4]/span");
	
	//Indicators
	
	By indPL				=			By.xpath("//table[3]/tbody/tr[2]/td[4]/span");
	By indPVP				=			By.xpath("//table[3]/tbody/tr[3]/td[4]/span");
	By indDY				=			By.xpath("//table[3]/tbody/tr[9]/td[4]/span");
	By inIncome5y			=			By.xpath("//table[3]/tbody/tr[12]/td[4]/span");
	By indLPA				=			By.xpath("//table[3]/tbody/tr[2]/td[6]/span");
	By indVPA				=			By.xpath("//table[3]/tbody/tr[3]/td[6]/span");
	By indROIC				=			By.xpath("//table[3]/tbody/tr[8]/td[6]/span");
	By indROE				=			By.xpath("//table[3]/tbody/tr[9]/td[6]/span");
	By liquidityRatio		=			By.xpath("//table[3]/tbody/tr[10]/td[6]/span");

	//Debt and Patrimony
	
	By grossDebts			=			By.xpath("//table[3]/tbody/tr[2]/td[4]/span");
	By netDebt				=			By.xpath("//table[3]/tbody/tr[3]/td[4]/span");
	By netWorth				=			By.xpath("//table[3]/tbody/tr[4]/td[4]/span");
	
	//Profits
	
	By netProfit			=			By.xpath("//table[5]/tbody/tr[3]/td[2]/span");
	By indEBIT				=			By.xpath("//table[5]/tbody/tr[4]/td[2]/span");
	By netRevenue			=			By.xpath("//table[5]/tbody/tr[5]/td[2]/span");
	By netProfit3m			=			By.xpath("//table[5]/tbody/tr[3]/td[4]/span");
	By indEBIT3m			=			By.xpath("//table[5]/tbody/tr[4]/td[4]/span");
	By netRevenue3m			=			By.xpath("//table[5]/tbody/tr[5]/td[4]/span");
	
}
