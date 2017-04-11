package com.ipcount.core.service;

import com.ipcount.core.dto.ClientDTO;
import com.ipcount.core.entity.ClientEntity;
import com.ipcount.core.repository.ClientRepository;
import com.ipcount.core.util.ClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<ClientDTO> findAllClients() {
        Iterable<ClientEntity> clients = clientRepository.findAll();
        List<ClientDTO> list = new ArrayList<>();
        clients.forEach(client -> {
            ClientUtil.toDTO(client);

        });
        return list;
    }
}
