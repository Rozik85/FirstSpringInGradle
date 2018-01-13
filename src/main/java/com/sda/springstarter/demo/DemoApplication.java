package com.sda.springstarter.demo;

import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.model.Opinions;
import com.sda.springstarter.demo.model.Shops;
import com.sda.springstarter.demo.service.BookServiceImpl;
import com.sda.springstarter.demo.service.OpinionsServiceImpl;
import com.sda.springstarter.demo.service.ShopsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private BookServiceImpl bookService;
	@Autowired
	private ShopsServiceImpl shopsService;
	@Autowired
	private OpinionsServiceImpl opinionsService;

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

		Shops shops1 = new Shops("Shop1","ulica1", "city1");
		shopsService.saveShops(shops1);

		Opinions opinions1 = new Opinions("Nick1", "komentarz1", book1);
		opinionsService.saveOpinions(opinions1);
		Opinions opinions2 = new Opinions("nick1", "działa", book2);
		opinionsService.saveOpinions(opinions2);
		Opinions opinions3 = new Opinions("Nick1", "czy działą",book1);
		opinionsService.saveOpinions(opinions3);
	}
}
