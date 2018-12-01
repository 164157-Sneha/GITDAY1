package com.sneha.abc;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;
import com.sneha.abc.SavingAcc;

public class BankAcc implements Comparable{


	SavingAcc s1 = new SavingAcc(12423,"Sneha",50000);
	SavingAcc s2 = new SavingAcc(42315,"Shravya",70000);
	SavingAcc s3 = new SavingAcc(14267,"Shreya", 55000);
	
	SortedSet<SavingAcc> acc = new TreeSet<>();
	for(SavingAcc s:acc)
	{
		System.out.println(acc);

	}
	@Override
	public int compareTo(Object account) {
		if()
		return 0;
	}
}
