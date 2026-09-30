package com.bookingsystem.Cinebook.controller;

import com.bookingsystem.Cinebook.model.Booking;
import com.bookingsystem.Cinebook.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookingController {
    @Autowired
    BookingService bookingService;
    @PostMapping("/bookIt")
    ResponseEntity<String> addBooking(@RequestBody Booking booking){
        bookingService.book(booking);
        return ResponseEntity.status(201).body("Created");
    }
    @GetMapping("/getBooking/{id}")
    Optional<Booking> getBook(@PathVariable Long id){
        return bookingService.getBook(id);
    }
    @GetMapping("/getAllBooking")
    List<Booking> getAllBook(){
        return bookingService.getAllBook();
    }
    @GetMapping("/getBookingUser/{id}")
    List<Booking> getAllBookOfUser(@PathVariable Long id){
        return bookingService.getAllBookOfUser(id);
    }

    @DeleteMapping("/deleteBooking/{id}")
    ResponseEntity<String>deleteIt(@PathVariable Long id){
        bookingService.deleteBooking(id);
        return ResponseEntity.ok("Successfully Deleted");
    }
}
