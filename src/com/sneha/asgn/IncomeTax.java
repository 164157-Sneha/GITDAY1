package com.sneha.ds;

public class IncomeTax {

	double tax;
	
	void MyTax(int amount)
	{
		int tax_Pd = amount-180000;
		if (tax_Pd <= 180000)
		{
			System.out.println("tax to be paid is" + (0.1)*(tax_Pd));
		}
			else if(tax_Pd>180000 && tax_Pd<=300000)
			{
				System.out.println("Tax =" + (0.1)*(tax_Pd));
			}
			else if(tax_Pd>300000 && tax_Pd<500000)
			{
				System.out.println("Tax =" + ((0.1)*(300000) + (0.2)*(tax_Pd-300000)));
			}
			else if(tax_Pd>500000 && tax_Pd<=1000000)
			{
				System.out.println("Tax =" +((0.1)*(300000)+ (0.2)*(200000) + (0.3)*(tax_Pd-500000)));
		    }
	}
	
}
