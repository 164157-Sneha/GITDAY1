package com.sneha.abc;

public class Movie_Details {

	String movieName;
	String actor;
	String actress;
	String genre;
	
	
	public Movie_Details(String movieName, String actor, String actress, String genre) {
		super();
		this.movieName = movieName;
		this.actor = actor;
		this.actress = actress;
		this.genre = genre;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public String getActor() {
		return actor;
	}


	public void setActor(String actor) {
		this.actor = actor;
	}


	public String getActress() {
		return actress;
	}


	public void setActress(String actress) {
		this.actress = actress;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	@Override
	public String toString() {
		return "Movie_Details [movieName=" + movieName + ", actor=" + actor + ", actress=" + actress + ", genre="
				+ genre + "]";
	}
	
	
	
}
