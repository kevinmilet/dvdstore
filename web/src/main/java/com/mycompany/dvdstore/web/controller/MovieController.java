package com.mycompany.dvdstore.web.controller;

import com.mycompany.dvdstore.entity.Actor;
import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import com.mycompany.dvdstore.web.form.MovieForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author k.milet
 */
@Controller
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

//    @GetMapping("/{id}")
//    public String displayMovieCard(@PathVariable("id") Long id, Model model) {
//        ModelAndView mv = new ModelAndView("movie-details");
//        model.addAttribute("movie", movieService.getMovieById(id));
//        return "movie-details";
//    }

    @PostMapping("/add")
    public String addMovie(@Valid @ModelAttribute MovieForm movieForm, BindingResult results) {
        if (results.hasErrors()) {
            return "add-movie-form";
        }
        Movie movie = new Movie();
        movie.setTitle(movieForm.getTitle());
        movie.setGenre(movieForm.getGenre());
        movie.setDescription(movieForm.getDescription());

        Actor actor = new Actor();
        actor.setFirstName(movieForm.getFirstName());
        actor.setLastName(movieForm.getLastName());
        movie.setMainActor(actor);

        movieService.registerMovie(movie);
        return "movie-added";
    }
}
