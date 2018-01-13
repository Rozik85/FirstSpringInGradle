package com.sda.springstarter.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "autor")
public class Author {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String lastname;
    private String address;


    @OneToMany(mappedBy = "bookAuthor", cascade = CascadeType.ALL)
    private Set<Book> books;

    public Author() {
    }

    public Author(String address, String lastname, String name, Set<Book> books) {
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.books = books;
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
