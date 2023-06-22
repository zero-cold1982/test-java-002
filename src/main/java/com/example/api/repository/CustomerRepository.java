package com.example.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api.model.Customers;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Integer> {
    // Additional custom query methods can be defined here if needed
}
