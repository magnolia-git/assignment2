package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		MeritBank bank = new MeritBank();
    	AccountHolder accountHolder = new AccountHolder("Sim", "John", "Houston","633378899");
    	accountHolder.addCheckingAccount(1000);
    	accountHolder.addCheckingAccount(1000);
    	accountHolder.addCheckingAccount(1000);
    	accountHolder.addCheckingAccount(1000);
    	MeritBank.addAccountHolder(accountHolder);


    	System.out.println(accountHolder.getNumberOfCheckingAccounts());
    	System.out.println(accountHolder.getCheckingBalance());
    	System.out.println(accountHolder.getCheckingAccounts());
	}
}