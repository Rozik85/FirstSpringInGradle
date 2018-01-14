package com.sda.springstarter.demo.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ksiazki")
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull
    @Size(min = 2, max = 60)
    private String title;
    @NotNull
    @ManyToOne
    private Author bookAuthor;
    @NotNull
    @ManyToOne
    private BookCategory bookCategory;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "book_publisher_id")
    private Publisher book_publisher;

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


    public Author getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(Author bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    public Publisher getBook_publisher() {
        return book_publisher;
    }

    public void setBook_publisher(Publisher book_publisher) {
        this.book_publisher = book_publisher;
    }
}
