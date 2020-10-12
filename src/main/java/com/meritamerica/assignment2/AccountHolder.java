package com.meritamerica.assignment2;

import java.util.Arrays;

public class AccountHolder {		// For sake of clarity, each AccountHolder will have 6 parameters.
									// Some are private, like the social security number.
	/*
	 * Instance variables:
	 */
	
	public String firstName;
	public String middleName;
	public String lastName;
	public String ssn;
	//double checkingAccountOpeningBalance;
	//double savingsAccountOpeningBalance;
	private CheckingAccount[] checkAccount;
	private SavingsAccount[] saveAccount;
	private CDAccount[] cdAccount;
	private double totalAccountBalance;
	
	/*
	 * Constructors:
	 */
	
	public AccountHolder(String firstName, String middleName, String lastName, String ssn) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
	}
	
	public AccountHolder(String firstName, String middleName, String lastName, String ssn, 
						double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
		checkAccount = new CheckingAccount(checkingAccountOpeningBalance);
		saveAccount = new SavingsAccount(savingsAccountOpeningBalance);
	}
	
	/*
	 * Class Methods:
	 */
	public String getFirstName() {
		
		return this.firstName;
	}
	private void setFirstName(String firstName) {
		
		this.firstName = firstName;
	}
	public String getMiddleName() {
		
		return this.middleName;
	}
	private void setMiddleName(String middleName) {
		
		this.middleName = middleName;
	}
	public String getLastName() {
		
		return this.lastName;
	}
	private void setLastName(String lastName) {
		
		this.lastName = lastName;
	}
	private String getSSN() {
		
		return this.ssn;
	}
	private void setSSN(String ssn) {
		
		this.ssn = ssn;
	}
	public CheckingAccount addCheckingAccount(double openingBalance) {
		// creates a checking account
	}
	public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		// creats a checking account
	}
	public CheckingAccount[] getCheckingAccounts() {
		
//		return this.checkAccount;
	}
	public int getNumberOfCheckingAccounts() {
		// looks at the checking account array and returns the array.length
		return this.checkAccount.length;
	}
	public double getCheckingBalance() {
		// gets the balance of a checking account
	}
	public SavingsAccount addSavingsAccount(double openingBalance) {
		
	}
	public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		
	}
	public SavingsAccount[] getSavingsAccount() {
		
//		return this.saveAccount;
	}
	public int getNumberOfSavingsAccounts() {
		
	}
	public double getSavingsBalance() {
		
	}
	public CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		
	}
	public CDAccount addCDAccount(CDAccount cdAccount) {
		
	}
	public CDAccount[] getCDAccounts() {
		
	}
	public int getNumberOfCDAccounts() {
		
	}
	public double getCDBalance() {
		
	}
	public double getCombinedBalance() {
		
	}
	public String toString() {
		return "Name: " + this.firstName + " " + this.middleName + " " + this.lastName + "\n" +
				"SSN: " + this.ssn + "\n" +
				this.getCheckingAccount().toString() + "\n" +
				this.getSavingsAccount().toString();
	}
}