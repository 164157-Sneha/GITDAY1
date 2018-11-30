package com.sneha.jav;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class GetFirst {

	public static void main(String[] args) {
		
		StringBuilder strBuild=new StringBuilder("Yuvraj");
		List<StringBuilder> l=new ArrayList<>();
		l.add(strBuild);
		StringBuilder strBuild1=new StringBuilder("Federrer");
		l.add(strBuild1);
		StringBuilder strBuild2=new StringBuilder("Virat");
		l.add(strBuild2);
		

	 Consumer<List<StringBuilder>> consumer=(x)->{
			l.stream().map(n->n.charAt(0)).forEach(System.out::println);
	 };

consumer.accept(l);

	}

}
