package com.bookingsystem.Cinebook.controller;

import com.bookingsystem.Cinebook.model.User;
import com.bookingsystem.Cinebook.service.UserService;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/addUser")
    ResponseEntity<String>addUser(@RequestBody User user){
        userService.addUser(user);
        return ResponseEntity.status(201).body("Created");


    }
}
