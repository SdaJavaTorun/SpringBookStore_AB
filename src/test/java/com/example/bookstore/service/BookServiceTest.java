package com.example.bookstore.service;

import com.example.bookstore.model.Book;
import com.example.bookstore.model.BookListing;
import com.example.bookstore.repository.BookRepository;
import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Andrzej on 31.05.2017.
 */
public class BookServiceTest {

    BookRepository bookRepository;
    BookService bookService;

    @Before
    public void setUp() {
        bookRepository = mock(BookRepository.class);
        bookService = new BookService(bookRepository);
    }

    @Test
    public void getListingData() throws Exception {
        // given
        when(bookRepository.findAll()).thenReturn(
                Lists.newArrayList(
                        new Book("title-test1", "author-test1", 1),
                        new Book("title-test1", "author-test1", 1)
                )
        );
        // when
        BookListing bookListing = bookService.getListingData();
        // then
        assertEquals(new BookListing(Lists.newArrayList(
                new Book("title-test1", "author-test1", 1),
                new Book("title-test1", "author-test1", 1)),
                        2),
                bookListing);
    }
}

