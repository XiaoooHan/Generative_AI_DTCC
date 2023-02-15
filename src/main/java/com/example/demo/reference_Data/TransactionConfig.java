package com.example.demo.reference_Data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;
@Configuration
public class TransactionConfig {
    @Bean
    CommandLineRunner commandLineRunnerThree(TransactionRepository repository) {
        return args -> {
            List<Transaction> transactions = RandomTransactionGenerator.getRandomTransactions();
            repository.saveAll(transactions);
        };
    }
}
