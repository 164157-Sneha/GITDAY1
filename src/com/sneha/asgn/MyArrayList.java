package com.sneha.asn;

public class MyArrayList implements MyList{

	int array[];
	int arrLen;
	
	public MyArrayList(int[] array)
	{
		this.array= array;
		this.arrLen = array.length;
	}
	@Override
	public void add() {
		
		int sum = 0;
		for (int i = 0; i < arrLen; i++) {
			sum =sum + array[i];	 
		}
		System.out.println(sum);
	}

	@Override
	public void get(int num) {
		
		int temp=0;
		for(int i=0; i< arrLen; i++)
		{
			if(temp == num)
			{
				System.out.println("element found" + i);
			}
			else
			{
				System.out.println("element not found");
			}
		}
		
	}

	@Override
	public void getAll() {
		
		for(int i=0; i < arrLen; i++)
		{
			System.out.println(array[i]);
		}
		
	}

	@Override
	public void update(int position, int num) {
		int temp = 0;
		for(int i=0;i< arrLen;i++)
		{
			if(temp==position)
			{
				array[position] = num;
			}
		}

		
	}

	@Override
	public void remove(int index) {
		int temp=0;
		for(int i =index-1; i <arrLen-1; i++ ){
			temp = array[i+1];
			array[i] = array[i+1];
			array[i+1] = temp;
		}
		array[arrLen-1]=0;
		System.out.println(array[index]);
		
	}

	public static void main(String[] args) {
		
		MyArrayList m = new MyArrayList(new int[] {12,1,4,45,21});
		m.add();
		m.get(45);
		m.getAll();
		m.update(3,15);
		m.remove(3);
	}
}
