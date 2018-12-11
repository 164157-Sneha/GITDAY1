package com.sneha.abc;
import java.util.Comparator;
import java.util.Set;

public class SavingAcc {

	int Accno;
	String AccHolderName;
	int AccBal;
	
	public SavingAcc(int accno, String accHolderName, int accBal) 
	{
		this.Accno = accno;
		this.AccHolderName = accHolderName;
		this.AccBal = accBal;
	}

	public int getAccno() {
		return Accno;
	}

	public void setAccno(int accno) {
		Accno = accno;
	}

	public String getAccHolderName() {
		return AccHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		AccHolderName = accHolderName;
	}

	public int getAccBal() {
		return AccBal;
	}

	public void setAccBal(int accBal) {
		AccBal = accBal;
	}

	@Override
	public String toString() {
		return "SavingAcc [Accno=" + Accno + ", AccHolderName=" + AccHolderName + ", AccBal=" + AccBal + "]";
	}
	
	public void Withdraw() {
		
	}
	
	public void deposit()
	{
		
	}
}
