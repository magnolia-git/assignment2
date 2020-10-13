package com.meritamerica.assignment2;

//import java.util.Arrays;
//import java.util.Random;

public class MeritBank {

	static AccountHolder[] accountHolders = new AccountHolder[0];
	static CDOffering[] cdOfferings = new CDOffering[0];
	static long masterAccountNumber = 000000000;
/*
 * Class methods:
 */

	static void addAccountHolder(AccountHolder accountHolder) {

		AccountHolder[] newAccountHolders = new AccountHolder[accountHolders.length + 1];
		int i = 0;
		for (i = 0; i < accountHolders.length; i++) {
			newAccountHolders[i] = accountHolders[i];
			System.out.println("Inside for loop.");
		}
		newAccountHolders[i] = accountHolder;
		accountHolders = newAccountHolders;
	}

	static AccountHolder[] getAccountHolders() {
		return accountHolders;
	}

	static CDOffering[] getCDOfferings() {
		return cdOfferings;
	}

	/*
	static CDOffering getBestCDOffering(double depositAmount) {
		//new CDOffering
	}

	static CDOffering getSecondBestCDOffering(double depositAmount) {
		
	}
	*/
	
	static void clearCDOfferings() {
		cdOfferings = null;
	}
	
	static void setCDOfferings(CDOffering[] offerings) {
		
	}
	
	static long getNextAccountNumber() {
		return masterAccountNumber++;
	}
	
	static double totalBalances() {
		double total = 0;
		for(int i = 0; i < accountHolders.length;i++) {
			total += accountHolders[i].getCombinedBalance();
		}
		return total;
	}
	
	//static double futureValue(double presentValue, 
	//		double interestRate, int term) {
		
	//}
	
}
