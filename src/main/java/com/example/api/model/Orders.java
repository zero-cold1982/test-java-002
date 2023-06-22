package com.example.api.model;

import java.math.BigDecimal;

import javax.persistence.*;

@Entity
@Table(name = "Orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "CustomerId")
    private int CustomerId;

    @Column(name = "Amount")
    private BigDecimal Amount;

    // Constructors, getters, and setters
}
