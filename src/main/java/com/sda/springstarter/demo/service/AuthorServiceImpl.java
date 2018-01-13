package com.sda.springstarter.demo.service;

import com.sda.springstarter.demo.interfaces.AuthorService;
import com.sda.springstarter.demo.model.Author;
import com.sda.springstarter.demo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Max;
import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<Author> getAllAuthor() {
        return authorRepository.findAll();
    }

    @Override
    public void saveAuthor(Author author){
        authorRepository.save(author);
    }

}
