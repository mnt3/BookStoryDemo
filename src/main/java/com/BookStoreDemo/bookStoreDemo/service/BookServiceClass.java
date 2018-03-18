package com.BookStoreDemo.bookStoreDemo.service;

import com.BookStoreDemo.bookStoreDemo.modelis.Book;
import com.BookStoreDemo.bookStoreDemo.repositorys.BookRepozitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceClass implements BookService {

    @Autowired
    private BookRepozitory bookRepozitory;

    public BookServiceClass(BookRepozitory bookRepozitory) {
        this.bookRepozitory = bookRepozitory;
    }

    public BookRepozitory getBookRepozitory() {
        return bookRepozitory;
    }

    public void setBookRepozitory(BookRepozitory bookRepozitory) {
        this.bookRepozitory = bookRepozitory;
    }

    @Override
    @Transactional
    public List<Book> getBooks() {
        return bookRepozitory.findAll();
    }

    @Override
    @Transactional
    public void createBook(Book book) {
        Book newBook = bookRepozitory.save(book);

    }

    @Override
    @Transactional
    public void deleteBook(Long id) {
        bookRepozitory.deleteById(id);

    }

    @Override
    @Transactional
    public void updateBook(Book book, Long id) {

      Book  oldBook = bookRepozitory.findById(id).get();
      oldBook.setBookSummary(book.getBookSummary());
      oldBook.setIsbn(book.getIsbn());
    }

    @Override
    @Transactional
    public void updateBookCount(Long id, int count) {
        bookRepozitory.findById(id).get().setCount(count);
    }

}
