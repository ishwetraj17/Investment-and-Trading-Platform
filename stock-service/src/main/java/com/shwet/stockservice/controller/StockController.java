package com.shwet.stockservice.controller;

import com.shwet.stockservice.model.Stock;
import com.shwet.stockservice.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stocks")
public class StockController {

    @Autowired
    private StockService stockService;

    @PostMapping
    public Stock createStock(@RequestBody Stock stock) {
        return stockService.createStock(stock);
    }

    @GetMapping("/{stockId}")
    public Stock getStock(@PathVariable Long stockId) {
        return stockService.getStock(stockId);
    }

    // Additional endpoints for updating stock prices and quantities
}
