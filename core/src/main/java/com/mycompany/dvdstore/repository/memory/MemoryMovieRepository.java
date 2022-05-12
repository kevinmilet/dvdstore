package com.mycompany.dvdstore.repository.memory;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * @author k.milet
 */
//@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {

    private final List<Movie> movies = new ArrayList<>();

    public void add(Movie movie) {
        movies.add(movie);
        System.out.println("The movie " + movie.getTitle() + " has been added.");
    }

    @Override
    public List<Movie> list() {
        return movies;
    }

    @Override
    public Movie getById(Long id) {
        return movies.stream().
                filter(m -> m.getId() == id).
                findFirst().get();
    }
}
