package com.ipcount.core.controller;

import com.ipcount.core.dto.ClientDTO;
import com.ipcount.core.entity.ClientEntity;
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

    @GetMapping("clients")
    public List<ClientDTO> clients() {

        return clientService.findAllClients();
    }

    @GetMapping("{id}")
    @ResponseBody
    public List<ClientDTO> getId(@PathVariable("id") int id) {

        return this.clientService.findById(id);
    }

    @GetMapping("/client/{name}")
    @ResponseBody
    public List<ClientDTO> getName(@PathVariable("name") String name) {
        return clientService.findByName(name);
    }

    @PostMapping("newClient")
    public ClientEntity newClients(@RequestBody ClientEntity clientEntity) {

        return clientService.save(clientEntity);
    }


    @DeleteMapping("/deleteClient/{id}")
    public void deleteClient(@PathVariable("id") int id) {
        clientService.deleteClient(id);

    }

    @PutMapping("update")
    public ClientEntity update(@RequestBody ClientDTO clientDTO) {
        return clientService.update(clientDTO);
    }
}

