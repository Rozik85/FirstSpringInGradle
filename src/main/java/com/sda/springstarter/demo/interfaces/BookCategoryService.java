package com.sda.springstarter.demo.interfaces;

import com.sda.springstarter.demo.model.BookCategory;

import java.util.List;

public interface BookCategoryService {
    List<BookCategory> getAllBookCategory();
    void saveBookCategory(BookCategory bookCategory);
}
