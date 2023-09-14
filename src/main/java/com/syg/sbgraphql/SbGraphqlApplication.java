package com.syg.sbgraphql;

import com.syg.sbgraphql.entity.Book;
import com.syg.sbgraphql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbGraphqlApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(SbGraphqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book b = new Book();
		b.setAuthor("AuthorA");
		b.setTitle("TitleA");
		b.setPrice(100);
		b.setDescription("DescA");
		b.setPages(20);

		Book b1 = new Book();
		b1.setAuthor("AuthorB");
		b1.setTitle("TitleB");
		b1.setPrice(200);
		b1.setDescription("DescB");
		b1.setPages(40);

		Book b2 = new Book();
		b2.setAuthor("AuthorB");
		b2.setTitle("TitleB");
		b2.setPrice(300);
		b2.setDescription("DescB");
		b2.setPages(30);

		Book b3 = new Book();
		b3.setAuthor("AuthorC");
		b3.setTitle("TitleC");
		b3.setPrice(400);
		b3.setDescription("DescC");
		b3.setPages(40);

		Book b4 = new Book();
		b4.setAuthor("AuthorD");
		b4.setTitle("TitleD");
		b4.setPrice(500);
		b4.setDescription("DescD");
		b4.setPages(50);

		bookService.createBook(b);
		bookService.createBook(b1);
		bookService.createBook(b2);
		bookService.createBook(b3);
		bookService.createBook(b4);
	}
}
