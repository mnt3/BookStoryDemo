package com.BookStoreDemo.bookStoreDemo.repositorys;

import com.BookStoreDemo.bookStoreDemo.modelis.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepozitory extends CrudRepository<Author, Long> {
}
