package com.sneha.test;
import com.sneha.amd.supp.*;

public class TestRecords {

	MyDate start_Date;
	MyDate end_Date;
	int actualDifference;
	
	public TestRecords(MyDate start_Date, MyDate end_Date, int actualDifference) {
		super();
		this.start_Date = start_Date;
		this.end_Date = end_Date;
		this.actualDifference = actualDifference;
	}

	public MyDate getStart_Date() {
		return start_Date;
	}

	public void setStart_Date(MyDate start_Date) {
		this.start_Date = start_Date;
	}

	public MyDate getEnd_Date() {
		return end_Date;
	}

	public void setEnd_Date(MyDate end_Date) {
		this.end_Date = end_Date;
	}

	public int getActualDifference() {
		return actualDifference;
	}

	public void setActualDifference(int actualDifference) {
		actualDifference = actualDifference;
	}
	
	 
	
}
