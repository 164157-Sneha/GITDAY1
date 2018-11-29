package com.sneha.jav;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Function;

public class Predicate1 {
	
	public static void main(String[] args) {
		
		int x=1;
		
		Predicate<Integer> greater = number -> number > 20;
		System.out.println("Is the number is greater then 20 ?  " + greater.test(15));
		
		
		System.out.println("#############################");
		
		
		Consumer<Integer> myvalue = (y) -> 
	      {
	          System.out.println("x = " + x); 
	          System.out.println("y = " + y);
	      };
	      myvalue.accept(x);
	      
	      
	      
	    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	      
	    
	    Supplier<String> name = () -> "Sneha";
        System.out.println(name.get()); 
        
        
        
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	     

        Function<Integer,String> convert = (number)-> Integer.toString(number);        
        System.out.println(convert.apply(12).length());
        System.out.println(convert.apply(300).length());
	        
	    }
	}


