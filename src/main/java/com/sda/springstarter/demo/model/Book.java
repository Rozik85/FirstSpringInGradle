package com.sda.springstarter.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "ksiazki")
public class Book {


    @Id
    @GeneratedValue
    private int id;

    private String title;
    private String author;

    @ManyToOne
    private Author bookAuthor;

    @ManyToOne
    private BookCategory bookCategory;

    @OneToMany
    @JoinColumn(name = "book_publisher_id")
    private Publisher publisher;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public Book() {
    }
}
