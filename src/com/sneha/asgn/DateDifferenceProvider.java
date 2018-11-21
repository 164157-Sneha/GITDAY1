package com.sneha.amd;

import com.sneha.amd.supp.MyDate;
import com.sneha.*;

public class DateDifferenceProvider {
	
	/*static final int Jan = 31;
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
	static final int dec = 31;*/
	
	int months[] = {31 ,28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int index;
	int dayDiff1 , dayDiff2;
	
	public long getDateDifference(MyDate start_date , MyDate end_date){
	    
		/*if (sameDate(start_date, end_date) && sameMonth(start_date, end_date) && sameYear(start_date, end_date))
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

     private int remainingDaysInYear(MyDate start_date){
    	 
    	 int remainingdays=0;
    	 for(int index=start_date.getMm()+1; index< new MyDate(31,12,Yyyy); index++){
    		 
    	 }
     }
     private int daysInIntervingYear(MyDate start_date,MyDate end_date) 
     {
    	 int remainingdays;
    	 for(int index = start_date.getYyyy(); index<end_date.getYyyy(); index++)
    	 {
    		 remainingdays = 
    	 }
    	 
     }*/

	 dayDiff1 = start_date.getYyyy()*365 + start_date.getMm() + start_date.getDd() + numberOfLeapYears(start_date);  	
	 dayDiff2 = end_date.getYyyy()*365 + end_date.getMm() + end_date.getDd() + numberOfLeapYears(end_date);	
	
	for(index = 0; index < (start_date.getMm())-1 ; index++)
	{
		dayDiff1 = dayDiff1 + months[index];
	}
	
	for(index = 0; index < (end_date.getMm())-1 ; index++)
	{
		dayDiff2 = dayDiff2 + months[index];
	}
	return (dayDiff2 - dayDiff1);
		
	}
	
	public int numberOfLeapYears(MyDate date)
	{
		if(date.getMm()<=2)
		{
			return (((date.getYyyy()-1)/4) - ((date.getYyyy()-1)/100) + ((date.getYyyy()-1)/400));
		}
		else
		{
			return ((date.getYyyy()/4) - (date.getYyyy()/100) + (date.getYyyy()/400));
		}
	}
}




