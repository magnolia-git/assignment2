package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
    	AccountHolder accountHolder = new AccountHolder("Sam", "John", "Houston","633378899");
    	MeritBank newBank = new MeritBank();
    	
    	accountHolder.addCheckingAccount(1000);
    	accountHolder.addSavingsAccount(10000);
    	MeritBank.addAccountHolder(accountHolder);
    	
    	System.out.println(accountHolder.toString());
	}
}