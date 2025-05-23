package com.library.model;

public class Book {

    private String title;
    private String author;
    private String ISBN;
    private int publishedYear;
    private double price;

    public Book(String title, String author, double price, String ISBN, int publishedYear) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.ISBN = ISBN;
        this.publishedYear = publishedYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
