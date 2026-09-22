package com.bookingsystem.Cinebook.repository;

import com.bookingsystem.Cinebook.model.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie,Long> {


    List<Movie> getMoviesByGenre(String genre);


}
