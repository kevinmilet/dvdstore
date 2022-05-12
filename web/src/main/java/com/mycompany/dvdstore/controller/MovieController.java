package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Scanner;

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

//    public void addUsingConsole() {
//        Movie movie = new Movie();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What is the movie title?");
//        String movieTitle = scanner.nextLine();
//        movie.setTitle(movieTitle);
//
//        System.out.println("What is the movie genre?");
//        String movieGenre = scanner.nextLine();
//        movie.setGenre(movieGenre);
//
//        movieService.registerMovie(movie);
//    }

    @RequestMapping("/{id}")
    public String displayMovieCard(@PathVariable("id") Long id, Model model) {
        ModelAndView mv = new ModelAndView("invoice-details");
        model.addAttribute("movie", movieService.getMovieById(id));
        return "movie-details";
    }
}
