package com.paltecno.springaop.movierecommenderaop.data;

import org.springframework.stereotype.Repository;

import com.paltecno.springaop.movierecommenderaop.aspect.MeasureTime;

@Repository
public class Movie {

	@MeasureTime
	public String getMovieDetails() {
		// interacts with the Movie repository
		return "movie details";
	}

}
