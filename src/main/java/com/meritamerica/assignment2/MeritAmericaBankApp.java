package com.meritamerica.assignment2;

import java.util.Arrays;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		MeritBank bank = new MeritBank();
    	AccountHolder accountHolder = new AccountHolder("Sim", "John", "Houston","633378899");
    	accountHolder.addCheckingAccount(10000);
    	accountHolder.addSavingsAccount(10000);
    	accountHolder.addCheckingAccount(10000);
    	accountHolder.addSavingsAccount(10000);
    	MeritBank.addAccountHolder(accountHolder);


    	System.out.println(accountHolder.getNumberOfCheckingAccounts());
    	System.out.println(accountHolder.getCheckingBalance());
    	System.out.println(Arrays.asList(accountHolder.getCheckingAccounts()));
	}
}