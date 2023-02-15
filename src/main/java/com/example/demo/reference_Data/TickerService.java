package com.example.demo.reference_Data;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TickerService {
    private TickerRepository tickerRepository;
    @Autowired
    public TickerService(TickerRepository tickerRepository) {
        this.tickerRepository = tickerRepository;
    }
    public List<Ticker> getTickers() {
        return tickerRepository.findAll();
    }
}
