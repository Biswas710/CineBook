package com.bookingsystem.Cinebook.controller;

import com.bookingsystem.Cinebook.model.Show;
import com.bookingsystem.Cinebook.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/show")
public class ShowController {
    @Autowired
    ShowService showService;
    @PostMapping("/addShow")
    String addShow(@RequestBody Show show){
        showService.addShow(show);
        return "Added";

    }
}
