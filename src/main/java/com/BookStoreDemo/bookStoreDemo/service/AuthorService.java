package com.BookStoreDemo.bookStoreDemo.service;

import com.BookStoreDemo.bookStoreDemo.modelis.Author;

import java.util.List;

public interface AuthorService {
    List<Author> getAuthor();
    void createAuthor(Author author);
    void deleteAuthor(Long id);
    void updateAuthor(Author author, Long id);

}
