package com.shwet.stockservice.repository;

import com.shwet.stockservice.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
    // Custom query methods can be added if needed
}
