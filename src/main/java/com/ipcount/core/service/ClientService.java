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
        for (ClientEntity clientEntity : clients) {
            ClientDTO clientDTO = ClientUtil.toDTO(clientEntity);
            list.add(clientDTO);
        }
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
        ClientEntity newClients = clientRepository.findOne(id);
        List<ClientDTO> list1 = new ArrayList<>();
        list1.add(ClientUtil.toDTO(newClients));

        return list1;
    }

    public ClientEntity save(ClientEntity clientEntity) {
        return clientRepository.save(clientEntity);
    }

    public void deleteClient(int id) {
        clientRepository.delete(Integer.valueOf(id));
    }

    public ClientEntity update(ClientDTO clientDTO) {
        ClientEntity dbEntity = clientRepository.findOne(clientDTO.getId());
        if (dbEntity == null) {
            System.out.println("This id= " + clientDTO.getId() + " is not correct");
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
