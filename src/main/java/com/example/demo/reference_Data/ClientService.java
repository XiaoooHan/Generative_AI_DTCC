package com.example.demo.reference_Data;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientService {
    public List<Client> getClients() {
        return List.of(
                new Client(1, "JPMO"),
                new Client(2, "GOLD"),
                new Client(3, "AAPL")
        );
    }
}
