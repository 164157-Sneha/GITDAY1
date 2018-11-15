package com.sneha.ds;

public class Calculator {
	
	int num1,num2,result;
	
	void add(int num1, int num2){
			
		result = num1 + num2;
		System.out.println("Addition"+  result);
		
	}
	void sub(int num1, int num2){
		
		result = num1 - num2;
		System.out.println("Subtraction"+  result);
	
	}
	void div(int num1, int num2){
		
		result = num1 / num2;
		System.out.println("Division"+  result);
		
	}
	void mul(int num1, int num2){
	
		result = num1 * num2;
		System.out.println("Multiplication"+  result);
		
	}

}
