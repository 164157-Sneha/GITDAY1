package com.sneha.jav;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestFruit{

	public static void main(String[] args) {
		
		 List<Fruits> frt = new ArrayList<Fruits>();
		 frt.add(new Fruits("Apple",80,150,"RED"));
		 frt.add(new Fruits("Mango",90,50,"Yellow"));
		 frt.add(new Fruits("JackFruit",150,80,"Green"));
		 frt.add(new Fruits("Bannana",70,40,"Yellow"));
         frt.add(new Fruits("Cherry",120,200,"RED"));
         
         
		 frt.stream()
		 .filter(n-> n.getCalories()<100)
		 .sorted(Comparator.comparing(Fruits::getCalories).reversed())
		 .forEach(System.out :: println);
		 
		 frt.stream()
		 .map(n->n.getColor() + ":" + n.getName())
		 .sorted(Comparator.naturalOrder())
		 .forEach(System.out::println);
		 
		 frt.stream()
		 .filter(n-> n.getColor().equals("RED"))
		 .sorted(Comparator.comparing(Fruits::getPrice).reversed())
		 .forEach(System.out :: println);
		 
		 
		 
	}
}
