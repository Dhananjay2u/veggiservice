package com.test.tealight.tealightservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.test.tealight.repository.OrderDetails;
import com.test.tealight.repository.OrderDetailsRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class OrderDetailsService {
    @Autowired
    @Qualifier("orderDetailsRepository")
    private OrderDetailsRepository orderDetailsRepository;

    // Create
    public OrderDetails createOrderDetails(OrderDetails orderDetails) {
    	if(Objects.isNull(orderDetails.getOrderDate())) {
    		orderDetails.setOrderDate(LocalDate.now());
    	}
        return orderDetailsRepository.save(orderDetails);
    }

    // Read
    public List<OrderDetails> getAllOrderDetails() {
		
           return orderDetailsRepository.findAll();

    }

    public Optional<OrderDetails> getOrderDetailsById(Integer id) {
        return orderDetailsRepository.findById(id);
    }

    // Update
    public OrderDetails updateOrderDetails(Integer id, OrderDetails orderDetailsDetails) {
        OrderDetails orderDetails = orderDetailsRepository.findById(id).orElseThrow();
        orderDetails.setName(orderDetailsDetails.getName());
        orderDetails.setQuantityInGrams(orderDetailsDetails.getQuantityInGrams());
        orderDetails.setPricePerKg(orderDetailsDetails.getPricePerKg());
        if(Objects.isNull(orderDetails.getOrderDate())) {
    		orderDetails.setOrderDate(LocalDate.now());
    	}
        orderDetails.setOrderDate(orderDetailsDetails.getOrderDate());
        return orderDetailsRepository.save(orderDetails);
    }

    // Delete
    public void deleteOrderDetails(Integer id) {
    	orderDetailsRepository.deleteById(id);
    }
}
