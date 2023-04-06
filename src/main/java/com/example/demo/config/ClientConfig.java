package com.example.demo.config;

import com.example.demo.config.generator.RandomClientGenerator;
import com.example.demo.model.Client;
import com.example.demo.repo.ClientRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("init_client")
public class ClientConfig {
    @Bean //human added
    CommandLineRunner commandLineRunnerTwo(ClientRepo repository) {
        return args -> {
            List<Client> tickers = RandomClientGenerator.getRandomClients();
            repository.saveAll(tickers);
        };
    }
}
