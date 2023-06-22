package com.example.api.model;

import javax.persistence.*;

@Entity
@Table(name = "Customers")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Country")
    private String Country;

    // Constructors, getters, and setters
}
