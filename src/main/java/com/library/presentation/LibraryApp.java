package com.library.presentation;

import com.library.model.Book;

public class LibraryApp {
    public static void main(String[] args) {
        // Create a new Book object
        Book book1 = new Book("Java Programming", "John Doe", 29.99, "1234567890", 2023);

        // Output the book details
        System.out.println("Book Details: " + book1.getTitle() + ", " + book1.getAuthor() + ", " + book1.getISBN());
    }
}
