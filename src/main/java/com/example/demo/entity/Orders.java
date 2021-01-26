package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String date;

    @Column(name = "product_name")
    private String productName;
    private int amount;

    @ManyToOne()
    Customers customer;
}
