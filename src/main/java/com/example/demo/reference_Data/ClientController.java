package com.example.demo.reference_Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// API LAYER
@RestController
@RequestMapping(path = "api/client")
public class ClientController {
    private final ClientService clientService;
    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    //GET REQUEST
    @GetMapping()
    public List<Client> hello(){
        return clientService.getClients();
    }


}




