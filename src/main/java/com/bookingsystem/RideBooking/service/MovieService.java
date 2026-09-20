package com.bookingsystem.RideBooking.service;
import com.bookingsystem.RideBooking.model.Movie;
import com.bookingsystem.RideBooking.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;
    public void add(Movie movie) {
         movieRepository.save(movie);
    }

    public Movie getMovies(Long id) {
        return movieRepository.getById(id);
    }
}
