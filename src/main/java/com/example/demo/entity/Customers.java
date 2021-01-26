package com.example.demo.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String surname;
    private int age;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "customer", fetch=FetchType.EAGER)
    private Collection<Orders> ordersList;
}
