package com.sneha.jav;

public class Calculate {

	public static void main(String[] args) {
		
	
		Arithematic add = (a,b) -> a+b;
		
		
		Arithematic sub = (a,b) ->{
			if(a>b)
			{
		     return a-b;
			}
			else
			{
				return b-a;
			}
				
		};
	
		
		Arithematic mul = (a,b) -> a*b;
	
		
		Arithematic div = (a,b) ->{
			if(b==0)
			{
				return 0;
			}
			else
			{
			return	a/b;
		    }
		};
	
		System.out.println("The addition of two numbers is");
		System.out.println(add.arithematic(10, 20));
	
		System.out.println("The Subtractrion of two numbers is");
		System.out.println(sub.arithematic(10, 20));
		
		System.out.println("The Multiplication of two numbers is");
		System.out.println(mul.arithematic(5, 20));
	
		System.out.println("The Division of two numbers is");
		System.out.println(div.arithematic(500, 0));
	}
	
	interface Arithematic
	{
		int arithematic(int a, int b);
	}
	
	
}
