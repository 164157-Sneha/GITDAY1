package com.sneha.jav;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List; 
import java.util.stream.Collectors;


public class ToUppercase {

	public static void main(String[] args) {
		
		
		List<String> names = new ArrayList<>();
		
		names.add("Mary");
		names.add("Jack");
		names.add("Jill");
		names.add("peter");
		
		names.stream()
		     .map(n-> n.replaceAll(n, n.toUpperCase()))
		     .forEach(System.out::println);
	}

     
}
