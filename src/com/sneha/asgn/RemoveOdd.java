package com.sneha.jav;
import java.util.ArrayList;


public class RemoveOdd {

	public static void main(String[] args) {
		
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Sneha");
		names.add("Yuvraj");
		names.add("Dhoni");
		names.add("Shruthi");
		
		names.removeIf(name -> name.length()%2 != 0);
        System.out.println(names);
	}

}
