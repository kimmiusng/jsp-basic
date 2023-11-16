package com.example.jspbasic.book;

import java.time.LocalDate;

public class Book {

    Long no;
    String name;
    String author;
    LocalDate publishedDate;

    public Book(Long no, String name, String author, LocalDate publishedDate) {
        this.no = no;
        this.name = name;
        this.author = author;
        this.publishedDate = publishedDate;
    }

    public Long getNo() {
        return no;
    }

    public void setNo(Long no) {
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
}
