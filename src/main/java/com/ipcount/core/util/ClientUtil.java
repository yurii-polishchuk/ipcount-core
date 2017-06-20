package com.ipcount.core.util;

import com.ipcount.core.dto.ClientDTO;
import com.ipcount.core.entity.ClientEntity;


public final class ClientUtil {
    static public ClientDTO toDTO(ClientEntity clientEntity) {
        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setId(clientEntity.getId());
        clientDTO.setStatusP(clientEntity.getStatusP());
        clientDTO.settPlane(clientEntity.gettPlane());
        clientDTO.setSpeedIn(clientEntity.getSpeedIn());
        clientDTO.setSpeedOut(clientEntity.getSpeedOut());
        clientDTO.setIpAddress(clientEntity.getIpAddress());
        clientDTO.setName(clientEntity.getName());
        clientDTO.setPhone(clientEntity.getPhone());
        clientDTO.setStreetName(clientEntity.getStreetName());
        clientDTO.setHouseNumber(clientEntity.getHouseNumber());
        clientDTO.setFlatNumber(clientEntity.getFlatNumber());
        clientDTO.setMail(clientEntity.getMail());
        clientDTO.setPassword(clientEntity.getPassword());
        clientDTO.setSms(clientEntity.getSms());
        clientDTO.setGroupC(clientEntity.getGroupC());
        clientDTO.setSpeedLoc(clientEntity.getSpeedLoc());
        clientDTO.setTools(clientEntity.getTools());
        return clientDTO;
    }

    static public ClientEntity clientDTOUpdate(ClientEntity clientEntity, ClientDTO clientDTO) {
        clientEntity.setStatusP(clientDTO.getStatusP());
        clientEntity.settPlane(clientDTO.gettPlane());
        clientEntity.setSpeedIn(clientDTO.getSpeedIn());
        clientEntity.setSpeedOut(clientDTO.getSpeedOut());
        clientEntity.setIpAddress(clientDTO.getIpAddress());
        clientEntity.setName(clientDTO.getName());
        clientEntity.setPhone(clientDTO.getPhone());
        clientEntity.setStreetName(clientDTO.getStreetName());
        clientEntity.setHouseNumber(clientDTO.getHouseNumber());
        clientEntity.setFlatNumber(clientDTO.getFlatNumber());
        clientEntity.setMail(clientDTO.getMail());
        clientEntity.setPassword(clientDTO.getPassword());
        clientEntity.setSms(clientDTO.getSms());
        clientEntity.setGroupC(clientDTO.getGroupC());
        clientEntity.setSpeedLoc(clientDTO.getSpeedLoc());
        clientEntity.setTools(clientDTO.getTools());

        return clientEntity;

    }

}
