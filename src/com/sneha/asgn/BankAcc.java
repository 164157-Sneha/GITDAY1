package com.sneha.frame;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Iterator;

public class BankAcc implements Comparator<SavingsAcc>{
	

	public static void main(String[] args) {
		
		SortedSet<SavingsAcc> account = new TreeSet<SavingsAcc>(new BankAcc());
	
		account.add (new SavingsAcc(60000, 1234, "Sneha"));
		//System.out.println(s1);
		account.add(new SavingsAcc(50000, 1234, "jack"));
		//System.out.println(s2);
		account.add(new SavingsAcc(45000, 1235, "jill"));
		//System.out.println(s3);
		account.add(new SavingsAcc(60000, 1236, "john"));
		//System.out.println(s4);
		
		
		for(SavingsAcc acc:account)
        {
            System.out.println(acc);
        
	    }
	}
               

	@Override
	public int compare(SavingsAcc b1, SavingsAcc b2) {
		if(b1.getAcc_id()== b2.getAcc_id())
		{
		return 0;
	    }
		else if(b1.getAcc_id() > b2.getAcc_id())
		{
			return 1;
		}
		return -1;
	}
	}