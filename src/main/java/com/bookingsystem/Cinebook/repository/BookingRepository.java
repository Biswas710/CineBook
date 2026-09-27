package com.bookingsystem.Cinebook.repository;

import com.bookingsystem.Cinebook.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Long> {
}
