package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.Random;

public class MeritBank {
	
/*
 * Instance variables:
 */
	
	private static AccountHolder[] accountHolders;
	private CDOffering[] cdOfferings;

/*
 * Class methods:
 */

	static void addAccountHolder(AccountHolder accountHolder) {
		accountHolder = new AccountHolder(accountHolder.firstName, accountHolder.middleName, accountHolder.lastName, accountHolder.ssn);
	}
	
	static AccountHolder[] getAccountHolders() {
		return accountHolders;
	}
	
	static CDOffering[] getCDOfferings() {
		
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
