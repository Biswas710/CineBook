package com.bookingsystem.Cinebook.service;

import com.bookingsystem.Cinebook.model.User;
import com.bookingsystem.Cinebook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public void addUser(User user) {
        userRepository.save(user);

    }
}
