package com.bookingsystem.RideBooking.controller;

import com.bookingsystem.RideBooking.model.Movie;
import com.bookingsystem.RideBooking.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/request")
@RestController
public class MovieController {

        @Autowired
        MovieService movieService;
        @PostMapping("/add")
        ResponseEntity<String> add(@RequestBody Movie movie) {
                movieService.add(movie);
                return ResponseEntity.ok("Added");
        }
        @GetMapping("/getMovies/{id}")
        Movie getMovies(@PathVariable Long id){

         return movieService.getMovies(id);


    }

}
