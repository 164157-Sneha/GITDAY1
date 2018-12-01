package com.sneha.frame;
import java.util.Comparator;
import java.util.Set;

public class SavingsAcc{

    int acc_id;
	int acc_balance;
	String accholder_name;
	
	public SavingsAcc(int acc_id, int acc_balance, String accholder_name) {
		
		this.acc_id = acc_id;
		this.acc_balance = acc_balance;
		this.accholder_name = accholder_name;
	}

	public int add()
	{
		return acc_balance;
		
	}
	
    public int getAcc_id() {
		return acc_id;
	}


	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}


	public int getAcc_balance() {
		return acc_balance;
	}


	public void setAcc_balance(int acc_balance) {
		this.acc_balance = acc_balance;
	}


	public String getAccholder_name() {
		return accholder_name;
	}


	public void setAccholder_name(String accholder_name) {
		this.accholder_name = accholder_name;
	}


	public void withdraw(double amount){
		if(amount==0 || amount<0 || acc_balance-amount<1000)
		{
			System.out.println(" Invalid Amount");
		}
		else
		{
			System.out.println("Account balance is" + (acc_balance-amount));
		    this.acc_balance-=amount;
	}
	}
    
    public void deposit(double amount){
		if(amount==0 || amount<0)
		{
			System.out.println("Invalid Amount to deposit");
		}
		else
		{
			
		    System.out.println("The total amount is "+(acc_balance+=amount));
			this.acc_balance+=amount;
			
			
	}
    }


	@Override
	public String toString() {
		return "SavingsAcc [acc_id=" + acc_id + ", acc_balance=" + acc_balance
				+ ", accholder_name=" + accholder_name + "]";
	}
	}




	


	



