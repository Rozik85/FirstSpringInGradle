package com.sda.springstarter.demo.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Opinions {
@Id
@GeneratedValue
private int id;
private String nick;
private String comment;
private int idBook;

    public Opinions(String nick, String comment, int idBook) {
        this.nick = nick;
        this.comment = comment;
        this.idBook = idBook;
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

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }
}
