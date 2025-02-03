package com.shwet.orderservice.repository;

import com.shwet.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // Custom query methods can be added if needed
}
