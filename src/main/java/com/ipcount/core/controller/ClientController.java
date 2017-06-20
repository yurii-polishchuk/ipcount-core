package com.ipcount.core.controller;

import com.ipcount.core.dto.ClientDTO;
import com.ipcount.core.entity.ClientEntity;
import com.ipcount.core.exception.EntityNotFoundException;
import com.ipcount.core.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/clients")
    public List<ClientDTO> clients() {

        return clientService.findAllClients();
    }

    @GetMapping("/clients/{id}")
    @ResponseBody
    public List<ClientDTO> getById(@PathVariable("id") int id) {

        return clientService.findById(id);
    }

    @GetMapping("/clients/{name}")
    @ResponseBody
    public List<ClientDTO> getByName(@PathVariable("name") String name) {
        return clientService.findByName(name);
    }

    @PostMapping("/client")
    public ClientDTO saveClient(@RequestBody ClientEntity clientEntity) {

        return clientService.save(clientEntity);
    }


    @DeleteMapping("/clients/{id}")
    public void deleteClient(@PathVariable("id") int id) {
        clientService.deleteClient(id);

    }

    @PutMapping("/client")
    public ClientDTO updateClient(@RequestBody ClientDTO clientDTO) throws EntityNotFoundException {
        return clientService.update(clientDTO);
    }
}

