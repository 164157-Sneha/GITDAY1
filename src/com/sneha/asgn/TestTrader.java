package com.sneha.jav;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.Comparator;

public class TestTrader {

	public static void main(String[] args) {
		
		List<Trader> trader = new ArrayList<Trader>();
		trader.add(new Trader("Sneha","Bangalore"));
		trader.add(new Trader("Chaya","Mangalore"));
		trader.add(new Trader("Urvi","Indore"));
		trader.add(new Trader("Rashmi","Pune"));
		trader.add(new Trader("Sindhu","Delhi"));
		trader.add(new Trader("Arpitha","Pune"));
		
		List<Transactions> t1 = new ArrayList<Transactions>();
		t1.add(new Transactions(new Trader("Sneha","Bangalore"),2011,500000));
		t1.add(new Transactions(new Trader("Chaya","Mangalore"),2015,400000));
		t1.add(new Transactions(new Trader("Urvi","Indore"),2014,600000));
		t1.add(new Transactions(new Trader("Rashmi","Pune"),2010,500000));
		t1.add(new Transactions(new Trader("Sindhu","Delhi"),2011,700000));
		t1.add(new Transactions(new Trader("Arpitha","Pune"),2011,600000));
		t1.add(new Transactions(new Trader("Madhuri","Delhi"),2012,500000));
 
		t1.stream()
		  .filter(n->n.getYear()==2011)
		  .sorted(Comparator.comparing(Transactions::getValue).reversed())
		  .forEach(System.out::println);
		  
		t1.stream()
		  .map(n->n.getTrader().getCity())
		  .distinct()
		  .forEach(System.out::println);
		
	
		trader.stream()
		.filter(x -> x.getCity()=="Pune")
		.sorted(Comparator.comparing(Trader::getName))
		.forEach(System.out::println);
		
		trader.stream()
		       .map(n->n.getName())
		       .sorted()
		       .forEach(t->System.out.print(" "+ t + "\n"));
	                  
     	Predicate<Trader> p1 = s -> s.city.equals("Indore");
	    boolean t2 = trader.stream().anyMatch(p1); 
	    System.out.println(t2);
		
        t1.stream()
        .filter(n->n.getTrader().getCity().equals("Delhi"))
        .map(x->x.getValue())
	    .forEach(System.out::println);

	    int maxValue = t1.stream()
	    		.map(s-> s.getValue())
                          .max(Comparator.comparing(Integer::valueOf))
                          .get();
	    System.out.println("The maximum transaction occiured is" + " " +maxValue);
//	    System.out.println("The maximum transaction occiured is" + " " +t1.stream()
//                .max(Comparator.comparing(Transactions::getValue))
//                .get().value);
	    
	    

//	    Transactions trans = t1.stream()
//	                           .min(Comparator.comparing(Transactions::getValue))
//	                           .get();
	    
	    System.out.println("The minimum transaction occiured is" + " " + t1.stream()
	
                .min(Comparator.comparing(Transactions::getValue))
                .get().value);
	    
	    
	    
	}	  
}
