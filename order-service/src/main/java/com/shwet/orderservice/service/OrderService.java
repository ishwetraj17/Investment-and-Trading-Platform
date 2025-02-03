package com.shwet.orderservice.service;

import com.shwet.orderservice.model.Order;
import com.shwet.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    // Method to create an order
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    // Method to get an order by its ID
    public Order getOrder(Long orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    // Method to update an existing order status
    public Order updateOrderStatus(Long orderId, String status) {
        Order order = orderRepository.findById(orderId).orElse(null);
        if (order != null) {
            order.setStatus(status);
            return orderRepository.save(order);
        }
        return null;
    }
}
