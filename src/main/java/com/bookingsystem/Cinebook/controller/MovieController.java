package com.bookingsystem.Cinebook.controller;

import com.bookingsystem.Cinebook.model.Movie;
import com.bookingsystem.Cinebook.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/request")
@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping("/add")
    ResponseEntity<String> add(@RequestBody Movie movie) {
        movieService.add(movie);
        return ResponseEntity.status(201).body("Movie Added");
    }

    @GetMapping("/getMovies/{id}")
    ResponseEntity<Movie> getMovies(@PathVariable Long id) {
        Movie movie= movieService.getMovies(id);
        if (movie == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(movie);
    }

    @GetMapping("/getMoviesByGenre")
    List<Movie> getMoviesGenre(@RequestParam String genre) {
        return movieService.getMoviesByGenre(genre);
    }

    @GetMapping("/getMovies")
    List<Movie> getMovies() {
        return movieService.getAllMovies();
    }

    @PutMapping("/update/{id}")
    String updateById(@PathVariable Long id, @RequestBody Movie movie) {
        return movieService.update(id, movie);
    }

    @DeleteMapping("/deleteById/{id}")
    ResponseEntity<String> deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
        return ResponseEntity.ok("Deleted");
    }
}
