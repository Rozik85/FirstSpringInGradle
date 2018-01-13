package com.sda.springstarter.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "wydawca")
public class Publisher {

    @Id
    @GeneratedValue
    private int id;

    private String address;
    private String name;

    @OneToOne (mappedBy = "book_publisher", cascade = CascadeType.ALL)
    private Book book;

    public Publisher(String address, String name, Book book) {
        this.address = address;
        this.name = name;
        this.book = book;
    }

    public Publisher() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
