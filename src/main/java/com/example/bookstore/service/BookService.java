package com.example.bookstore.service;

import com.example.bookstore.model.Book;
import com.example.bookstore.model.BookListing;
import com.example.bookstore.repository.BookRepository;
import com.google.common.base.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Andrzej on 31.05.2017.
 */
@Component  //lub @Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) { //jakie mamy zaleznosci dla tej klasy. Robimy na knstrtuktorze
        this.bookRepository = bookRepository;
    }

    public BookListing getListingData(){
        List<Book> books = bookRepository.findAll();
        return new BookListing(
                books,
                books.size()
        );
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public void deleteBook(String id){bookRepository.delete(id);}



}
