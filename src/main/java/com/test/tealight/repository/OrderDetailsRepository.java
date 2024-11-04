package com.test.tealight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service; 

// Spring Data JPA Repository for OrderDetails entity
@EnableJpaRepositories
@Repository("orderDetailsRepository")
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {
	
	
}
