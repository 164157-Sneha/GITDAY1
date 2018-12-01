package com.sneha.jav;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class TestNews {

	public static void main(String[] args) 
	{
		
		List<News> news = new ArrayList<News>();
		
		news.add(new News(123,"Sneha","Parthiban","Doing Budget Good"));
		news.add(new News(152,"Parthibhan","Sneha","Good reports"));
		news.add(new News(176,"Roshan","Sneha","Good News Daily"));
		news.add(new News(123,"Sneha","Roshan","Have a good day"));
		
	    Map<String,Long> res=news.stream()
	                              .map(n-> n.getCommentByUser())
	                              .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	                         
        System.out.println(news.stream()
	                           .filter(n->n.getComment().contains("Budget"))
	                           .count());
	  
	    
	    System.out.println(news.stream().max(Comparator.comparing(News::getCommentByUser)).get().commentByUser);
	    
	    News max = news.stream()
				    .collect(Collectors.maxBy(
					 Comparator.comparing(News::getNewsId)))
				    .get();
				                
		             
	    System.out.println(res);
	    
	    System.out.println(max);
	   
       
	    
	}

}
