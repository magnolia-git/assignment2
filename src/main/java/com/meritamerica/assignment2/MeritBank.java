package com.meritamerica.assignment2;

//import java.util.Arrays;
//import java.util.Random;

public class MeritBank {

	static AccountHolder[] accountHoldersArray = new AccountHolder[0];
	static CDOffering[] cdOfferingsArray = new CDOffering[0];
	static long masterAccountNumber = 000000000;
/*
 * Class methods:
 */

	static void addAccountHolder(AccountHolder accountHolder) {

		AccountHolder[] newAccountHoldersArray = new AccountHolder[accountHoldersArray.length + 1];
		int i = 0;
		for (i = 0; i < accountHoldersArray.length; i++) {
			newAccountHoldersArray[i] = accountHoldersArray[i];
			System.out.println("Inside for loop.");
		}
		newAccountHoldersArray[i] = accountHolder;
		accountHoldersArray = newAccountHoldersArray;
	}

	static AccountHolder[] getaccountHoldersArray() {
		return accountHoldersArray;
	}

	static CDOffering[] getcdOfferings() {
		return cdOfferingsArray;
	}

	static void setcdOfferings(CDOffering[] offerings) {
		cdOfferingsArray = offerings;
	}
	

	static CDOffering getBestCDOffering(double depositAmount) {
		double highestAmount = 0;
//		for (int i = 0; i < cdOfferingsArray.length; i++) {
//			if (cdOfferingsArray.) {
				
//			}
//		}
		return cdOfferingsArray[0];
	}

	static CDOffering getSecondBestCDOffering(double depositAmount) {
		double secondHighestAmount = 0;
		return cdOfferingsArray[0];
	}

	
	static void clearcdOfferings() {
		cdOfferingsArray = null;
	}
	

	
	static long getNextAccountNumber() {
		return masterAccountNumber++;
	}
	
	static double totalBalances() {
		double total = 0;
		for(int i = 0; i < accountHoldersArray.length;i++) {
			total += accountHoldersArray[i].getCombinedBalance();
		}
		return total;
	}
	
	//static double futureValue(double presentValue, 
	//		double interestRate, int term) {
		
	//}
	
}
