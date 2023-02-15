package com.example.demo.reference_Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//SERVICE LAYER
@Service
public class ClientService {

    private final ClientRepository clientRepository;
    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    public void checkValidClient(Client client) {
        Optional <Client> clientOptional = clientRepository.findClientByName(client.getName());
        if (!clientOptional.isPresent()){
            throw new IllegalStateException("Client Invalid");
        }
        clientRepository.save(client);
    }
}
