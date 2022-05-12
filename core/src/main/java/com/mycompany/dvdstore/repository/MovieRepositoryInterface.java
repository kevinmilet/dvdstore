package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.util.List;

/**
 * @author k.milet
 */
public interface MovieRepositoryInterface {
    void add(Movie movie);
    List<Movie> list();
    Movie getById(Long id);
}
