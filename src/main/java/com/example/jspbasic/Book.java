package com.example.jspbasic;

import java.time.LocalDate;
import java.util.Date;

public class Book {
    private Long no;
    private String name;
    private String author;
    private LocalDate publishedDate;

    public Long getno() {
        return no;
    }

    public void setno(Long no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    public Book(Long no, String name, String author, LocalDate publishedDate) {
        this.no = no;
        this.name = name;
        this.author = author;
        this.publishedDate = publishedDate;


    }
}


