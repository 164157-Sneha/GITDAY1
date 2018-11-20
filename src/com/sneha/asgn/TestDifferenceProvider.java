package com.sneha.ser;

import com.sneha.service.*;
import com.sneha.service.support.*;

public class TestDifferenceProvider {

		public static void main(String[] args) {
			
			DataDifferenceCalc calc = new DataDifferenceCalc();
			TestRecords[] testrecord = new TestRecords[15];
			
			testrecord[0] = new TestRecords(new MyDate(20,11,2018), new MyDate(20,11,2018),0);
			testrecord[1] = new TestRecords(new MyDate(5,11,2018), new MyDate(20,11,2018),15);
			testrecord[2] = new TestRecords(new MyDate(06,04,2011), new MyDate(18,05,2011),42);
			testrecord[3] = new TestRecords(new MyDate(06,04,2011), new MyDate(18,06,2011),73);
			testrecord[4] = new TestRecords(new MyDate(06,04,2011), new MyDate(18,12,2011),256);
			testrecord[5] = new TestRecords(new MyDate(06,04,2011), new MyDate(18,12,2012),622);
			testrecord[6] = new TestRecords(new MyDate(06,04,2011), new MyDate(18,12,2013),987);
			testrecord[7] = new TestRecords(new MyDate(06,04,2011), new MyDate(18,12,2113),37511);
			testrecord[8] = new TestRecords(new MyDate(06,04,2011), new MyDate(18,12,2413),147084);
			testrecord[9] = new TestRecords(new MyDate(06,04,2011), new MyDate(18,12,2813),293181);
			testrecord[10] = new TestRecords(new MyDate(06,01,2011), new MyDate(06,03,2011),59);
			testrecord[11] = new TestRecords(new MyDate(06,01,2012), new MyDate(06,03,2012),60);
			testrecord[12] = new TestRecords(new MyDate(06,02,2012), new MyDate(06,03,2012),29);
			testrecord[13] = new TestRecords(new MyDate(22,01,2012), new MyDate(15,11,2012),298);
			testrecord[14] = new TestRecords(new MyDate(06,02,2012), new MyDate(06,12,2012),304);
			
			for(int index=0;index < testrecord.length; index++)
			{
				long calculatedDiff = calc.getDataDifference(testrecord[index].getStart_Date(),
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
