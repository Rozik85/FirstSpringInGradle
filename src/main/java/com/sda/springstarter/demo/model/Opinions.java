package com.sda.springstarter.demo.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "opinie")
public class Opinions {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    @Size(min=2, max=30)
    private String nick;
    @NotNull
    @Max(500)
    private String comment;
    @ManyToOne
    private Book book;

    public Opinions(String nick, String comment, Book book) {
        this.nick = nick;
        this.comment = comment;
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
