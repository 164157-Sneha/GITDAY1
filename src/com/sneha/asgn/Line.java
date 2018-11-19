package com.sneha.asn;
import java.util.Scanner;

public class Line extends Shapes {

	@Override
	public void display() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter x co ordinates x1 and x2");
		int x1=sc.nextInt();
		int x2=sc.nextInt();
		System.out.println("enter x co ordinates y1 and y2");
		int y1=sc.nextInt();
		int y2=sc.nextInt();
		
		System.out.println("Line drawn with x "+x1+" " +x2+ "  y "+y1+""+y2);
		
		sc.close();
	}

}
