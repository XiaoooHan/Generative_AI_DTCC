package com.example.demo.reference_Data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>{
    Optional<Transaction> findTransactionByName(String name);
}
