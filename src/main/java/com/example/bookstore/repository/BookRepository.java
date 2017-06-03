package com.example.bookstore.repository;

import com.example.bookstore.model.Book;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Andrzej on 31.05.2017.
 */
@Component
public class BookRepository {   //w tej klasie robić będziemy podstawowe operacje

    private List<Book> books = Lists.newArrayList();
    private AtomicLong lastIndex = new AtomicLong(1);


    // guava framework, inicjalizacja listy mutowalnej

    public List<Book> findAll () {
        return books;
    }

    public void save(Book book) {
        books.add(book);
    }

    public void delete(String id){
        books.remove(id);
    }

}
