package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author k.milet
 */
public interface MovieRepositoryInterface extends CrudRepository<Movie, Long> {
//    Movie add(Movie movie);
//    List<Movie> list();
//    Movie getById(Long id);
}
