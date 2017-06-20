package com.ipcount.core.service;

import com.ipcount.core.dto.ClientDTO;
import com.ipcount.core.entity.ClientEntity;
import com.ipcount.core.exception.EntityNotFoundException;
import com.ipcount.core.repository.ClientRepository;
import com.ipcount.core.util.ClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.ipcount.core.util.ClientUtil.clientDTOUpdate;
import static com.ipcount.core.util.ClientUtil.toDTO;


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
        clients.forEach((client) -> {
            list.add(toDTO(client));
        });

        return list;
    }

    public List<ClientDTO> findByName(String name) {
        List<ClientEntity> clients = clientRepository.findByName(name);
        List<ClientDTO> list = new ArrayList();
        clients.forEach((client) -> {
            list.add(toDTO(client));
        });
        return list;
    }

    public List<ClientDTO> findById(int id) {
        ClientEntity clients = clientRepository.findOne(id);
        List<ClientDTO> list = new ArrayList<>();
        list.add(toDTO(clients));

        return list;
    }

    public ClientDTO save(ClientEntity clientEntity) {
        ClientEntity client = clientRepository.save(clientEntity);
        ClientDTO clientDTO;
        ClientUtil clientUtil = new ClientUtil();
        clientDTO = clientUtil.toDTO(client);

        return clientDTO;
    }

    public void deleteClient(int id) {
        clientRepository.delete(id);
    }

    public ClientDTO update(ClientDTO clientDTO) throws EntityNotFoundException {
        ClientEntity dbEntity = clientRepository.findOne(clientDTO.getId());
        if (dbEntity == null) {
            throw new EntityNotFoundException("Can't update non-existent user.");
        } else {

            ClientUtil.clientDTOUpdate( dbEntity, clientDTO);
        }
        ClientEntity client = clientRepository.save(dbEntity);
        return ClientUtil.toDTO(client);


    }

}
