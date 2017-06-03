package com.example.bookstore;

import com.example.bookstore.model.Book;
import com.example.bookstore.repository.BookRepository;
import com.example.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class BookstoreApplication implements CommandLineRunner {

	//@Autowired
	//private final BookRepository bookRepository;
	private final BookService bookService;

//	@Value("${mymessage}") // ->resource/application.properties
//	private String message;

	@Autowired
	public BookstoreApplication(BookService bookService){

		this.bookService =bookService;
	}

	public static void main(String[] args) {

		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

//		System.out.println(message);

		bookService.addBook(new Book("tytul1", "author1", "1"));
		bookService.addBook(new Book("tytul2", "author2","2"));

//		System.out.println(bookService.getListingData());
	}
}
