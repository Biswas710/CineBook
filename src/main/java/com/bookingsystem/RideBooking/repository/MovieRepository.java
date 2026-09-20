package com.bookingsystem.RideBooking.repository;

import com.bookingsystem.RideBooking.model.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Long> {
}
