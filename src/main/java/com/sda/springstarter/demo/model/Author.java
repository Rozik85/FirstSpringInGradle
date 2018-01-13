package com.sda.springstarter.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "autor")
public class Author {

    @Id
    @GeneratedValue
    private int id;

    private String address;
    private String lastname;
    private String name;

    @OneToMany(mappedBy = "bookAuthor", cascade = CascadeType.ALL)
    private Set<Book>books;


    public Author() {
    }

    public Author(String address, String lastname, String name) {

        this.address = address;
        this.lastname = lastname;
        this.name = name;
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}