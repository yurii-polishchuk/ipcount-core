package com.ipcount.core.service;

import com.ipcount.core.dto.ClientDTO;
import com.ipcount.core.entity.ClientEntity;
import com.ipcount.core.repository.ClientRepository;
import com.ipcount.core.util.ClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
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
            list.add(ClientUtil.toDTO(client));

        });
        return list;
    }
    public List<ClientDTO> findByName(String name) {
        List<ClientEntity> clients = this.clientRepository.findByName(name);
        List<ClientDTO> list = new ArrayList();
        clients.forEach((client) -> {
            list.add(ClientUtil.toDTO(client));
        });
        return list;
    }

    public ClientEntity findById(int id) {
        ClientEntity clientEntity = (ClientEntity)this.clientRepository.findOne(Integer.valueOf(id));
        return clientEntity;
    }

    public ClientEntity save(ClientEntity clientEntity) {
        return (ClientEntity)this.clientRepository.save(clientEntity);
    }

    public void deleteClient(int id) {
        this.clientRepository.delete(Integer.valueOf(id));
    }

   /* public ClientEntity update(int id, ClientEntity clientEntity) {
        this.findById(id);
        if(clientEntity != null) {
            this.save(clientEntity);
            return clientEntity;
        } else {
            throw new EntityNotFoundException("Can't update non-existent user.");
        }
    }*/
}
