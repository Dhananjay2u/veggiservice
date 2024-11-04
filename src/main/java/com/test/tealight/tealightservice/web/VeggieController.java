package com.test.tealight.tealightservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.tealight.repository.OrderDetails;
import com.test.tealight.tealightservice.OrderDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orderdetails")
public class VeggieController {
    @Autowired
    private OrderDetailsService service;

    // Create
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public OrderDetails createOrderDetails(@RequestBody OrderDetails orderDetails) {
        return service.createOrderDetails(orderDetails);
    }

    // Read
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public List<OrderDetails> getAllOrderDetails() {
        return service.getAllOrderDetails();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/{id}")
    public ResponseEntity<OrderDetails> getOrderDetailsById(@PathVariable("id") Integer id) {
        OrderDetails orderDetails = service.getOrderDetailsById(id).orElseThrow();
        return ResponseEntity.ok(orderDetails);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    // Update
    @PutMapping("/{id}")
    public ResponseEntity<OrderDetails> updateOrderDetails(@PathVariable("id") Integer id, @RequestBody OrderDetails orderDetails) {
        OrderDetails updatedOrderDetails = service.updateOrderDetails(id, orderDetails);
        return ResponseEntity.ok(updatedOrderDetails);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrderDetails(@PathVariable("id") Integer id) {
        service.deleteOrderDetails(id);
        return ResponseEntity.noContent().build();
    }
}

