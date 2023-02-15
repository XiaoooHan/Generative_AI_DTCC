package com.example.demo.reference_Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/ticker")

public class TickerController {
    private final TickerService tickerService;
    @Autowired
    public TickerController(TickerService tickerService) {
        this.tickerService = tickerService;
    }

    //GET REQUEST
    @GetMapping()
    public List<Ticker> hi(){
        return tickerService.getTickers();

    }
}
