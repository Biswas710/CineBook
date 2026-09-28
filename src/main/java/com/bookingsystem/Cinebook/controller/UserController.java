package com.bookingsystem.Cinebook.controller;

import com.bookingsystem.Cinebook.model.User;
import com.bookingsystem.Cinebook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/getAllUsers")
    List<User>getAll(){

        return userService.getAll();
    }
    @GetMapping("/getById/{id}")
    Optional<User> getAll(@PathVariable Long id){
        return userService.getById(id);
    }
    @DeleteMapping("/deleteById/{id}")
    void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }
    @PutMapping("/update/{id}")
    void updateUser(@RequestBody User user,@PathVariable Long id){
        userService.updateUser(user,id);
    }
}
