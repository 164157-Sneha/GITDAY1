package com.sneha.ds;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner mark= new Scanner(System.in); 
		int score1= mark.nextInt();
		int score2= mark.nextInt();
		int score3= mark.nextInt();
		
		System.out.println("marks of subject 1="+score1);
		System.out.println("marks of subject 2="+score2);
		System.out.println("marks of subject 3="+score3);
		
if(score1>60 && score2>60 && score3>60)
		{
			System.out.println("passed");
		}
else if((score1>60 && score2>60) || (score2>60 && score3>60) || (score1>60 && score3>60))
		{
			System.out.println("Promoted");
		}
		else
		{
			System.out.println("Fail");
		}
			
         mark.close();
}

}

