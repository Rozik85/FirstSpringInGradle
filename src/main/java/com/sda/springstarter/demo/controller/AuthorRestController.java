package com.sda.springstarter.demo.controller;

import com.sda.springstarter.demo.model.Author;
import com.sda.springstarter.demo.service.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorRestController {

    @Autowired
    private AuthorServiceImpl authorService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Author> getAllAuthor() {
        return authorService.getAllAuthor();
    }

    @PostMapping("/addnewauthor")
    public void saveAuthor(@RequestBody Author author) {
        authorService.saveAuthor(author);
    }
}
