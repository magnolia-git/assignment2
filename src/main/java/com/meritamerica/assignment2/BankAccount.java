package com.meritamerica.assignment2;

public class BankAccount {
	
	/*
	 * Instance variables;
	 */
	
	private double accountBalance;
	private long accountNumber;
	private double interestRate;
	
	/*
	 * Constructors:
	 */
	
	public BankAccount(double balance, double interestRate) {
		this.accountBalance = balance;
		this.interestRate = interestRate;
	}
	
	public BankAccount(long accountNumber, double balance, double interestRate) {
		
	}
	
	/*
	 * Class methods:
	 */
	
	public long getAccountNumber() {
		return 0l;
	}
	
	public double getInterestRate() {
		return 0.0;
	}
	
	public boolean withdraw(double amount) {
		if(amount <= this.accountBalance) {
			this.accountBalance -= amount;
			return true;
		} else {
			System.out.println("You have insufficient funds to complete this transaction. " +
								"Please call your bank if you feel this information is incorrect.");
			return false;
		}
	}
	
	public boolean deposit(double amount) {
		if(amount <= 0) {
			System.out.println("Cannot add a value of $0 or less!");
			return false;
		} else {
			this.accountBalance += amount;
			System.out.println("Deposited $" + amount + " into your account.");
			return true;
		}
	}
	
	public double futureValue(int years) {
		return this.accountBalance * (Math.pow(1 + this.interestRate, years));
	}
}
