package com.BookStoreDemo.bookStoreDemo.repositorys;

import com.BookStoreDemo.bookStoreDemo.modelis.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepozitory extends JpaRepository<Author, Long> {
}
