package com.example.demo.reference_Data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ClientConfig {
    @Bean
    CommandLineRunner commandLineRunnerOne(ClientRepository repository) {
        return args -> {
            List<Client> clients = RandomNameGenerator.getRandomClients();
            repository.saveAll(clients);
        };
    }
}

