package com.sneha.test;

import com.sneha.amd.*;
import com.sneha.amd.supp.*;

public class TestDifferenceProvider {

	public static void main(String[] args) {
		
		DateDifferenceProvider provider = new DateDifferenceProvider();
		TestRecords[] testrecord = new TestRecords[2];
		
		testrecord[0] = new TestRecords(new MyDate(20,11,2018), new MyDate(20,11,2018),0);
		testrecord[1] = new TestRecords(new MyDate(20,11,2018), new MyDate(5,11,2018),15);
		
		for(int index=0;index < testrecord.length; index++)
		{
			int calculatedDiff = provider.getDateDifference(testrecord[index].getStart_Date(),
					testrecord[index].getEnd_Date());
			if (calculatedDiff == testrecord[index]. getActualDifference() ) 
			{
				System.out.println("Test Case passed");
			} 
			else 
			{
				System.err.println("Test Case failed"+" Actual = " + testrecord[index].getActualDifference()+ " calculated ="+ calculatedDiff);
			}
		}
		
	}
}
