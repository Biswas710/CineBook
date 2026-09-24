package com.bookingsystem.Cinebook.service;

import com.bookingsystem.Cinebook.model.User;
import com.bookingsystem.Cinebook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public void addUser(User user) {
        userRepository.save(user);

    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public Optional<User> getById(Long id) {
        return userRepository.findById(id);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public void updateUser(User user,Long id) {
        User user1=userRepository.findById(id).orElseThrow();
        user1.setName(user.getName());
        user1.setEmail(user.getName());
        user1.setPassword(user.getPassword());
        user1.setRole(user.getRole());
        userRepository.save(user1);

    }
}
