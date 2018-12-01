package com.sneha.amd;

import com.sneha.amd.supp.MyDate;

public class DateDifferenceProvider {
	
	static final int Jan = 31;
	static final int feb = 28;
	static final int mar = 31;
	static final int apr = 30;
	static final int may = 31;
	static final int Jun = 30;
	static final int Jul = 31;
	static final int aug = 31;
	static final int sep = 30;
	static final int oct = 31;
	static final int nov = 30;
	static final int dec = 31;
	
	int months[] = {Jan ,feb, mar, apr, may, Jun, Jul, aug, sep, oct, nov, dec};
	
	public static int getDateDifference(MyDate start_date , MyDate end_date){
	    
		if (sameDate(start_date, end_date) && sameMonth(start_date, end_date) && sameYear(start_date, end_date))
		{
			return 0;
		} 
		else if (sameMonth(start_date, end_date) && sameYear(start_date, end_date)) 
		{
			return end_date.getDd() - start_date.getDd();
		} 
		else if (sameYear(start_date, end_date)) 
		{
			return remainingDaysOfMonth(start_date) + daysInIntervingMonth(start_date, end_date) + end_date.getDd();
		} 
		else
		{
			return remainingDaysOfMonth(start_date) + remainingDaysInYear(start_date) + leadingYear(end_date)
					+ daysInInterveningYear(start_date, end_date);
		}
		
		}

     private boolean sameDate(MyDate start_date,MyDate end_date)
     {
    	 return end_date.getDd() == start_date.getDd();
     }

     private boolean sameMonth(MyDate start_date,MyDate end_date)
     {
    	 return end_date.getMm() == start_date.getMm();
     }

     private boolean sameYear(MyDate start_date,MyDate end_date)
     {
    	 return end_date.getYyyy() == start_date.getYyyy();
     }

     
     private int remainingDaysOfMonth(MyDate date)
     {
    	 return months[date.getMm()-1] + date.getDd();
     }

     private int daysInIntervingMonth(MyDate start_date,MyDate end_date)
     {
    	 int totaldays=0;
    	 for(int index=start_date.getMm()+1; index< end_date.getMm();index++)
    	 {
    		 totaldays = totaldays + months[index - 1];
    	 }
    	 return totaldays;
     }

     private int daysInIntervingYear(MyDate start_date,MyDate end_date) 
     {
    	 
     }

}



