package com.BookStoreDemo.bookStoreDemo.repositorys;

import com.BookStoreDemo.bookStoreDemo.modelis.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BookRepozitory extends JpaRepository<Book, Long> {
}
