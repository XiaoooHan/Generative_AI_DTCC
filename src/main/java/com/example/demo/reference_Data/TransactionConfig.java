package com.example.demo.reference_Data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;
@Configuration
public class TransactionConfig {
    @Bean
    CommandLineRunner commandLineRunner(ClientRepository repository) {
        return args -> {
            List<Transaction> transactions = RandomTransactionGenerator.getRandomClients();
            repository.saveAll(transactions);
        };
    }
}
