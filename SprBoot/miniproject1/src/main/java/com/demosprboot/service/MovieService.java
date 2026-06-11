package com.demosprboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demosprboot.entity.Movie;


@Service
public class MovieService {
	private List<Movie> movieList = new ArrayList<>();
	public MovieService() {
		movieList.add(
				new Movie(1,"Pushpa","Action",7.5));
		movieList.add(
				new Movie(2,"Avatar","Sci-fi",8));
		movieList.add(
				new Movie(3,"KGF","Action",8.5));
	}
	public List<Movie>getAllMovies(){
		return movieList;
	}
	public Movie getMovieById(int id) {
		for(Movie movie : movieList) {
			if(movie.getMovieId() == id) {
				return movie;
			}
		}
		return null;
	}
	public Movie addMovie(Movie movie) {
		movieList.add(movie);
		return movie;
	}
	//Update
	public Movie updateMovie(
			int id,
			Movie updatedMovie) {
		for(Movie movie : movieList) {
			if(movie.getMovieId() == id) {
				movie.setMovieName(
						updatedMovie.getMovieName());
				movie.setCategory(
						updatedMovie.getcategory());
				movie.setRating(
						updatedMovie.getRating());
				
				return movie;
			}
		}
		return null;
	}
	//Delete movie
	public String deleteMovie(int id) {
		Movie movie = getMovieById(id);
		if(movie != null) {
			movieList.remove(movie);
			return "Movie Deleted Successfully...";
		}
		return "Movie not found...";
	}
}
