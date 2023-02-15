package com.example.demo.reference_Data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface TickerRepository extends JpaRepository<Ticker, Integer> {
    Optional<Client> findTickerByName(String name);
}
