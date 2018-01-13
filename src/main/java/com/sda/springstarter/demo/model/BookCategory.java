package com.sda.springstarter.demo.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table (name = "kategoria")
public class BookCategory {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToMany(mappedBy = "bookCategory", cascade = CascadeType.ALL)
    private Set<Book> books;

    public BookCategory(String name) {
        this.name = name;
    }

    public BookCategory(String name, Set<Book> books) {
        this.name = name;
        this.books = books;
    }

    public BookCategory() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
