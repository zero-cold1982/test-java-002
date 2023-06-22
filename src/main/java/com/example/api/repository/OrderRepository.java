package com.example.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api.model.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer> {
    // Additional custom query methods can be defined here if needed
}
