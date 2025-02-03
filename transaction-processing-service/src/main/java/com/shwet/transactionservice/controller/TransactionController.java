package com.shwet.transactionservice.controller;

import com.shwet.transactionservice.model.Transaction;
import com.shwet.transactionservice.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    // Endpoint to initiate a transaction
    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionService.processTransaction(transaction);
    }

    // Endpoint to get a transaction by ID
    @GetMapping("/{transactionId}")
    public Transaction getTransaction(@PathVariable Long transactionId) {
        return transactionService.getTransaction(transactionId);
    }
}
