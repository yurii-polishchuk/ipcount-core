package com.ipcount.core.controller;

import com.ipcount.core.dto.ClientDTO;
import com.ipcount.core.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("clients")
    public List<ClientDTO> clients() {

        return clientService.findAllClients();
    }
}

