package com.example.demo.reference_Data;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientService {
    public List<Client> getClients() {
        return List.of(
                new Client("JPMO", "JPMorgan Chase & Co."),
                new Client("GOLD", "Goldman Sachs Group, Inc."),
                new Client("AAPL", "Apple Inc")
        );
    }
}
