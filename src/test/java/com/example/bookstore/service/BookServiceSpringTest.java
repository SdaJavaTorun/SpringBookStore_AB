package com.example.bookstore.service;

import com.example.bookstore.model.Book;
import com.example.bookstore.model.BookListing;
import com.example.bookstore.repository.BookRepository;
import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by Andrzej on 31.05.2017.
 */

@RunWith(SpringRunner.class)
@SpringBootTest

public class BookServiceSpringTest {

//    @Autowired
//    BookRepository bookRepository;
//    @Autowired
//    BookService bookService;
//
//    @Before
//    public void setUp() {
//        //bookRepository.deletAll();
//        bookRepository.save(new Book("title-test1", "author-test1"));
//        bookRepository.save(new Book("title-test2", "author-test2"));
//    }
//
//    @Test
//    public void getListingData() throws Exception {
//        //given
//
//        //when
//        BookListing bookListing = bookService.getListingData();
//
//        //then
//        assertEquals(new BookListing(Lists.newArrayList(
//                new Book("title-test1", "author-test1"),
//                new Book("title-test2", "author-test2")),
//                        2),
//                bookListing);
//
//    }
}