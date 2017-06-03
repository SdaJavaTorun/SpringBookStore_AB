package com.example.bookstore.model;

/**
 * Created by Andrzej on 01.06.2017.
 */
public class BookDto { //klasa, poprzez ktora przekazujemy dane  //DTO Data Transfer Object

    private String titleFromDto;
    private String author;
    private String id;

    public BookDto(String titleFromDto, String author) {
        this.titleFromDto = titleFromDto;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

      public String getTitleFromDto() {
        return titleFromDto;
    }

    public void setTitleFromDto(String titleFromDto) {
        this.titleFromDto = titleFromDto;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book fromDto() {
        return new Book(titleFromDto, author, id);
    }
}
