package com.sneha.ds;

import java.util.*;

public class CUI {

	public static void main(String[] args) {
		
		{   
		
		String name="null";
	    String password="17685";
		int count=0;
		Scanner S1 =new Scanner(System.in);
		System.out.println("Enter your name");
		name= S1.next();
		System.out.println("enter your password");
		String pswrd=S1.next();
		if(password.equals(pswrd))
		{
			System.out.println("Welcome");
		}
		else
		{
	        while (count<3)
	  
	        {
	        	name= S1.next();
	        	System.out.println("enter your password");
	        	pswrd=S1.next();
	    
	        	if(password.equals(pswrd))
	        	{
	        		System.out.println("Welcome");
	        	}
	        	count++;
	        }
	        System.out.println("Contact Admin");
		}
		 S1.close();
		}
			
}
}
