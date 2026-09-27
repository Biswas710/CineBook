package com.bookingsystem.Cinebook.service;
import com.bookingsystem.Cinebook.model.Movie;
import com.bookingsystem.Cinebook.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Movie> getMoviesByGenre(String genre) {
        return movieRepository.getMoviesByGenre(genre);
    }
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public String update(Long id,Movie movie) {
        Movie movie1=movieRepository.findById(id).orElseThrow();
        movie1.setTitle(movie.getTitle());
        movie1.setGenre(movie.getGenre());
        movie1.setLanguage(movie.getLanguage());
        movie1.setDuration(movie.getDuration());
        movieRepository.save(movie1);
        return "Yes";

    }

    public String deleteMovie(Long id) {
        movieRepository.deleteById(id);
        return "Deleted";
    }
}
