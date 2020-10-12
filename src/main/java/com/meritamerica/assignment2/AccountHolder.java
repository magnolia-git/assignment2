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
	private long masterAccountNumber;
	
	/*
	 * Constructors:
	 */
	
	public AccountHolder(String firstName, String middleName, String lastName, String ssn) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.masterAccountNumber = 0l;
		this.totalAccountBalance = 0.0;
	}
	
	/*
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
	*/
	
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
		return new CheckingAccount
	}
	public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		
	}
	public CheckingAccount[] getCheckingAccounts() {
		return this.checkAccount;
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
		return this.saveAccount;
//		return this.saveAccount;
	}
	public int getNumberOfSavingsAccounts() {
		return this.saveAccount.length;
	}
	public double getSavingsBalance() {
		
	}
	public CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		
	}
	public CDAccount addCDAccount(CDAccount cdAccount) {
		
	}
	public CDAccount[] getCDAccounts() {
		return this.cdAccount;
	}
	public int getNumberOfCDAccounts() {
		return this.cdAccount.length;
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
	
	public long getNewAccountNumber() {
		
		return this.masterAccountNumber + 1;
	}
}