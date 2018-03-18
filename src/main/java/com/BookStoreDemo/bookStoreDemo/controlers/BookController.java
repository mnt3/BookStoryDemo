package com.BookStoreDemo.bookStoreDemo.controlers;

import com.BookStoreDemo.bookStoreDemo.modelis.Book;
import com.BookStoreDemo.bookStoreDemo.repositorys.BookRepozitory;
import com.BookStoreDemo.bookStoreDemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @RequestMapping(method = RequestMethod.GET)
    List<Book> gautiVisasSaskaitas(){
        return bookService.getBooks();
    }


    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    void deleteBook(@PathVariable final Long id){
        bookService.deleteBook(id);
    }
    @RequestMapping(method = RequestMethod.POST)
    void sukurtiSaskaita(@RequestBody final Book book){
        bookService.createBook(book);
    }





}
