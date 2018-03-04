package com.BookStoreDemo.bookStoreDemo.modelis;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // sukurtsim nauja kategorija vienas su vienu

    @OneToOne(cascade = {CascadeType.ALL})
    private Category category;


    private String title;
    private String years;
    private String isbn;
    private double price;
    private String bookSummary;
    private int count;
    @ManyToMany
    @JoinTable(name="author_books", joinColumns = @JoinColumn(name="book_id"),inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors = new HashSet<>();

    public Book() {
    }

    public Book(Category category, String title, String isbn, double price, int count) {
        this.category = category;
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.count = count;
    }

    public Book(Category category, String title, String isbn, double price, int count, Set<Author> authors) {
        this.category = category;
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.count = count;
        this.authors = authors;
    }

    public Book(Category category, String title, String years, String isbn, double price, String bookSummary, int count, Set<Author> authors) {
        this.category = category;
        this.title = title;
        this.years = years;
        this.isbn = isbn;
        this.price = price;
        this.bookSummary = bookSummary;
        this.count = count;
        this.authors = authors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBookSummary() {
        return bookSummary;
    }

    public void setBookSummary(String bookSummary) {
        this.bookSummary = bookSummary;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}

