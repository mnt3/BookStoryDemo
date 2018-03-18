package com.BookStoreDemo.bookStoreDemo.repositorys;

import com.BookStoreDemo.bookStoreDemo.modelis.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepozitory extends JpaRepository<Category,Long> {

}
