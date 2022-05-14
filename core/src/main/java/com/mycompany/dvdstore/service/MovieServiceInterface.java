package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;

import java.util.List;

/**
 * @author k.milet
 */
public interface MovieServiceInterface {
    Movie registerMovie(Movie movie);
    List<Movie> getMovieList();
    Movie getMovieById(Long id);
}
