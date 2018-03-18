package com.BookStoreDemo.bookStoreDemo.service;

import com.BookStoreDemo.bookStoreDemo.modelis.Book;

import java.util.List;

public interface BookService {
    List<Book> getBooks();
    void createBook(Book book);
    void deleteBook(Long id);
    void updateBook(Book book, Long id);
    void updateBookCount(Long id, int count);
}
