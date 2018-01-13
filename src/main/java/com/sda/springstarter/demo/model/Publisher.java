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

    public Publisher() {
    }

    public Publisher(String address, String name) {

        this.address = address;
        this.name = name;
    }

}
