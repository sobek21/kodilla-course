package com.kodilla.hibernate.invoice;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCTS")
public class Product {

    private int id;
    private String name;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }


    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "Id", unique = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "Product")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
