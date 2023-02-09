package com.example.demo.reference_Data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//DATA ACCESS LAYER
@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
