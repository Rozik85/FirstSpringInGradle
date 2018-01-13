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

    public BookCategory() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
