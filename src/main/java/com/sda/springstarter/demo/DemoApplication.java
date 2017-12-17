package com.sda.springstarter.demo;

import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private BookServiceImpl bookService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Book book1 = new Book("Tutuł1", "Autor");
		Book book2 = new Book("Tutuł2", "Autor2");

//		Book book1 = Book.builder().title("Tytuł").author("Autor").build();
//		Book book2 = Book.builder().title("Tytuł2").author("Autor2").build();

		bookService.saveBook(book1);
		bookService.saveBook(book2);
	}
}
