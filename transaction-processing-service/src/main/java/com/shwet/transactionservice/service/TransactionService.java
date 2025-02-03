package com.shwet.transactionservice.service;

import com.shwet.transactionservice.model.Transaction;
import com.shwet.transactionservice.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    // Method to process a transaction
    public Transaction processTransaction(Transaction transaction) {
        // Logic to process the transaction, such as checking account balance
        transaction.setStatus("completed"); // Assume transaction was successful
        return transactionRepository.save(transaction);
    }
}
