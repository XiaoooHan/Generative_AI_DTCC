package com.example.demo.config;

import com.example.demo.config.generator.RandomTransactionGenerator;
import com.example.demo.model.Transaction;
import com.example.demo.repo.TransactionRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("init_transaction")
public class TransactionConfig {
    @Bean
    CommandLineRunner commandLineRunnerTwo(TransactionRepo repository) {
        return args -> {
            List<Transaction> transactions = RandomTransactionGenerator.getRandomTransactions();
            repository.saveAll(transactions);
        };
    }
}
