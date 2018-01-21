package com.sda.springstarter.demo;

import com.sda.springstarter.demo.model.*;
import com.sda.springstarter.demo.repository.AuthorRepository;
import com.sda.springstarter.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private BookServiceImpl bookService;
	@Autowired
	private AuthorServiceImpl authorService;
	@Autowired
	private BookCategoryServiceImpl bookCategoryService;
	@Autowired
	private PublisherServiceImpl publisherService;
	@Autowired
	private AuthorRepository authorRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Author author = new Author();
//		author.setName("Jan");
//		author.setLastname("Kowalski");
//		author.setAddress("Pila");
//
//		authorService.saveAuthor(author);
//
//		BookCategory bookCategory = new BookCategory();
//		bookCategory.setName("Komedia");
//
//		bookCategoryService.saveBookCategory(bookCategory);
//
//		Publisher bookPublisher = new Publisher();
//		bookPublisher.setAddress("Bytow");
//		bookPublisher.setName("Helion");
//		bookPublisher.setAddress("Bydgoszcz");
//
//		publisherService.savePublisher(bookPublisher);
//
//		Book book1 = new Book();
//		book1.setTitle("Java");
//		book1.setBookAuthor(author);
//		book1.setBookCategory(bookCategory);
//		book1.setBook_publisher(bookPublisher);
//
//		bookService.saveBook(book1);

//
//		Author author1 = authorRepository.findById(1);
//		Book book2 = new Book();
//		book2.setTitle("Java od podstaw");
//		book2.setBookAuthor(author1);
//
//		bookService.saveBook(book2);


	}
}
