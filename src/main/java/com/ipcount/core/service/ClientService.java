package com.ipcount.core.service;

import com.ipcount.core.dto.ClientDTO;
import com.ipcount.core.entity.ClientEntity;
import com.ipcount.core.repository.ClientRepository;
import com.ipcount.core.util.ClientUtil;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

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
            list.add(ClientUtil.toDTO(client));
        });

        return list;
    }

    public List<ClientDTO> findByName(String name) {
        List<ClientEntity> clients = clientRepository.findByName(name);
        List<ClientDTO> list = new ArrayList();
        clients.forEach((client) -> {
            list.add(ClientUtil.toDTO(client));
        });
        return list;
    }

    public List<ClientDTO> findById(int id) {
        ClientEntity clients = clientRepository.findOne(id);
        List<ClientDTO> list = new ArrayList<>();
        list.add(ClientUtil.toDTO(clients));

        return list ;
    }

    public List<ClientDTO> save(ClientEntity clientEntity) {
        ClientEntity clients = clientRepository.save(clientEntity);
        List<ClientDTO> list = new ArrayList<>();
        list.add(ClientUtil.toDTO(clients));

        return list ;
    }

    public void deleteClient(int id) {
        clientRepository.delete(id);
    }

    public List<ClientDTO> update(ClientDTO clientDTO) throws NotFoundException {
        ClientEntity dbEntity = clientRepository.findOne(clientDTO.getId());
        if (dbEntity == null) {
            throw new NotFoundException("Can't update non-existent user.") ;
        } else {

            dbEntity.setStatusP(clientDTO.getStatusP());
            dbEntity.settPlane(clientDTO.gettPlane());
            dbEntity.setSpeedIn(clientDTO.getSpeedIn());
            dbEntity.setSpeedOut(clientDTO.getSpeedOut());
            dbEntity.setIpAddress(clientDTO.getIpAddress());
            dbEntity.setName(clientDTO.getName());
            dbEntity.setPhone(clientDTO.getPhone());
            dbEntity.setStreetName(clientDTO.getStreetName());
            dbEntity.setHouseNumber(clientDTO.getHouseNumber());
            dbEntity.setFlatNumber(clientDTO.getFlatNumber());
            dbEntity.setMail(clientDTO.getMail());
            dbEntity.setPassword(clientDTO.getPassword());
            dbEntity.setSms(clientDTO.getSms());
            dbEntity.setGroupC(clientDTO.getGroupC());
            dbEntity.setSpeedLoc(clientDTO.getSpeedLoc());
            dbEntity.setTools(clientDTO.getTools());
        }
        return save(dbEntity);


    }

}
