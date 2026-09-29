package com.bookingsystem.Cinebook.service;

import com.bookingsystem.Cinebook.model.Booking;
import com.bookingsystem.Cinebook.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    @Autowired
    BookingRepository bookingRepository;

    public void book(Booking booking) {
        bookingRepository.save(booking);

    }

    public Optional<Booking> getBook(Long id) {
        return bookingRepository.findById(id);

    }

    public List<Booking> getAllBook() {
        return bookingRepository.findAll();
    }

    public List<Booking> getAllBookOfUser(Long id) {
        return bookingRepository.findByUserId(id);
    }

    public List<Booking> getAllBookMovie(Long id) {
        return bookingRepository.findByMovieId(id);
    }

    public ResponseEntity<String> deleteBooking(Long id) {
        bookingRepository.deleteById(id);
        return ResponseEntity.ok("Deleted");

    }
}
