package com.sneha.ds;

public class LinearSearch {

	int a[] = new int[]{5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	
	void Search(int num)
	{
		for(int i=0;i<15;i++)
		{
			if(num==a[i])
			{
				System.out.println("the number is found in position :" +i);
			}	
			else
			{
				System.out.println("the element not found");	
			}
		}
	}
	
}
