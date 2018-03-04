package com.BookStoreDemo.bookStoreDemo.DevBootstrap;

import com.BookStoreDemo.bookStoreDemo.modelis.Author;
import com.BookStoreDemo.bookStoreDemo.modelis.Book;
import com.BookStoreDemo.bookStoreDemo.modelis.Category;
import com.BookStoreDemo.bookStoreDemo.repositorys.AuthorRepozitory;
import com.BookStoreDemo.bookStoreDemo.repositorys.BookRepozitory;
import com.BookStoreDemo.bookStoreDemo.repositorys.CategoryRepozitory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstarp implements ApplicationListener<ContextRefreshedEvent>{

    private AuthorRepozitory authorRepozitory;
    private BookRepozitory bookRepozitory;
    private CategoryRepozitory categoryRepozitory;


    public DevBootstarp(AuthorRepozitory authorRepozitory, BookRepozitory bookRepozitory, CategoryRepozitory categoryRepozitory) {
        this.authorRepozitory = authorRepozitory;
        this.bookRepozitory = bookRepozitory;
        this.categoryRepozitory = categoryRepozitory;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        //Autoriai sukurti
        Author mantas= new Author("Mantas","Pauliukonis");
        Author aurimas = new Author("Aurimas","Cicinskas");

        // kategorija sukurta
         Category categorys= new Category();
        Category categorys2= new Category();
        categorys.setCategoryStyle("Romanas");
        categorys.setCategoryAge("Suaugusiems");
        categorys2.setCategoryStyle("Pasaka");
        categorys2.setCategoryAge("Vaikams");

        // sukurtos knygos
        Book knyga1 = new Book(categorys,"Mantas pries WW2","12345",20.45,2);
        Book knyga2 = new Book(categorys2,"Pagalba","123456",15.6,10);

        // knygos pridetos i autoriu seta, autoriai i knygos seta;
        mantas.getBooks().add(knyga1);
        aurimas.getBooks().add(knyga1);
        aurimas.getBooks().add(knyga2);

        knyga1.getAuthors().add(mantas);
        knyga1.getAuthors().add(aurimas);
        knyga2.getAuthors().add(aurimas);

        //saugom tiek knygas tiek autorius i implementuotas repozitorijas
        authorRepozitory.save(mantas);
        authorRepozitory.save(aurimas);

        bookRepozitory.save(knyga1);
        bookRepozitory.save(knyga2);

        categoryRepozitory.save(categorys);
        categoryRepozitory.save(categorys2);



    }
}
