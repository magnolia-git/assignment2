package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.Random;

public class MeritBank {
	
/*
 * Instance variables:
 */
	
	private static AccountHolder[] accountHolders;
	private static CDOffering[] cdOfferings;

/*
 * Class methods:
 */

	static void addAccountHolder(AccountHolder accountHolder) {
		AccountHolder[] newAccountHolders = new AccountHolder[accountHolders.length + 1];
		int i = 0;
		for (i = 0; i < accountHolders.length; i++) {
			newAccountHolders[i] = accountHolders[i];
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
	
	static CDOffering getBestCDOffering(double depositAmount) {
		
	}
	
	static CDOffering getSecondBestCDOffering(double depositAmount) {
		
	}
	
	static void clearCDOfferings() {
		
	}
	
	static void setCDOfferings(CDOffering[] offerings) {
		
	}
	
	static long getNextAccountNumber() {
		
	}
	
	static double totalBalances() {
		
	}
	
	static double futureValue(double presentValue, 
			double interestRate, int term) {
		
	}
	
}
