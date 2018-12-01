package com.sneha.test;

import com.sneha.amd.*;
import com.sneha.amd.supp.*;

public class TestDifferenceProvider {

	public static void main(String[] args) {
		
		DateDifferenceProvider provider = new DateDifferenceProvider();
		TestRecords[] testrecord = new TestRecords[4];
		
		testrecord[0] = new TestRecords(new MyDate(04,06,2011), new MyDate(04,06,2011),0);
		testrecord[1] = new TestRecords(new MyDate(06,04,2011), new MyDate(18,04,2011),15);
		testrecord[2] = new TestRecords(new MyDate(06,04,2011), new MyDate(18,05,2011),42);
		testrecord[3] = new TestRecords(new MyDate(06,04,2011), new MyDate(18,12,2018),73); 
		
		for(int index=0;index < testrecord.length; index++)
		{
			long calculatedDiff = provider.getDateDifference(testrecord[index].getStart_Date(), testrecord[index].getEnd_Date());
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
