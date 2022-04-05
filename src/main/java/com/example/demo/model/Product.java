package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String name;

    @Column
    private String desc;

    @Column
    private double price;
}
