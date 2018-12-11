package com.sneha.abc;

import java.util.ArrayList;

public class MovieDetailsList implements MovieDtls {

		
  ArrayList<Movie_Details> mov = new ArrayList<>();

	@Override
	public void add_Movie() {
	
		mov.add(new Movie_Details("BulBul","Darshan","Rachitha","Drama"));
		mov.add(new Movie_Details("Bangalore Days","Dulquer","Nazriya","Drama"));
		mov.add(new Movie_Details("Bahubali","Prabhas","Anushka","Action"));

		System.out.println("Movie details" +mov);
		
	}

	@Override
	public void remove_movie() {
		mov.remove(2);
		System.out.println("After removing" +mov);
		
	}

	@Override
	public void removeAllMovies() {
	    mov.removeAll(mov);
	    System.out.println(mov);
		
	}

	@Override
	public void find_Movie_By_MovieName() {
		int movLength = mov.size();
		for(Movie_Details d: mov)
		{
			   if(d.getMovieName().equals("BulBul"))
			   {
			     System.out.println("movie found" +mov);
			    }
		
	}
		
	}

	@Override
	public void find_Movie_By_genre() {
		int movLength = mov.size();
		for(Movie_Details d: mov)
		{
			   if(d.getGenre().equals("Drama"))
			   {
			     System.out.println("movie found"+mov);
			    }
		
	}
	}

	public static void main(String[] args)
	{

        MovieDetailsList movie = new MovieDetailsList();
        
        movie.add_Movie();
        movie.remove_movie();
        movie.removeAllMovies();
        movie.find_Movie_By_MovieName();
        movie.find_Movie_By_genre();
        
        
	}
	
	}
	

