package com.library.business;

import com.library.model.Book;
import java.util.ArrayList;
import java.util.List;

public class BookService {

    // books variable of type list with generic type of book only
    private List<Book> books;

    //constructor
    public BookService() {
        books = new ArrayList<>();
    }

    //get all the books in the list
    public List<Book> getAllBooks() {
        return books;
    }

    // Get a book by ISBN


}
