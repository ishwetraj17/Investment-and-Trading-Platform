package com.shwet.transactionservice.repository;

import com.shwet.transactionservice.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    // Custom query methods can be added if needed
}
