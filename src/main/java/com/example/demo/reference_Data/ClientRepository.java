package com.example.demo.reference_Data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//DATA ACCESS LAYER
@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
    Optional<Client> findClientByName(String name);
    Client findClientByID(int id);
}
