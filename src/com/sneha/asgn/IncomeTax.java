package com.sneha.ds;

public class IncomeTax {

	double tax;
	
	void MyTax(int tax)
	{
		if (tax <= 180000)
		{
			System.out.println("No Tax to be paid");
		}
			else if(tax>180000 && tax<=300000)
			{
				System.out.println("Tax =" + (0.1)*tax);
			}
			else if(tax>300000 && tax<500000)
			{
				System.out.println("Tax =" + (0.2)*tax);
			}
			else if(tax>500000 && tax<=1000000)
			{
				System.out.println("Tax =" + (0.3)*tax);
		    }
	}
	
}
