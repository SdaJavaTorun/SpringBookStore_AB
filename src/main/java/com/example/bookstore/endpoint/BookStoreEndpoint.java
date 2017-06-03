package com.example.bookstore.endpoint;

import com.example.bookstore.model.BookDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Andrzej on 03.06.2017.
 */

    @RestController
    @RequestMapping("/api/books")
    public class BookStoreEndpoint {

        @GetMapping()
        public String hello(){
            return "Hello from BookStoreEndpoint";
        }

        @GetMapping("/booksget")
        public BookDto getBook() {
            return new BookDto("naame", "aaauthor");
        }
    }

