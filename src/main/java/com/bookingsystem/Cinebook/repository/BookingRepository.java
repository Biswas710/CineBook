package com.bookingsystem.Cinebook.repository;

import com.bookingsystem.Cinebook.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking,Long> {
    List<Booking> findByUserId(Long id);


    List<Booking> findByMovieId(Long id);
}
