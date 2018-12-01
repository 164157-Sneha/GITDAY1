package com.sneha.ds;

public class BubbleSort {

	int a[] = new int[]{5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	int temp;
	
	void Sort()
	{
		for(int i=0;i<15;i++)
		{
			for (int j=i+1;j<15;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
		}
		for(int k=0;k<15;k++){
			
			System.out.println(a[k]);
		}
	}
}
