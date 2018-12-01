package com.Sneha.bank;  // Collection of logical classes

public class BankAccount {

	// Static variable
	private static int autoAccountNo;
		
	// instance Variables / class variable
	private int accountNo;
	private String accountHolderName;
	private double accountBalance;
	
	//init block
	{
		accountNo=++autoAccountNo;	
	}
	
	
	 //constructor overloading
	// Default constructor
	public BankAccount(){         		
			accountHolderName="Unknown";
			accountBalance=0;
	}
	
	
	//Parameterize constructor
	public BankAccount(String AccountholderName, double accountBalance){      	
		this.accountHolderName=accountHolderName;
		this.accountBalance=accountBalance;
    }
	
	// Setter Method - Reinitializing or modifying the existing value/member variable 
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	
	//getter methods
	public int getAccountNo() {
		return accountNo;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	//Service methods
	public void withdraw(double amount){
		if(amount==0 || amount<0 || accountBalance-amount<1000)
		{
			System.out.println(" Invalid Amount");
		}
		else
		{
			System.out.println("Account balance is" + (accountBalance-amount));
		    this.accountBalance-=amount;
	}
	}
	
	public void deposit(double amount){
		if(amount==0 || amount<0)
		{
			System.out.println("Invalid Amount to deposit");
		}
		else
		{
			
		    System.out.println("The total amount is "+(accountBalance+=amount));
			this.accountBalance+=amount;
	}
	}
	
	
	public static void main(String[] args)
	{
		//BankAccount acc = new BankAccount();
		BankAccount acc2 = new BankAccount("Sneha",5000);
		acc2.withdraw(1500);
		
		BankAccount acc3 = new BankAccount("Sneha",3000);
		acc3.deposit(2000);
	}
}


