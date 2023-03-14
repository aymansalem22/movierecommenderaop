package com.paltecno.springaop.movierecommenderaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paltecno.springaop.movierecommenderaop.data.Movie;

@Service
public class FilteringTechnique1 {

	@Autowired
	private Movie movie;

	public String contentBasedFiltering() {
		String movieDetails = movie.getMovieDetails();
		return movieDetails;
	}
}
