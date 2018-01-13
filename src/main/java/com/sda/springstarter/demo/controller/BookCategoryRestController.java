package com.sda.springstarter.demo.controller;

import com.sda.springstarter.demo.model.BookCategory;
import com.sda.springstarter.demo.service.BookCategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@RestController("/bookcategory")
public class BookCategoryRestController {

    @Autowired
    private BookCategoryServiceImpl bookCategoryService;

    @GetMapping
    public List<BookCategory> getAllBookCategory(){
        return bookCategoryService.getAllBookCategory();
    }

    @PostMapping("/addnewcategory")
    public void saveBookCategory(@RequestBody BookCategory bookCategory) {
        bookCategoryService.saveBookCategory(bookCategory);
    }
}
