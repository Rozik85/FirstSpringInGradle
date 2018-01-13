package com.sda.springstarter.demo.controller;

import com.sda.springstarter.demo.model.Publisher;
import com.sda.springstarter.demo.service.PublisherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publisher")
public class PublisherRestController {
    @Autowired
    private PublisherServiceImpl publisherService;

    @GetMapping
    public List<Publisher> getAllPublisher(){
        return publisherService.getAllPublisher();
    }

    @PostMapping("/addpublisher")
    public void savePublisher(@RequestBody Publisher publisher) {
        publisherService.savePublisher(publisher);
    }
}
