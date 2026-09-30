package com.bookingsystem.Cinebook.service;

import com.bookingsystem.Cinebook.model.Show;
import com.bookingsystem.Cinebook.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowService {
    @Autowired
     ShowRepository showRepository;
    public void addShow(Show show) {
        showRepository.save(show);
    }
}
