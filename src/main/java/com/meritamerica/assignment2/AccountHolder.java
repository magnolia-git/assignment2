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
	private String ssn;
	private CheckingAccount[] checkAccounts;
	private SavingsAccount[] saveAccounts;
	private CDAccount[] cdAccounts;
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
		this.checkAccounts = new CheckingAccount[10];
		this.saveAccounts = new SavingsAccount[10];
		this.cdAccounts = new CDAccount[10];
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
	
	public String getSSN() {
		
		return this.ssn;
	}
	
	private void setSSN(String ssn) {
		
		this.ssn = ssn;
	}

	public CheckingAccount addCheckingAccount(double openingBalance) {
		CheckingAccount newname = new CheckingAccount(openingBalance);
		addCheckingAccount(newname);
		
		//if(getCombinedBalance() >= 250000) {
		//	System.out.println("You have reached the maximum total balance across all accounts. Cannot create another.");
		//}
		return newname;
			
	}

	public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		CheckingAccount[] newArray = new CheckingAccount[checkAccounts.length + 1];
		int i;
		for (i = 0; i < checkAccounts.length; i++) {
			newArray[i] = checkAccounts[i];
		}
		return newArray[i] = checkingAccount;
	}
	
	public CheckingAccount[] getCheckingAccounts() {
		return this.checkAccounts;
	}
	
	public int getNumberOfCheckingAccounts() {
		return this.checkAccounts.length;
	}
	
	public double getCheckingBalance() {
		double total = 0;
		
		for(int i = 0;i < checkAccounts.length;i++) {
			total += checkAccounts[i].getBalance();
		}
		
		return total;
	}
	
	public SavingsAccount addSavingsAccount(double openingBalance) {
		SavingsAccount newname = new SavingsAccount(openingBalance);
		addSavingsAccount(newname);
		
		//if(getCombinedBalance() >= 250000) {
		//	System.out.println("You have reached the maximum total balance across all accounts. Cannot create another.");
		//}
		return newname;
	}

	public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		SavingsAccount[] newArray = new SavingsAccount[saveAccounts.length + 1];
		int i;
		for (i = 0; i < saveAccounts.length; i++) {
			newArray[i] = saveAccounts[i];
		}
		return newArray[i] = savingsAccount;
	}

	public SavingsAccount[] getSavingsAccounts() {
		return this.saveAccounts;
	}

	public int getNumberOfSavingsAccounts() {
		return this.saveAccounts.length;
	}

	public double getSavingsBalance() {
		double total = 0;
		
		for(int i = 0;i < saveAccounts.length;i++) {
			total += saveAccounts[i].getBalance();
		}
		
		return total;
	}
	
	public CDAccount addCDAccount(CDAccount cdAccount) {
		CDAccount[] newArray = new CDAccount[cdAccounts.length + 1];
		int i;
		for (i = 0; i < cdAccounts.length; i++) {
			newArray[i] = cdAccounts[i];
		}
		return newArray[i] = cdAccount;
	}

	public CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		CDAccount newName = new CDAccount(offering, openingBalance);
		return addCDAccount(newName);
	}

	public CDAccount[] getCDAccounts() {
		return this.cdAccounts;
	}

	public int getNumberOfCDAccounts() {
		return this.cdAccounts.length;
	}

	public double getCDBalance() {
		double total = 0;
		
		for(int i = 0;i < cdAccounts.length;i++) {
			total += cdAccounts[i].getBalance();
		}
		
		return total;
	}

	public double getCombinedBalance() {
		double total = 0;
		
		for(int i = 0;i < checkAccounts.length;i++) {
			total += checkAccounts[i].getBalance();
		}
		
		for(int i = 0;i < saveAccounts.length;i++) {
			total += saveAccounts[i].getBalance();
		}
		
		return total;
	}
	
	public String toString() {
		return "Name: " + this.firstName + " " + this.middleName + " " + this.lastName + "\n" +
				"SSN: " + this.ssn + "\n" +
				this.getCheckingAccounts().toString() + "\n" +
				this.getSavingsAccounts().toString();
	}
	
	public long getNewAccountNumber() {
		
		return this.masterAccountNumber + 1;
	}
}