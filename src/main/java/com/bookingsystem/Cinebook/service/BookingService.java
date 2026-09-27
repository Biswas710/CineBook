package com.bookingsystem.Cinebook.service;

import com.bookingsystem.Cinebook.model.Booking;
import com.bookingsystem.Cinebook.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
    @Autowired
    BookingRepository bookingRepository;

    public void book(Booking booking) {
        bookingRepository.save(booking);

    }
}
