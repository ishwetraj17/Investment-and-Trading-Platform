package com.shwet.orderservice.service;

import com.shwet.orderservice.model.Order;
import com.shwet.orderservice.model.Transaction;
import com.shwet.orderservice.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionProcessor {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    private static final String TRANSACTION_QUEUE = "transactionQueue"; // Name of the RabbitMQ queue for transaction processing

    // Method to send transaction to the transaction service for processing
    public void processTransaction(Order order) {
        // Create a new transaction object based on order details
        Transaction transaction = new Transaction();
        transaction.setOrderId(order.getOrderId());
        transaction.setUserId(order.getUserId());
        transaction.setAmount(order.getTotalAmount());
        transaction.setType("debit"); // Type can be "debit" or "credit"
        transaction.setStatus("initiated");

        // Send the transaction to the RabbitMQ queue
        rabbitTemplate.convertAndSend(TRANSACTION_QUEUE, transaction);

        // Log message (optional, for debugging)
        System.out.println("Transaction for Order " + order.getOrderId() + " has been sent for processing.");
    }
}
