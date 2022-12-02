package com.example.test_project.service;

import java.util.HashSet;

import com.example.test_project.Book;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    HashSet<Book> bookList = new HashSet<Book>();
    @Override
    public HashSet<Book> findAllBook() {
        if (bookList.isEmpty())
            return null;
        else
            return bookList;
    }
    @Override
    public Book findBookByID(long id) {
        Book book = bookList.stream().filter(b -> b.getId() == id).findAny().orElse(null);
        return book;
    }
    @Override
    public void addBook(Book b) {
        bookList.add(b);
    }
    @Override
    public void deleteAllData() {
        bookList.clear();
    }
}
