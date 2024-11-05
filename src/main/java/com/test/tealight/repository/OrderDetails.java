package com.test.tealight.repository;
import jakarta.persistence.*;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity(name = "order_details")
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private Integer quantityInGrams;
    private Integer pricePerKg;
    private LocalDate orderDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQuantityInGrams() {
		return quantityInGrams;
	}
	public void setQuantityInGrams(Integer quantityInGrams) {
		this.quantityInGrams = quantityInGrams;
	}
	public Integer getPricePerKg() {
		return pricePerKg;
	}
	public void setPricePerKg(Integer pricePerKg) {
		this.pricePerKg = pricePerKg;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", name=" + name + ", quantityInGrams=" + quantityInGrams + ", pricePerKg="
				+ pricePerKg + ", orderDate=" + orderDate + "]";
	}
	
	
    // Getters and Setters
    
}
