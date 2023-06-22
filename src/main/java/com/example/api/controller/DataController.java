package com.example.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.model.Customers;
import com.example.api.model.Orders;
import com.example.api.repository.CustomerRepository;
import com.example.api.repository.OrderRepository;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class DataController {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/customers")
    public ResponseEntity<List<Customers>> getAllCustomers() {
        List<Customers> customers = customerRepository.findAll();
        return ResponseEntity.ok(customers);
    }

    @GetMapping("/orders")
    public ResponseEntity<List<Orders>> getAllOrders() {
        List<Orders> orders = orderRepository.findAll();
        return ResponseEntity.ok(orders);
    }
}
