package com.BookStoreDemo.bookStoreDemo.repositorys;

import com.BookStoreDemo.bookStoreDemo.modelis.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepozitory extends CrudRepository<Book, Long> {
}
