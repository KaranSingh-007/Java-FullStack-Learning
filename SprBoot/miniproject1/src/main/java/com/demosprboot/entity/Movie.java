package com.demosprboot.entity;

public class Movie {
	private int movieId;
	private String movieName;
	private String category;
	private double rating;
	
	public Movie() {
		
	}
	public Movie(int movieId, String movieNmae, String category, double rating) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.category = category;
		this.rating = rating;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getcategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getRating() {
		return rating;
	} 
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [movieId = "+movieId+", movieName = "+movieName+", category = "+category+", rating = "+rating+"]";
	}
}