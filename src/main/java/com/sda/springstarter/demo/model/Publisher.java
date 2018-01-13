package com.sda.springstarter.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wydawca")
public class Publisher {

    @Id
    @GeneratedValue
    private int id;

    private String address;
    private String name;

    public Publisher() {
    }

    public Publisher(String address, String name) {

        this.address = address;
        this.name = name;
    }

}
