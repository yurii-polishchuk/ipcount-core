package com.ipcount.core.util;

import com.ipcount.core.dto.ClientDTO;
import com.ipcount.core.entity.ClientEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oksana on 11-Apr-17.
 */
public final class ClientUtil {
    static public ClientDTO toDTO(ClientEntity clientEntity) {
        ClientDTO clientDTO= new ClientDTO() ;
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
}
