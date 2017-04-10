package com.ipcount.core.service;

import com.ipcount.core.dto.ClientDTO;
import com.ipcount.core.entity.ClientEntity;
import com.ipcount.core.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    private ClientRepository clientRepository;
    @Autowired
    public ClientService(ClientRepository clientRepository){
        this.clientRepository=clientRepository;
    }

    public List<ClientDTO> findAllClients() {
        Iterable<ClientEntity> clients = clientRepository.findAll();
        List<ClientDTO> list = new ArrayList<>();
        clients.forEach(client -> {
            ClientDTO clientDTO = new ClientDTO();
            clientDTO.setId(client.getId());
            clientDTO.setStatusP(client.getStatusP());
            clientDTO.settPlane(client.gettPlane());
            clientDTO.setSpeedIn(client.getSpeedIn());
            clientDTO.setSpeedOut(client.getSpeedOut());
            clientDTO.setIpAddress(client.getIpAddress());
            clientDTO.setName(client.getName());
            clientDTO.setPhone(client.getPhone());
            clientDTO.setStreetName(client.getStreetName());
            clientDTO.setHouseNumber(client.getHouseNumber());
            clientDTO.setFlatNumber(client.getFlatNumber());
            clientDTO.setMail(client.getMail());
            clientDTO.setPassword(client.getPassword());
            clientDTO.setSms(client.getSms());
            clientDTO.setGroupC(client.getGroupC());
            clientDTO.setSpeedLoc(client.getSpeedLoc());
            clientDTO.setTools(client.getTools());
            list.add(clientDTO);
        });
        return list;
    }
}
