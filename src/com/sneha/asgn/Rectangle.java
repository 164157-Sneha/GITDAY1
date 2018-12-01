package com.sneha.asn;
import java.util.Scanner;

public class Rectangle extends Shapes{

	@Override
	public void display() {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("enter the length of the rectangle");
		int length = s1.nextInt();
		System.out.println("enter the breadth of the rectangle");
		int breadth = s1.nextInt();
		
		System.out.println("Rectangle length" + length + "Breadth" + breadth);
		
		s1.close();
	}
    
	
}
