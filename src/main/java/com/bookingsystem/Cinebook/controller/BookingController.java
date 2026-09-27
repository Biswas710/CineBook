package com.bookingsystem.Cinebook.controller;

import com.bookingsystem.Cinebook.model.Booking;
import com.bookingsystem.Cinebook.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookingController {
    @Autowired
    BookingService bookingService;
    @PostMapping("/bookIt")
    ResponseEntity<String> addBooking(@RequestBody Booking booking){
        bookingService.book(booking);
        return ResponseEntity.ok("Added");

    }
}
