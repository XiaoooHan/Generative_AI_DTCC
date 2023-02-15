package com.example.demo.reference_Data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class TickerConfig {
    @Bean
    CommandLineRunner commandLineRunner(TickerRepository repository) {
        return args -> {
            List<Ticker> tickers = RandomTickerGenerator.getRandomTickers();
            repository.saveAll(tickers);
        };
    }
}