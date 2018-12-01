package com.sneha.asn;
import java.util.Scanner;

public class Cubes extends Shapes {

	@Override
	public void display() {
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the length of the cube");
		int length = s2.nextInt();
		System.out.println("Enter the breadth of the cube");
		int breadth = s2.nextInt();
		System.out.println("Enter the height of the cube");
		int height = s2.nextInt();
		
		System.out.println("the cube is drawn with height :" + height +"length :" +length + "breadth :"+breadth);
	
	s2.close();
	}

}
