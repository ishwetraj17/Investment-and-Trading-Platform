package com.shwet.stockservice.service;

import com.shwet.stockservice.model.Stock;
import com.shwet.stockservice.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {
    @Autowired
    private StockRepository stockRepository;

    public Stock createStock(Stock stock) {
        return stockRepository.save(stock);
    }

    public Stock getStock(Long stockId) {
        return stockRepository.findById(stockId).orElse(null);
    }

    public void updateStockQuantity(Long stockId, Integer quantity) {
        Stock stock = stockRepository.findById(stockId).orElse(null);
        if (stock != null) {
            stock.setQuantityAvailable(stock.getQuantityAvailable() - quantity);
            stockRepository.save(stock);
        }
    }

    // Additional methods for updating stock prices
}
