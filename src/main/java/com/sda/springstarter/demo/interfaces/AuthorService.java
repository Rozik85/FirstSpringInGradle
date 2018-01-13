package com.sda.springstarter.demo.interfaces;

import com.sda.springstarter.demo.model.Author;

import java.util.List;

public interface AuthorService {
    List<Author> getAllAuthor();

    void saveAuthor(Author author);
}
