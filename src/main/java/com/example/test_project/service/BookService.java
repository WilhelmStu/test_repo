package com.example.test_project.service;

import com.example.test_project.Book;

import java.util.HashSet;


public interface BookService {
    HashSet<Book> findAllBook();
    Book findBookByID(long id);
    void addBook(Book b);
    void deleteAllData();
}
